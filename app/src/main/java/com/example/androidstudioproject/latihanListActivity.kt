package com.example.androidstudioproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class latihanListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_list)

        val arrayAdapter: ArrayAdapter<*>
        val users=arrayOf(
            "Phyton", "C#", "C++", "JavaScript", "PHP", "Swift", "Java", "Go", "SQL", "Ruby"
        )

//        deklarasi variabel listView
        var mListView: ListView = findViewById(R.id.lvBahasaPemrograman)
//        panggil object arrayAdapter (this, layout_sample,data)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,users)

//        isi Adapter
        mListView.adapter
    }
}