package com.example.gradproject

import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.gradproject.base.BaseActivity
import com.example.gradproject.ui.fragments.loginFragments.SignInOne
import com.example.gradproject.ui.fragments.signUpFragments.SignUpOne

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val signUpButton:ImageView = findViewById(R.id.Sign_up_button)
        signUpButton.setOnClickListener {
            val fragment:Fragment= SignUpOne()
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container,fragment)
                .addToBackStack("")
                .commit()}

        val signInButton:ImageView = findViewById(R.id.Sign_in_button)
        ButtonEffect(signInButton)
        signInButton.setOnClickListener {
            val fragment:Fragment= SignInOne()
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container,fragment)
                .addToBackStack("")
                .commit()}
        }


}
