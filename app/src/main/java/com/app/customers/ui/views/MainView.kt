package com.app.customers.ui.views

import com.app.customers.domain.model.Customer

interface MainView : View {

    fun showToast(s: String)

    fun showCustomers(l: List<Customer>)

}
