package com.example.mad_practicval_7_22172012028

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YoutubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
    }



val youtubeId="fJn9B64Znrk"
fun initYoutubePlayer()
{
    val webSettings:WebSettings = webView.settings
    webSettings.javaScriptEnabled = true
    webSettings.loadWithOverviewMode = true
    webSettings.useWideViewPort = true
    webView.loadUrl("https://www.youtube.com/embed/$youtubeId")

}
}

