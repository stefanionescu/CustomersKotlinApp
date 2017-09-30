package com.app.customers.ui.views

import com.app.customers.data.model.CustomersList

interface MainView : View {

    fun showToast(s: String)

    fun showCustomersList(o: CustomersList)

}
