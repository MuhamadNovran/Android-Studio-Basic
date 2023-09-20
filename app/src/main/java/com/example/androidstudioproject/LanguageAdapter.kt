    package com.example.androidstudioproject

    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import android.widget.ImageView
    import android.widget.TextView
    import androidx.recyclerview.widget.RecyclerView
    import com.example.androidstudioproject.model.Language


    class LanguageAdapter(val data:ArrayList<Language>) :
        RecyclerView.Adapter<LanguageAdapter.LangueViewHolder>()
    {

        class LangueViewHolder(view: View):
        RecyclerView.ViewHolder(view){
            val tvBahasa: TextView= view.findViewById(R.id.tvBahasaPemrograman2)
            val ivLogo: ImageView= view.findViewById(R.id.ivBahasaPemrograman2)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LangueViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_list_doa,parent,false)

            return LangueViewHolder(view)
        }

        override fun getItemCount(): Int {
        return data.size
        }

        override fun onBindViewHolder(holder: LangueViewHolder, position: Int) {
            val item = data.get(position)
            holder.tvBahasa.text = item.name
            holder.ivLogo.setImageResource(item.imageView)

        }
    }