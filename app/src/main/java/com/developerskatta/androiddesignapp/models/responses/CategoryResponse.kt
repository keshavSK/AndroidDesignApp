package com.developerskatta.androiddesignapp.models.responses

import com.developerskatta.androiddesignapp.models.data_models.Category
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class CategoryResponse {
    @SerializedName("status")
    @Expose
    var status: Int? = null

    @SerializedName("Message")
    @Expose
    var message: String? = null

    @SerializedName("CartCount")
    @Expose
    var cartCount: String? = null

    @SerializedName("Categories")
    @Expose
    var categories: List<Category>? = null

}