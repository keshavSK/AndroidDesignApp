package com.developerskatta.androiddesignapp.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.developerskatta.androiddesignapp.R
import com.developerskatta.androiddesignapp.models.StudentModel

// extent recyclerview adapter and create constructor
class StudentModelAdapter(var studentList: ArrayList<StudentModel>) :
    RecyclerView.Adapter<StudentModelAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindData(studentModel: StudentModel) {
            // create refreshes
            val tvStudentName = itemView.findViewById<TextView>(R.id.tvStudentName)
            val tvStudentLastName = itemView.findViewById<TextView>(R.id.tvStudentLastName)
            val tvStudentMobile = itemView.findViewById<TextView>(R.id.tvStudentMobileNumber)
            val tvStudentEmail = itemView.findViewById<TextView>(R.id.tvStudentEmailId)
            val imgStudentImage = itemView.findViewById<ImageView>(R.id.imgStudentImage)
            // set data
            tvStudentName.text = studentModel.studentName
            tvStudentLastName.text = studentModel.studentLastName
            tvStudentEmail.text = studentModel.studentEmail
            tvStudentMobile.text = studentModel.studentMobile
            imgStudentImage.setImageResource(studentModel.studentImage!!)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        // layout inflate
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_student_model_list, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        // list size
        return studentList.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        // pass student data
        viewHolder.bindData(studentList[position])
    }
}