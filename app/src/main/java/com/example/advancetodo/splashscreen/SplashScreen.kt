package com.example.advancetodo.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.advancetodo.MainActivity
import com.example.advancetodo.R

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val i = Intent(this, MainActivity::class.java)
        Handler().postDelayed({
            startActivity(i)
            finish()
        }, 1000L)
    }
}