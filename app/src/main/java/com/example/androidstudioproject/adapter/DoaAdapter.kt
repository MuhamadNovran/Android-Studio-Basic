package com.example.androidstudioproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidstudioproject.R
import com.example.androidstudioproject.model.Doa

class DoaAdapter (val data:ArrayList<Doa>)
    : RecyclerView.Adapter<DoaAdapter.doaViewHolder>() {

    class doaViewHolder(view: View) :
            RecyclerView.ViewHolder(view) {
        val tvDoa1: TextView = view.findViewById(R.id.tvDoa1)
        val ivDoa2: ImageView = view.findViewById(R.id.ivDoa1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaAdapter.doaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_doa, parent, false)
        return DoaAdapter.doaViewHolder(view)
    }

    override fun onBindViewHolder(holder: doaViewHolder, position: Int) {
        val item = data.get(position)
        holder.tvDoa1.text = item.nama
        holder.ivDoa2.setImageResource(item.gambar)
    }

    override fun getItemCount(): Int = data.size


}