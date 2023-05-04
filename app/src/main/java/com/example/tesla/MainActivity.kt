package com.example.tesla

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.layoutManager = GridLayoutManager(this,2)
        val data =lo.nlist
        var adapter = Adapter(data)
        recyclerView.adapter = adapter
        adapter.clicklistener ={
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("برد" , it )
            startActivity(intent)
        }
    }
}