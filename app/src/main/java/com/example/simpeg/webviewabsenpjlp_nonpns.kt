package com.example.simpeg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager.LayoutParams.*
import android.webkit.WebView
import android.webkit.WebViewClient

class webviewabsenpjlp_nonpns : AppCompatActivity() {
    // deklarasikan webview
    lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)
        // menghilangkan header dan statusbar
        supportActionBar?.hide()
        window.setFlags(FLAG_FULLSCREEN, FLAG_FULLSCREEN)


        webView = findViewById(R.id.WV)
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://forms.zohopublic.com/ecutipkcdurensawit/form/DAFTARHADIRHARIANNONPNS1/formperma/YiWCU1U_RO5axlCGXgGU5CzeqNZ8v183Tu0nKjKryVk")

        // web setting
        val webSettings = webView.settings

        // mengaktifkan javascript
        webSettings.javaScriptEnabled = true

        // mengaktifkan tool seperti bootstrap
        webSettings.domStorageEnabled = true
    }

    override fun onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}