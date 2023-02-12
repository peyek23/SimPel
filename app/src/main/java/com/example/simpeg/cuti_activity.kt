package com.example.simpeg

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.webkit.WebView
import android.webkit.WebViewClient


class cuti_activity : AppCompatActivity() {

    lateinit var webView: WebView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuti)

        supportActionBar?.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        webView = findViewById(R.id.webviewcuti)
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://forms.zohopublic.com/ecutipkcdurensawit/form/ECUTIPJLPPKCDURENSAWIT2023/formperma/7RM0NtmkeLHUrJtnuvKqBphXdnbcRaqchtY0eqgC_pY")

        // web setting
        val webSettings = webView.settings

        // mengaktifkan javascript
        webSettings.javaScriptEnabled = true

        // mengaktifkan tool seperti bootstrap
        webSettings.domStorageEnabled = true
    }

    override fun onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
