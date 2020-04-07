package com.example.gradproject

import android.content.Intent
import android.graphics.PorterDuff
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.gradproject.base.BaseActivity

class LanguageActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)



        val englishButton:ImageView = findViewById(R.id.English_Button)
        ButtonEffect(englishButton)
        englishButton.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java);
            startActivity(intent);
            finish();
        }


        val arabicButton:ImageView = findViewById(R.id.Arabic_Button)
        ButtonEffect(arabicButton)
    }

}
