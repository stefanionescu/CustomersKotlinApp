package com.app.customers.ui.presenters

import com.app.customers.ui.views.View

/**
 * Presenter with lifecycle
 *
 * @author stefan
 */
interface Presenter<T : View> {

    fun onResumeView()

}

