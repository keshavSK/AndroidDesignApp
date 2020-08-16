package com.developerskatta.androiddesignapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import com.developerskatta.androiddesignapp.adapters.CustomAdapter

class RecyclerViewActivity : AppCompatActivity() {
    var list = arrayOf("Android", "iOs", "Windows", "Linux", "Chrome Os")
    var recycler: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        recycler = findViewById(R.id.recyclerView)
        recycler?.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val adapter = CustomAdapter(list)
        recycler?.adapter = adapter
    }
}