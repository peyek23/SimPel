package com.example.simpeg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2

class pasien2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pasien2)

        val viewPager: ViewPager2 = findViewById(R.id.slide)
        val fragments: ArrayList<Fragment> = arrayListOf(
            klender1(),
            klender2(),
            klender3()

        )

        val adapter = viewpageradapter(fragments, this)
        viewPager.adapter = adapter


    }


}