package com.example.simpeg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.simpeg.databinding.ActivityPendaftaranonlineBinding
import com.example.simpeg.databinding.ActivityPerhatianbpjsBinding

class perhatianbpjs : AppCompatActivity() {

    private lateinit var binding: ActivityPerhatianbpjsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPerhatianbpjsBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

}