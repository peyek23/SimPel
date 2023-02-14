package com.example.simpeg

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.simpeg.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class loginactivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );


        firebaseAuth = FirebaseAuth.getInstance()
        binding.textdaftar.setOnClickListener {
            val intent = Intent(this, signupactivity::class.java)
            startActivity(intent)


        }

        binding.btnlogin.setOnClickListener {
            val email = binding.kolomemail.text.toString()
            val pass = binding.kolompassword.text.toString()

            if (email.isNotEmpty() && pass.isNotEmpty()) {

                firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener {
                    if (it.isSuccessful) {
                        val intent = Intent(this,MainActivity::class.java)
                        startActivity(intent)
                        finish()
                        Toast.makeText(
                            this,
                            "Berhasil masuk!", Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        Toast.makeText(this, "E-mail atau Password salah!", Toast.LENGTH_SHORT)
                            .show()

                    }
                }
            } else {
                Toast.makeText(this, "Harap isi semua kolom !", Toast.LENGTH_SHORT).show()

            }

        }
    }
}