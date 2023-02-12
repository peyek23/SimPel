package com.example.simpeg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager

class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    //fullscreen
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash)
            //Splashtime
        Handler().postDelayed({
            val Intent = Intent (this@splash, landingpage::class.java)
            startActivity(Intent)
            finish()
        },2000)

    }
}