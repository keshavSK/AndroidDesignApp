package com.developerskatta.androiddesignapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView

class StudentDetailsActivity : AppCompatActivity() {
    var emailId: TextView? = null
    var studentEmail = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_details)
        emailId = findViewById(R.id.tvStudentDetailsEmail)
        var intent = intent.extras
        studentEmail = intent!!.getString("email", "No email id found")
        var mobile = intent.getString("mobile")
        var name = intent.getString("name")
        Log.e("StudentDetailsActivity", "Mobile: $mobile")
        Log.e("StudentDetailsActivity", "Name: $name")
        emailId?.text = studentEmail
    }
}