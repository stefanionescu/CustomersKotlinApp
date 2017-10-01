package com.app.customers.domain.getQudiniInfo

import com.app.customers.data.model.QudiniCustomersToday
import com.app.customers.domain.model.Customer

import java.util.ArrayList
import java.util.Collections
import java.util.Comparator

/**
 * Created by Stefan
 */

class ModelTransformer(private val qudiniCustomers: List<QudiniCustomersToday>) {

    private val customers = ArrayList<Customer>()

    fun getCustomers(): List<Customer> {

        for (i in qudiniCustomers.indices) {

            customers.add(Customer(qudiniCustomers[i].customer!!.emailAddress,
                    qudiniCustomers[i].customer!!.name,
                    qudiniCustomers[i].expectedTime))

        }

        Collections.sort(customers, CustomerComparator())

        return customers

    }

    inner class CustomerComparator : Comparator<Customer> {
        override fun compare(o1: Customer, o2: Customer): Int {
            return o1.expectedTime!!.compareTo(o2.expectedTime!!)
        }
    }

}
