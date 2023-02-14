package com.example.simpeg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.simpeg.databinding.ActivityLayoutcutiBinding
import com.example.simpeg.databinding.ActivityMainBinding

class layoutcuti : AppCompatActivity() {

    private lateinit var binding:ActivityLayoutcutiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLayoutcutiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );


        binding.btncutipjlp.setOnClickListener {
            val intent = Intent(this, cuti_activity::class.java)
            startActivity(intent)
        }
    }
}