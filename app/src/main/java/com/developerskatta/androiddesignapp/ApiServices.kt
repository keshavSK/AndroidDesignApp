package com.developerskatta.androiddesignapp

import com.developerskatta.androiddesignapp.models.responses.CategoryResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {
    @GET("api/get_categories")
    fun getCategories(@Query("userId") userId: String): Call<CategoryResponse>
}