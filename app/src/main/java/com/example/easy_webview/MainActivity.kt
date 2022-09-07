package com.example.easy_webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import android.annotation.SuppressLint
import android.os.Build
import android.webkit.WebView
import androidx.annotation.RequiresApi


class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webViewSetup()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("SetJavaScriptEnabled")
    private fun webViewSetup() {
        webView = findViewById(R.id.mywebview)
        webView.webViewClient = WebViewClient()
        webView.apply {
            loadUrl("https://www.google.fr/")
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
        }
    }
}