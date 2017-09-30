package com.app.customers.ui.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import com.app.customers.R
import com.app.customers.domain.model.Customer
import com.app.customers.ui.holders.AbstractRecyclerViewHolder
import com.squareup.picasso.Picasso

import java.util.ArrayList

import butterknife.BindView

/**
 * @author Stefan
 */
class CustomerAdapter : RecyclerView.Adapter<CustomerAdapter.ViewHolder> {

    private var customers: List<Customer>? = null

    constructor() {
        customers = ArrayList()
    }

    constructor(models: List<Customer>) {
        this.customers = models
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val modelView = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_view, viewGroup, false)
        return ViewHolder(modelView)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        val customer = customers!![position]
        val gravatar: String
        val defaultEmail: String = "something@yahoo.com"

        viewHolder.expected!!.setText(customer.expectedTime)
        viewHolder.name!!.text = customer.name

        if (customer.email.length > 0){

            gravatar = "https://www.gravatar.com/avatar/" +
                    customer.email.toLowerCase().hashCode() +
                    "?s=200"

        } else
            gravatar = "https://www.gravatar.com/avatar/" +
                    defaultEmail.hashCode() +
                    "?s=200"

        Picasso.with(viewHolder.view.context)
                .load(gravatar)
                .into(viewHolder.image)

    }

    override fun getItemCount(): Int {

        return customers!!.size

    }

    inner class ViewHolder(internal var view: View) : AbstractRecyclerViewHolder(view) {

        @BindView(R.id.model_title)
        internal var name: TextView? = null
        @BindView(R.id.model_image)
        internal var image: ImageView? = null
        @BindView(R.id.expected_time)
        internal var expected: TextView? = null

    }
}