package com.example.tesla

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter2(var n :ArrayList<Data>) : RecyclerView.Adapter <Adapter.viweholder>(){
    var clicklistener:((Oard)-> Unit)? = null
    inner class Viweholder(iemview : View):RecyclerView.ViewHolder(iemview){
        val tn = itemView.findViewById<TextView>(R.id.textView)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter2.Viweholder {
        val v:View = LayoutInflater.from(parent.context).inflate(R.layout.model,parent,false)
        return viweholder(v)
    }

    override fun getItemCount(): Int {
        return n.size
    }

    override fun onBindViewHolder(holder: Adapter.viweholder, position: Int) {
        val food = n[position]
        holder.tn.text = food.name
        holder.itemView.setOnClickListener {
            clicklistener?.invoke(food)

        }
    }

}