package com.developerskatta.androiddesignapp.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.developerskatta.androiddesignapp.R
import com.developerskatta.androiddesignapp.models.GridModel

class GridAdapter(val gridList: ArrayList<GridModel>) :
    RecyclerView.Adapter<GridAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView = itemView.findViewById<ImageView>(R.id.imgGridImage)
        val tvName = itemView.findViewById<TextView>(R.id.tvGridName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_gridview, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return gridList.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.tvName.text = gridList[position].name
        viewHolder.imageView.setImageResource(gridList[position].icon!!)
    }
}