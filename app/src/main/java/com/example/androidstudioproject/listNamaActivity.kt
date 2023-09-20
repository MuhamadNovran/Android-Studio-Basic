package com.example.androidstudioproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class listNamaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_nama)

//        define array adapter
        val arrayAdapter:ArrayAdapter<*>
        val users=arrayOf(
        "Steve Smith", "Ross Taylor", "Rohit Sharma"
        )

//        deklarasi variabel listView
        var mListView: ListView = findViewById(R.id.lvNama)
//        panggil object arrayAdapter (this, layout_sample,data)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,users)

//        isi Adapter
        mListView.adapter

    }
}