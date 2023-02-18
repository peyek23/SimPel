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


        binding.pasienbtn.setOnClickListener {
            val intent = Intent(this, pendaftaranonline::class.java)
            startActivity(intent)
        }
        binding.pegawaibtn.setOnClickListener {
            val intent = Intent(this, loginactivity::class.java)
            startActivity(intent)

        }

        binding.disinilp.setOnClickListener {
            val intent = Intent(this, pasien2::class.java)
            startActivity(intent)
        }

    }
}