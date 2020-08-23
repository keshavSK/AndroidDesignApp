package com.developerskatta.androiddesignapp.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.developerskatta.androiddesignapp.ApiServices
import com.developerskatta.androiddesignapp.R
import com.developerskatta.androiddesignapp.models.responses.CategoryResponse
import com.developerskatta.androiddesignapp.models.rest_api.RestAdapterContainer
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CategoryScreen : AppCompatActivity() {
    var userId = "1"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_screen)

        val services = RestAdapterContainer.getInstance().create(ApiServices::class.java)
        val call = services.getCategories(userId)
        call.enqueue(object : Callback<CategoryResponse> {
            override fun onFailure(call: Call<CategoryResponse>, t: Throwable) {
                Log.e(TAG, "onFailure: ${t.localizedMessage}")
            }

            override fun onResponse(
                call: Call<CategoryResponse>,
                response: Response<CategoryResponse>
            ) {
                if (response.code() == 200) {
                    val categoryResponse = response.body()
                    if (categoryResponse == null) {
                        Toast.makeText(
                            this@CategoryScreen,
                            "Response not received",
                            Toast.LENGTH_LONG
                        ).show()
                        return
                    }
                    if (categoryResponse.status == 200 && categoryResponse.categories?.size!! > 0) {
                        val gson = Gson()
                        val json = gson.toJson(categoryResponse)
                        Log.d(Companion.TAG, "onResponse: $json")
                    } else {
                        Toast.makeText(
                            this@CategoryScreen,
                            "${categoryResponse.message}",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                }
            }
        })
    }

    companion object {
        private const val TAG = "CategoryScreen"
    }
}