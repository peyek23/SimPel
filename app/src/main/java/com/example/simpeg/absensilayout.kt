package com.example.simpeg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simpeg.databinding.ActivityAbsensiBinding

class absensilayout : AppCompatActivity() {

    private lateinit var binding:ActivityAbsensiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAbsensiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //pjlp
        binding.btnabsenpjlp.setOnClickListener {
            val intent = Intent(this, webviewabsenpjlp_nonpns::class.java)
            startActivity(intent)
        }
        //nonpns
        binding.btnabsennonpns.setOnClickListener {
            val intent = Intent(this, webviewabsenpjlp_nonpns::class.java)
            startActivity(intent)
        }
        //pns
        binding.btnabsenpns.setOnClickListener {
            val intent = Intent(this, webviewabsenpns::class.java)
            startActivity(intent)
        }
    }
}