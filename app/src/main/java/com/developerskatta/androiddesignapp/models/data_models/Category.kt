package com.developerskatta.androiddesignapp.models.data_models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Category {
    @SerializedName("CategoryId")
    @Expose
    var categoryId: String? = null

    @SerializedName("Category")
    @Expose
    var category: String? = null

    @SerializedName("SequenceNo")
    @Expose
    var sequenceNo: String? = null

    @SerializedName("MediaUrl")
    @Expose
    var mediaUrl: String? = null

    @SerializedName("IconMediaUrl")
    @Expose
    var iconMediaUrl: String? = null

}