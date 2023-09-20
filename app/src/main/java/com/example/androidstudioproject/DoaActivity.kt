package com.example.androidstudioproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidstudioproject.adapter.DoaAdapter
import com.example.androidstudioproject.model.Doa

class DoaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa)
        val rvBahasaPemrograman: RecyclerView =
            findViewById(R.id.rvDoa)

        val selengkappnya: Button = findViewById(R.id.btnSelengkapnya)

        selengkappnya.setOnClickListener{
            val intent =Intent(this, DoaHarianActivity::class.java)
            startActivity(intent)
        }

        val data = arrayListOf<Doa>(
            Doa("Dzikir dan Doa Sunnah Setelah Sholat", R.drawable.doa_harian2),
            Doa("Dzikir Harian", R.drawable.doa_harian2),
            Doa("Dzikir dan Doa Sunnah Setelah Sholat", R.drawable.doa_harian2),
            Doa("Dzikir Setiap Saat", R.drawable.doa_harian2),
            Doa("Dzikir Setiap Pagi dan Petang", R.drawable.doa_harian2),
        )
//        buat variabel untuk menampung adapter
        val adapter = DoaAdapter(data)
//        gunakan adapter pada recycle view
        rvBahasaPemrograman.adapter = adapter
//        atur layout agar vertical
        rvBahasaPemrograman.layoutManager =
            LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false)
    }
    }
