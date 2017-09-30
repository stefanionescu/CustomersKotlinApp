package com.app.customers.app

import com.squareup.leakcanary.LeakCanary
import com.squareup.leakcanary.RefWatcher
import android.app.Application

class CustomersApplication : Application() {

    override fun onCreate() {

        super.onCreate()
        setupLeakCanary()

    }

    protected fun setupLeakCanary(): RefWatcher {
        return if (LeakCanary.isInAnalyzerProcess(this)) {
            RefWatcher.DISABLED
        } else LeakCanary.install(this)
    }

}
