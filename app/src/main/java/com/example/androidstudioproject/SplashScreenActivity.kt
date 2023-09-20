package com.example.androidstudioproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val tvJudul:TextView = findViewById(R.id.tvJudul)

        Handler().postDelayed({
            val intent = Intent(this, DoaActivity::class.java)
            startActivity(intent)
        },5000)

    }
}