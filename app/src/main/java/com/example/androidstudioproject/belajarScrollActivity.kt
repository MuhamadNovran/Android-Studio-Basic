package com.example.androidstudioproject

import android.graphics.BlurMaskFilter.Blur
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import jp.wasabeef.glide.transformations.BlurTransformation

class belajarScrollActivity : AppCompatActivity() {
    var ivBackground: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.latihan_scrollview)

        ivBackground = findViewById(R.id.bakround)

        Glide.with(this)
            .load(R.drawable.avengers_landscape)
            .transform(BlurTransformation(25,3))
            .into(ivBackground!!)
    }
}