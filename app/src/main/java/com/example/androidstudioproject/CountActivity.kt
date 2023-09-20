package com.example.androidstudioproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class CountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        val tvNumber: TextView = findViewById(R.id.tvNumber)
        val btnReset: Button = findViewById(R.id.btnReset)
        val btnCount: Button = findViewById(R.id.btnCount)
        val btnMinus: Button = findViewById(R.id.btnMinus)

        tvNumber.text = "0"

        println(tvNumber.text)
        Log.d("Number", "Hasilnya: ${tvNumber.text}")

//        bikin variabel nilanya berubah
        btnReset.setOnClickListener{
            var countInteger:Int = tvNumber.text.toString().toInt()
            countInteger=0

            tvNumber.text = countInteger.toString()
        }

        btnCount.setOnClickListener{
            var countInteger:Int = tvNumber.text.toString().toInt()
            countInteger++

            tvNumber.text = countInteger.toString()
        }

        btnMinus.setOnClickListener{
            var countInteger:Int = tvNumber.text.toString().toInt()
            countInteger--

            tvNumber.text = countInteger.toString()
        }

    }
}