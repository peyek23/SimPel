package com.example.simpeg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import com.example.simpeg.databinding.ActivityMainBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity(){

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Firebase.auth.signOut()
        binding.keluarbtn.setOnClickListener {
            val intent = Intent(this, loginactivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Berhasil keluar !", Toast.LENGTH_SHORT).show()
            finish()


            setContentView(R.layout.activity_main)

        }
        binding.esarpras.setOnClickListener {
            val intent = Intent(this, esarpras::class.java)
            startActivity(intent)


        }
        binding.absenbtn.setOnClickListener {
            val intent = Intent(this, absensilayout::class.java)
            startActivity(intent)

        }
        binding.cutibtn.setOnClickListener {
            val intent = Intent(this, layoutcuti::class.java)
            startActivity(intent)
        }
        binding.gajibtn.setOnClickListener {
            val intent = Intent(this, kinerja::class.java)
            startActivity(intent)
        }
        binding.lainnyabtn.setOnClickListener {
            val intent = Intent(this, absen::class.java)
            startActivity(intent)
        }
    }
}
