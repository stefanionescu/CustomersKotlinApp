package com.app.customers.ui.presenters

import android.content.Context

import com.app.customers.data.model.QudiniCustomersToday
import com.app.customers.domain.getQudiniInfo.GetCustomers
import com.app.customers.domain.model.Customer
import com.app.customers.executor.reactive.DefaultObserver
import com.app.customers.ui.views.MainView
import java.util.Timer
import java.util.TimerTask

import javax.inject.Inject

/**
 * Created by Stefan
 */

class MainPresenterImp @Inject
constructor(internal var context: Context,
            internal var getCustomers: GetCustomers,
            internal var view: MainView?)
            : MainPresenter {

    internal var timer: Timer? = null
    internal lateinit var timerTask: TimerTask

    init {

        initTimerTask()

    }

    override fun startFetchingData() {

        if (timer != null) {
            return
        }

        timer = Timer()

        timer!!.scheduleAtFixedRate(timerTask, 0, (30 * 1000).toLong())

    }

    override fun stopFetchingData() {

        timer!!.cancel()
        timer = null

        view = null

    }

    override fun onResumeView() {

    }

    private inner class UserListObserver : DefaultObserver<List<Customer>>() {

        override fun onComplete() {}

        override fun onError(e: Throwable) {

        }

        override fun onNext(customers: List<Customer>) {

            if (customers != null && customers.size > 0)

                view!!.showCustomers(customers)

        }
    }

    private fun initTimerTask() {

        timerTask = object : TimerTask() {

            override fun run() {

                getCustomers.execute(UserListObserver(), null)

            }
        }

    }

}
