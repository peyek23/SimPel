package com.example.simpeg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simpeg.databinding.ActivityPklklender1Binding
import com.example.simpeg.databinding.ActivityPklklender2Binding

class pklklender2 : AppCompatActivity() {

    private lateinit var binding: ActivityPklklender2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPklklender2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bpjsditolak.setOnClickListener {
            val intent = Intent(this, bpjsditolak::class.java)
            startActivity(intent)
        }
    }
}