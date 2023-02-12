package com.example.simpeg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.simpeg.databinding.ActivityLandingpageBinding
import com.example.simpeg.databinding.ActivityMainBinding

class landingpage : AppCompatActivity() {


    private lateinit var binding: ActivityLandingpageBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandingpageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        binding.pasienbtn.setOnClickListener {
            val intent = Intent(this, pasien::class.java)
            startActivity(intent)
        }
        binding.pegawaibtn.setOnClickListener {
            val intent = Intent(this, loginactivity::class.java)
            startActivity(intent)

        }

        binding.disinilp.setOnClickListener {
            val intent = Intent(this, bantuan::class.java)
            startActivity(intent)
        }

    }
}