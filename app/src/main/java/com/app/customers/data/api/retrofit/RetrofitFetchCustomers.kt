package com.app.customers.data.api.retrofit

import android.content.Context
import android.util.Log

import com.app.customers.R
import com.app.customers.data.model.CustomersList
import com.app.customers.data.repository.CustomersRepository
import com.google.gson.Gson
import okhttp3.Credentials

import javax.inject.Inject
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Stefan
 */

class RetrofitFetchCustomers @Inject
constructor(val context: Context, val pass: String, val id: String)
    : CustomersRepository {

    private var retrofit: Retrofit? = null

    private var customerAPI: RetrofitCustomerService? = null

    override val customersList: CustomersList

        get() {

            val credentials = Credentials.basic(id, pass)

            val call = customerAPI!!.customers(credentials, "gj9fs")

            var callback: CustomersList? = CustomersList()

            try {

                callback = call.execute().body()

            } catch (e: KotlinNullPointerException){

              Log.e("retrofit", e.message.toString())

            } catch (e: Exception) {

            }

            return callback!!

        }

    init {

        init()

    }

    private fun init() {

        retrofit = Retrofit.Builder()
                .baseUrl(context.resources.getString(R.string.api_address))
                .addConverterFactory(GsonConverterFactory.create(Gson()))
                .build()

        customerAPI = retrofit!!.create(RetrofitCustomerService::class.java)

    }

}
