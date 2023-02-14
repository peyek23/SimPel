package com.example.simpeg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.simpeg.databinding.ActivityLoginBinding
import com.example.simpeg.databinding.ActivityPasienBinding

class pasien : AppCompatActivity() {

    private lateinit var binding: ActivityPasienBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPasienBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        binding.pendaftaranbtn.setOnClickListener {
            val intent = Intent(this, pendaftaranonline::class.java)
            startActivity(intent)
        }
        binding.disinilp.setOnClickListener {
            val intent = Intent(this, bantuan::class.java)
            startActivity(intent)
        }
        binding.pengajuanbpjsbtn.setOnClickListener {
            val intent = Intent(this, daftarpuskesbpjs::class.java)
            startActivity(intent)
        }
    }

}