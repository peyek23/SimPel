package com.example.simpeg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.simpeg.databinding.ActivityPasienBinding
import com.example.simpeg.databinding.ActivityPendaftaranonlineBinding
import java.util.Timer
import java.util.TimerTask

class pendaftaranonline : AppCompatActivity() {

    private lateinit var binding: ActivityPendaftaranonlineBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPendaftaranonlineBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.kld1klik.setOnClickListener {
            val intent = Intent(this, pklklender1::class.java)
            startActivity(intent)
        }
        binding.kld2klik.setOnClickListener {
            val intent = Intent(this, pklklender2::class.java)
            startActivity(intent)
        }

        binding.kld3klik.setOnClickListener {
            val intent = Intent(this, pklklender3::class.java)
            startActivity(intent)
        }
        binding.informasi1.setOnClickListener {
            val intent = Intent(this, informasi1::class.java)
            startActivity(intent)
        }
        binding.informasi2.setOnClickListener {
            val intent = Intent(this, informasi2::class.java)
            startActivity(intent)
        }
        binding.artikel1.setOnClickListener {
            val intent = Intent(this, artikel1::class.java)
            startActivity(intent)
        }
        binding.tandatanya.setOnClickListener {
            val intent = Intent(this, tandatanya::class.java)
            startActivity(intent)
        }

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(
            SlideModel(
                "https://www.pkcdurensawit.com/img/0001.jpeg",
                "Kepala Puskesmas Kecamatan Duren Sawit : Sunersi Handayani SKM.MKM"
            )
        )
        imageList.add(
            SlideModel(
                "https://www.pkcdurensawit.com/img/0002.jpg",
                "Kepala Sub Bagian Tata Usaha : Saulas Donater Rosdiana"
            )
        )
        imageList.add(
            SlideModel(
                "https://www.pkcdurensawit.com/img/0003.jpeg",
                "Kepala Satuan Pelaksana UKM : dr. Dina Wijayanti"
            )
        )
        imageList.add(
            SlideModel(
                "https://www.pkcdurensawit.com/img/0004.jpeg",
                "Kepala Satuan Pelaksana UKP: dr. Farhannuddin"
            )
        )

        imageSlider.setImageList(imageList, ScaleTypes.FIT)
    }
    }

