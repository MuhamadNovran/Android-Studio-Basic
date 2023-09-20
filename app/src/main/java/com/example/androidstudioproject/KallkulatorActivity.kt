package com.example.androidstudioproject

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class KallkulatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kallkulator)

        val inputAngka1: TextView = findViewById(R.id.inputAngka1)
        val inputAngka2: TextView = findViewById(R.id.inputAngka2)
        val tambah: Button = findViewById(R.id.btnTambah)
        val kurang: Button = findViewById(R.id.btnKurang)
        val persen: Button = findViewById(R.id.btnPersen)
        val kali: Button = findViewById(R.id.btnKali)
        val bagi: Button = findViewById(R.id.btnBagi)
        val btnC: Button = findViewById(R.id.btnC)
        val hasil: TextView = findViewById(R.id.hasil)

        val builder: AlertDialog.Builder =
            AlertDialog.Builder(this@KallkulatorActivity)


//        bikin variabel nilanya berubah
        tambah.setOnClickListener {
            var countInteger: Int =
                inputAngka1.text.toString().toInt() + inputAngka2.text.toString().toInt()
            hasil.text = countInteger.toString()
        }

        kurang.setOnClickListener {
            var countInteger: Int =
                inputAngka1.text.toString().toInt() - inputAngka2.text.toString().toInt()
            hasil.text = countInteger.toString()
        }

        persen.setOnClickListener {
            var countInteger: Int =
                inputAngka1.text.toString().toInt() % inputAngka2.text.toString().toInt()
            hasil.text = countInteger.toString()
        }

        kali.setOnClickListener {
            var countInteger: Int =
                inputAngka1.text.toString().toInt() * inputAngka2.text.toString().toInt()
            hasil.text = countInteger.toString()
        }

        bagi.setOnClickListener {
            var countInteger: Float =
                inputAngka1.text.toString().toFloat() / inputAngka2.text.toString().toFloat()
            hasil.text = countInteger.toString()
        }

        btnC.setOnClickListener {

            builder.setTitle("Perhatian!")
            builder.setMessage("Serius Lu?")
            builder.setCancelable(false)

            builder.setPositiveButton("Heeuh", DialogInterface.OnClickListener { dialog, which ->
            hasil.text = "0"
            inputAngka1.setText("")
            inputAngka2.setText("") })

            builder.setNegativeButton("Teu Jadi", DialogInterface.OnClickListener{dialog, which -> })
            builder.setIcon(R.drawable.baseline_info_24)

//            agar pop up dibuat
            val alertDialog:AlertDialog=builder.create()
//            untuk menampilkan pop up gunakan fungsi show
            alertDialog.show()
        }
    }
}