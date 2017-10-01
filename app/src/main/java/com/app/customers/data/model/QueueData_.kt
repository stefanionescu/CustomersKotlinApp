package com.app.customers.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class QueueData_ {

    @SerializedName("currentUserRole")
    @Expose
    var currentUserRole: String? = null
    @SerializedName("customerServed")
    @Expose
    var customerServed: Any? = null
    @SerializedName("isActive")
    @Expose
    var isActive: Boolean? = null
    @SerializedName("isMyLastCustomer")
    @Expose
    var isMyLastCustomer: Boolean? = null
    @SerializedName("minutesToNextFree")
    @Expose
    var minutesToNextFree: Int? = null
    @SerializedName("queue")
    @Expose
    var queue: Queue? = null
    @SerializedName("queueLength")
    @Expose
    var queueLength: Int? = null
    @SerializedName("queueLengthBooked")
    @Expose
    var queueLengthBooked: Int? = null
    @SerializedName("queueLengthNonBooked")
    @Expose
    var queueLengthNonBooked: Int? = null
    @SerializedName("serversAvailable")
    @Expose
    var serversAvailable: List<ServersAvailable>? = null
    @SerializedName("staffAvailable")
    @Expose
    var staffAvailable: Int? = null
    @SerializedName("staffTotal")
    @Expose
    var staffTotal: Int? = null

}