package com.example.simpeg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simpeg.databinding.ActivityLayoutcutiBinding
import com.example.simpeg.databinding.ActivityMainBinding

class layoutcuti : AppCompatActivity() {

    private lateinit var binding:ActivityLayoutcutiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLayoutcutiBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btncutipjlp.setOnClickListener {
            val intent = Intent(this, cuti_activity::class.java)
            startActivity(intent)
        }
    }
}