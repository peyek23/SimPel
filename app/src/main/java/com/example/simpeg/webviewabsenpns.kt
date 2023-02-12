package com.example.simpeg

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.webkit.WebView
import android.webkit.WebViewClient

class webviewabsenpns : AppCompatActivity() {
    lateinit var webviewabsenlayout: WebView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webviewabsenpns)

        supportActionBar?.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )


        webviewabsenlayout = findViewById(R.id.webviewabsenpnslayout)
        webviewabsenlayout.webViewClient = WebViewClient()
        webviewabsenlayout.loadUrl("https://forms.zohopublic.com/ecutipkcdurensawit/form/DAFTARHADIRHARIANPNS1/formperma/JfxRFZDUFygF8RJCRj9zVazKv5747g8SuiFjGBpdshA")

        // web setting
        val webSettings = webviewabsenlayout.settings

        // mengaktifkan javascript
        webSettings.javaScriptEnabled = true

        // mengaktifkan tool seperti bootstrap
        webSettings.domStorageEnabled = true
    }

    override fun onBackPressed() {
        if (webviewabsenlayout.canGoBack()) {
            webviewabsenlayout.goBack()
        } else {
            super.onBackPressed()
        }
    }
}