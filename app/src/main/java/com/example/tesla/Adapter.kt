package com.example.tesla

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(var n :ArrayList<Oard>) : RecyclerView.Adapter <Adapter.viweholder>(){
        var clicklistener:((Oard)-> Unit)? = null
    inner class viweholder(iemview : View):RecyclerView.ViewHolder(iemview){
        val tn = itemView.findViewById<TextView>(R.id.textView)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.viweholder {
        val v:View = LayoutInflater.from(parent.context).inflate(R.layout.model,parent,false)
        return viweholder(v)
    }

    override fun onBindViewHolder(holder: viweholder, position: Int) {
        val food = n[position]
        holder.tn.text = food.name
        holder.itemView.setOnClickListener {
            clicklistener?.invoke(food)

        }
    }

    override fun getItemCount(): Int {
        return n.size
    }

}