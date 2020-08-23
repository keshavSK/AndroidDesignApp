package com.developerskatta.androiddesignapp.models.data_models

class GridModel {
    var gridId: Int? = null
    var icon: Int? = null
    var name: String? = null

    constructor(gridId: Int?, icon: Int?, name: String?) {
        this.gridId = gridId
        this.icon = icon
        this.name = name
    }
}