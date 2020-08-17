package com.developerskatta.androiddesignapp.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.developerskatta.androiddesignapp.R

class StudentAdapter(val studentList: Array<String>) :
    RecyclerView.Adapter<StudentAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindData(data: String, position: Int) {
            val tvName = itemView.findViewById<TextView>(R.id.rowStudentName)
            tvName.text = "${position + 1} : $data"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.row_student_list, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return studentList.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bindData(studentList[position], position)
    }

}