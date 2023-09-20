package com.example.androidstudioproject.adapter

import android.icu.text.Transliterator.Position
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.androidstudioproject.R
import com.example.androidstudioproject.model.Language

class LanguageAdapter (val data:ArrayList<Language>)
    : RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>() {
    class LanguageViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {
        val tvBahasaPemrograman: TextView = view.findViewById(R.id.tvBahasaPemrograman2)
        val ivBahasaPemrograman: ImageView = view.findViewById(R.id.ivBahasaPemrograman2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_bahasa_pemrograman2, parent, false)
        return LanguageAdapter.LanguageViewHolder(view)
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        val item = data.get(position)
        holder.tvBahasaPemrograman.text = item.name
        holder.ivBahasaPemrograman.setImageResource(item.imageView)
    }

    override fun getItemCount(): Int = data.size
}