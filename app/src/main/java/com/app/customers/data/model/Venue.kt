package com.app.customers.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Venue {

    @SerializedName("enableAllQueuesView")
    @Expose
    var enableAllQueuesView: Boolean? = null
    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("isBookingEnabled")
    @Expose
    var isBookingEnabled: Boolean? = null
    @SerializedName("isCustomerProfileEnabled")
    @Expose
    var isCustomerProfileEnabled: Boolean? = null
    @SerializedName("isCustomerProfileIconEnabled")
    @Expose
    var isCustomerProfileIconEnabled: Boolean? = null
    @SerializedName("isWalkinEnabled")
    @Expose
    var isWalkinEnabled: Boolean? = null
    @SerializedName("name")
    @Expose
    var name: String? = null

}