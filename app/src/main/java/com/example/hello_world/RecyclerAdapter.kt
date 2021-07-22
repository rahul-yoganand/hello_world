package com.example.hello_world

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
var data= arrayListOf<String>("India","Aus","Ireland","Newzealand","Bangladesh","Srilanka","England","South Africa","Pakistan","Zimbabewe","West Indies")

class RecyclerAdapter :RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val v=LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvRecy.text=data[position]


    }

    override fun getItemCount(): Int {
        return data.size
    }
    class ViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView){
        var tvRecy:TextView
        init {
            tvRecy= itemView.findViewById(R.id.single_card)
        }



    }
}