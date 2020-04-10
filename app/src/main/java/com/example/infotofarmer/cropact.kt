package com.example.infotofarmer

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_schemesact.*

class cropact : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cropact)

        if(webView!= null){
            val webSettings = webView!!.settings
            webSettings.javaScriptEnabled =true

            webView!!.webViewClient= WebViewClient()
            webView!!.webChromeClient= WebChromeClient()
            webView!!.loadUrl("https://en.wikipedia.org/wiki/List_of_most_valuable_crops_and_livestock_products")

            webView!!.webViewClient= object : WebViewClient(){
                override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                    super.onPageStarted(view, url, favicon)
                }

                override fun onPageFinished(view: WebView?, url: String?) {
                    super.onPageFinished(view, url)
                }
            }
        }
    }

    override fun onBackPressed() {
        if (webView!!.canGoBack()){
            webView!!.goBack()
        }
        else {
            super.onBackPressed()
        }

    }
}
