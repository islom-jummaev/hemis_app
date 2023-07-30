package com.example.hemisapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mWebView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mWebView = findViewById(R.id.webview)
        mWebView.loadUrl("https://student.tdtutf.uz/dashboard/login")
        val webSetting = mWebView.settings
        webSetting.javaScriptEnabled = true
        mWebView.webViewClient = WebViewClient()

    }

    override fun onBackPressed() {
        if (mWebView.canGoBack()){
            mWebView.goBack()
        }else{
            super.onBackPressed()
        }
    }
}