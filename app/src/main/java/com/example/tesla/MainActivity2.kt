package com.example.tesla

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val oard = intent.getParcelableExtra<Oard>("برد")
        if(oard != null){
          val textview: TextView = findViewById(R.id.textView)


            textview.text = oard.name

        }
        val data = lo.nlist

        recyclerView.layoutManager = GridLayoutManager(this,2)
        var adapter = Adapter2(data)
        recyclerView.adapter = adapter
        adapter.clicklistener ={
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("برد" , it )
            startActivity(intent)
    }
}