package com.example.androidstudioproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidstudioproject.model.Language

class ListPemrogramanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_pemrograman)
        val rvBahasaPemrograman: RecyclerView =
            findViewById(R.id.rvBahasaPemrograman)
        val data = arrayListOf<Language>(
        Language("Golang", R.drawable.golang),
        Language("C++", R.drawable.cplus),
        Language("Python", R.drawable.python),
        Language("Golang", R.drawable.golang),
        Language("C++", R.drawable.cplus),
        Language("Phyton", R.drawable.python),
        Language("Golang", R.drawable.golang),
        Language("C++", R.drawable.cplus),
        Language("Phyton", R.drawable.python)
        )
//        buat variabel untuk menampung adapter
        val adapter = LanguageAdapter(data)
//        gunakan adapter pada recycle view
        rvBahasaPemrograman.adapter = adapter
//        atur layout agar vertical
        rvBahasaPemrograman.layoutManager =
            LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)
    }
}