package com.app.customers.ui.presenters

import com.app.customers.ui.views.MainView

open interface MainPresenter : Presenter<MainView> {

    fun startFetchingData()

    fun stopFetchingData()

}
