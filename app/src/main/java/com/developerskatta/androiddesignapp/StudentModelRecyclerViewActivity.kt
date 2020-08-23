package com.developerskatta.androiddesignapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import com.developerskatta.androiddesignapp.adapters.StudentModelAdapter
import com.developerskatta.androiddesignapp.models.data_models.StudentModel

class StudentModelRecyclerViewActivity : AppCompatActivity() {
    var recyclerView: RecyclerView? = null
    var studentList = ArrayList<StudentModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_model_recycler_view)
        recyclerView = findViewById(R.id.recyclerViewStudentModel)
        //set layout manager to recyclerview
         recyclerView?.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
      //  recyclerView?.layoutManager = GridLayoutManager(this, 2, LinearLayout.VERTICAL, false)
        // create student list
        val studentModel =
            StudentModel()
        studentModel.studentName = "Megha"
        studentModel.studentLastName = "Bhutada"
        studentModel.studentEmail = "megha@gmail.com"
        studentModel.studentMobile = "1234567890"
        studentModel.studentImage = R.drawable.google_icon
        studentList.add(studentModel)
        val studentModel1 =
            StudentModel()
        studentModel1.studentName = "Rajeshri"
        studentModel1.studentLastName = "Chaudhari"
        studentModel1.studentEmail = "Rajeshri@gmail.com"
        studentModel1.studentMobile = "1234567890"
        studentModel1.studentImage = R.drawable.facebook_icon
        studentList.add(studentModel1)
        // set adapter to recyclerview
        val adapter = StudentModelAdapter(studentList)
        recyclerView?.adapter = adapter
    }

}