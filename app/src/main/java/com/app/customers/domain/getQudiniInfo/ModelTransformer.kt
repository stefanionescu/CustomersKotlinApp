package com.app.customers.domain.getQudiniInfo

import com.app.customers.data.model.QudiniCustomersToday
import com.app.customers.domain.model.Customer

import java.util.Collections
import java.util.Comparator

/**
 * Created by Stefan
 */

class ModelTransformer(private val qudiniCustomers: List<QudiniCustomersToday>) {

    private val customers: MutableList<Customer>? = null

    fun getCustomers(): List<Customer> {

        for (i in qudiniCustomers.indices) {

            customers!!.add(Customer(qudiniCustomers[i].qudiniCustomer!!.emailAddress!!,
                    qudiniCustomers[i].qudiniCustomer!!.name!!,
                    Integer.parseInt(qudiniCustomers[i].expectedTime)))

        }

        Collections.sort(customers!!, CustomerComparator())

        return customers

    }

    inner class CustomerComparator : Comparator<Customer> {
        override fun compare(o1: Customer, o2: Customer): Int {
            return o1.expectedTime - o2.expectedTime
        }
    }

}
