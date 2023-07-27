package com.example.hw_5_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_5_3.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.container,StartFragment()).commit()
    }
}
