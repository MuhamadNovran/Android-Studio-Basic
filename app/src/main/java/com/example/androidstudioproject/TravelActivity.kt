package com.example.androidstudioproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TravelActivity : AppCompatActivity() {

    var ibCall: ImageButton? = null
    var ibNavigate: ImageButton? = null
    var ibShare: ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)
//        isi pakai findViewById(ambilID)
        ibCall = findViewById(R.id.ibCall)
        ibNavigate = findViewById(R.id.ibNavigate)
        ibShare = findViewById(R.id.ibShare)

//        event onClick
        ibCall!!.setOnClickListener{
//            parameter intent untuk telepon Intent.ACTION_DIAL
            val phonenNumber="025123122"
            val phoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel: $phonenNumber"))
//            jalankan Intent
            startActivity(phoneIntent)
        }
        ibNavigate!!.setOnClickListener{
            val mapIntent = Intent(Intent.ACTION_VIEW,
            Uri.parse("geo:-6.583046899102753, 106.76771431166551")
            )
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }

    }
}