package com.example.simpeg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simpeg.databinding.ActivityPendaftaranonlineBinding
import com.example.simpeg.databinding.ActivityPerhatianbpjsBinding
import com.example.simpeg.databinding.ActivityPklklender1Binding

class pklklender1 : AppCompatActivity() {

    private lateinit var binding: ActivityPklklender1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPklklender1Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.perhatianbpjs.setOnClickListener {
            val intent = Intent(this, perhatianbpjs::class.java)
            startActivity(intent)
        }
        binding.bpjsditolak.setOnClickListener {
            val intent = Intent(this, bpjsditolak::class.java)
            startActivity(intent)
        }
    }
}