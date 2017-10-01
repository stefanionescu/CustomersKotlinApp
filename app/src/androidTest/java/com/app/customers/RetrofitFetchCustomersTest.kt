package com.app.customers

import android.content.Context
import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

import com.app.customers.data.api.retrofit.RetrofitFetchCustomers
import com.app.customers.data.model.CustomersList

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

@RunWith(AndroidJUnit4::class)
class RetrofitFetchCustomersTest {

    private var fetchCustomers: RetrofitFetchCustomers? = null
    private var appContext: Context? = null

    @Before
    @Throws(Exception::class)
    fun setUp() {

        appContext = InstrumentationRegistry.getTargetContext()

        fetchCustomers = RetrofitFetchCustomers(appContext!!, "codetest1", "codetest100")

    }

    @Test
    @Throws(Exception::class)
    fun testGetCustomers() {

        val customersList = fetchCustomers!!.customersList

        assertTrue(customersList != null)

    }

}
