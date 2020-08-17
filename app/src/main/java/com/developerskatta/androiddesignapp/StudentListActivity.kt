package com.developerskatta.androiddesignapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import com.developerskatta.androiddesignapp.adapters.StudentAdapter

class StudentListActivity : AppCompatActivity() {
    var recyclerView: RecyclerView? = null
    var studentList = arrayOf("Anjali", "Rajeshri", "Megha", "Tushar")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_list)
        recyclerView = findViewById(R.id.studentRecyclerView)
        recyclerView!!.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val adapter = StudentAdapter(studentList)
        recyclerView?.adapter = adapter
    }
}