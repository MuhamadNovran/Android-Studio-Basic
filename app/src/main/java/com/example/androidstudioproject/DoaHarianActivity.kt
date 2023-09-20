package com.example.androidstudioproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidstudioproject.adapter.DoaAdapter
import com.example.androidstudioproject.adapter.DoaHarianAdapter
import com.example.androidstudioproject.model.Doa
import com.example.androidstudioproject.model.Doa_Harian

class DoaHarianActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)
        val rvBahasaPemrograman: RecyclerView =
            findViewById(R.id.rvDoaHarian)
        val data = arrayListOf<Doa_Harian>(
            Doa_Harian("Doa Bangun Tidur","اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ","Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru"),
            Doa_Harian("Doa Sebelum Makan","اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ", "Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar"),
            Doa_Harian("Doa Sesudah Makan", "اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَ", "Alhamdu lillaahil ladzii ath'amanaa wa saqoonaa wa ja'alnaa muslimiin"),
            Doa_Harian("Doa Bangun Tidur","اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ","Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru"),
            Doa_Harian("Doa Sebelum Makan","اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ", "Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar"),
            Doa_Harian("Doa Sesudah Makan", "اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَ", "Alhamdu lillaahil ladzii ath'amanaa wa saqoonaa wa ja'alnaa muslimiin"))


//        buat variabel untuk menampung adapter
        val adapter = DoaHarianAdapter(data)
//        gunakan adapter pada recycle view
        rvBahasaPemrograman.adapter = adapter
//        atur layout agar vertical
        rvBahasaPemrograman.layoutManager =
            LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false)
    }
}