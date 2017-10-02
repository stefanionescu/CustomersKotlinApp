package com.app.customers.data.api.retrofit

import com.app.customers.data.model.CustomersList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

/**
 * Created by Stefan
 */

interface RetrofitCustomerService {

    @GET("/api/queue/{queueId}")
    fun customers(@Header("Authorization") auth: String,
                  @Path("queueId") queueId: String): Call<CustomersList>

}
