package com.example.gradproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.content.ContextCompat.startActivity

class splashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        StartNewActivity()
    }

    private fun StartNewActivity() {
        val handler = Handler();
        handler.postDelayed(Runnable {
            val intent = Intent(this,LanguageActivity::class.java);
            startActivity(intent);
            finish();
        },4000)
    }

}
