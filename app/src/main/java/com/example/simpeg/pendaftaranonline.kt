package com.example.simpeg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.simpeg.databinding.ActivityPasienBinding
import com.example.simpeg.databinding.ActivityPendaftaranonlineBinding

class pendaftaranonline : AppCompatActivity() {

    private lateinit var binding: ActivityPendaftaranonlineBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPendaftaranonlineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );


        binding.disinilp.setOnClickListener {
            val intent = Intent(this, bantuan::class.java)
            startActivity(intent)
        }

    }
}