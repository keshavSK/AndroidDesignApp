package com.developerskatta.androiddesignapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import com.developerskatta.androiddesignapp.adapters.GridAdapter
import com.developerskatta.androiddesignapp.models.data_models.GridModel

class GridRecyclerViewActivity : AppCompatActivity() {
    var recyclerView: RecyclerView? = null
    var gridList = ArrayList<GridModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_recycler_view)
        recyclerView = findViewById(R.id.gridRecyclerView)
        // set layout manager
        recyclerView?.layoutManager = GridLayoutManager(this, 2, LinearLayout.VERTICAL, false)
        // insert data in list
        gridList.add(
            GridModel(
                1,
                R.drawable.google_plus,
                "Google Plus"
            )
        )
        gridList.add(
            GridModel(
                2,
                R.drawable.facebook,
                "Facebook"
            )
        )
        gridList.add(
            GridModel(
                3,
                R.drawable.youtube,
                "YouTube"
            )
        )
        gridList.add(
            GridModel(
                4,
                R.drawable.twitter,
                "Twitter"
            )
        )
        gridList.add(
            GridModel(
                5,
                R.drawable.linkedin,
                "LinkedIn"
            )
        )
        gridList.add(
            GridModel(
                6,
                R.drawable.skype,
                "Skype"
            )
        )
        gridList.add(
            GridModel(
                7,
                R.drawable.nature,
                "Nature"
            )
        )

        // create recyclerview adapter
        val adapter = GridAdapter(gridList)
        recyclerView?.adapter = adapter
    }
}