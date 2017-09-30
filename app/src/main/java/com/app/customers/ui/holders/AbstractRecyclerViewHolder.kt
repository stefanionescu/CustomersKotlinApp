package com.app.customers.ui.holders

import android.support.v7.widget.RecyclerView
import android.view.View

import butterknife.ButterKnife

abstract class AbstractRecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    init {
        ButterKnife.bind(this, itemView)
    }
}