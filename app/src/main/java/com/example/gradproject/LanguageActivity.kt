package com.example.gradproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LanguageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)

        val englishButton:Button = findViewById(R.id.English_Button)
        englishButton.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java);
            startActivity(intent);
            finish();
        }
        val arabicButton:Button = findViewById(R.id.Arabic_Button)

    }



}
