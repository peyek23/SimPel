package com.example.simpeg

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter.LengthFilter
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.simpeg.databinding.ActivitySignupactivityBinding
import com.google.firebase.auth.FirebaseAuth

class signupactivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignupactivityBinding
    private lateinit var firebaseAuth: FirebaseAuth

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




        binding = ActivitySignupactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.textView.setOnClickListener {
            val intent = Intent(this, loginactivity::class.java)
            startActivity(intent)
        }
        binding.btnsubmitdaftar.setOnClickListener {
            val email = binding.kolomemaildaftar.text.toString()
            val pass = binding.kolompassworddaftar.text.toString()
            val confirmPass = binding.tulisulang.text.toString()


                if (email.isNotEmpty() && pass.isNotEmpty() && confirmPass.isNotEmpty()) {
                    if (pass == confirmPass) {

                        firebaseAuth.createUserWithEmailAndPassword(email, pass)
                            .addOnCompleteListener {
                                if (it.isSuccessful) {
                                    val intent = Intent(this, loginactivity::class.java)
                                    startActivity(intent)
                                    Toast.makeText(
                                        this,
                                        "Berhasil daftar!", Toast.LENGTH_SHORT).show()
                                } else {
                                    Toast.makeText(
                                        this,
                                        "E-mail sudah terdaftar!", Toast.LENGTH_SHORT).show()
                                }
                            }
                    } else {
                        Toast.makeText(this, "Password tidak sesuai ", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(this, "Harap isi semua kolom !", Toast.LENGTH_SHORT).show()

                }
            }
        }
    }


