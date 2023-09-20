package com.example.androidstudioproject

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val juduForm:TextView = findViewById(R.id.judulForm)
        val labelNama:TextView = findViewById(R.id.labelNama)
        val labelKelas:TextView = findViewById(R.id.labelKelas)
        val labelKodeKelas:TextView = findViewById(R.id.labelKodeBuku)

        val inputNama:EditText = findViewById(R.id.inputNama)
        val inputKelas:EditText = findViewById(R.id.inputKelas)
        val inputKodeKelas:EditText = findViewById(R.id.inputKodeKelas)

        val btnsubmit:Button = findViewById(R.id.btnsubmit)

        btnsubmit.setOnClickListener{
            Toast.makeText( this, "Hello ${inputNama.text}",
                    Toast.LENGTH_SHORT).show()
        }
    }
}