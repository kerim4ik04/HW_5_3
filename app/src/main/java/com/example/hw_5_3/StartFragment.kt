package com.example.hw_5_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_5_3.databinding.FragmentStartBinding

class StartFragment : Fragment() {
    private lateinit var binding: FragmentStartBinding
    private var number = 0



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStartBinding.inflate(inflater,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            btnOne.setOnClickListener {
                number++
                textView.text = number.toString()
               if (textView.text.toString() == "10"){
                   btnOne.text = "-1"
                   btnOne.setOnClickListener{
                       number--
                       textView.text = number.toString()
                       if (textView.text.toString()== "0"){
                        val bundle = Bundle()
                           bundle.putString("kerim",textView.text.toString())
                           val endFragment = EndFragment()
                           endFragment.arguments = bundle
                           requireActivity().supportFragmentManager.beginTransaction().replace(R.id.container,endFragment).addToBackStack(null).commit()
                       }
                   }
               }
            }
        }
    }
}