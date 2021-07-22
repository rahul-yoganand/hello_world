package com.example.hello_world

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private var layoutManager :RecyclerView.LayoutManager?=null
private var adapter :RecyclerView.Adapter<RecyclerAdapter.ViewHolder>?=null
class RecyclerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        layoutManager=LinearLayoutManager(this,)
        var recyclerView : RecyclerView =findViewById(R.id.recycler)
        recyclerView.layoutManager = layoutManager
        adapter=RecyclerAdapter()
        recyclerView.adapter= adapter



    }
}