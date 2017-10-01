package com.app.customers.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class QudiniCustomersToday {

    @SerializedName("bookedServer")
    @Expose
    var bookedServer: Any? = null
    @SerializedName("bookingEndTime")
    @Expose
    var bookingEndTime: Any? = null
    @SerializedName("bookingStartTime")
    @Expose
    var bookingStartTime: Any? = null
    @SerializedName("collectingServer")
    @Expose
    var collectingServer: Any? = null
    @SerializedName("currentPosition")
    @Expose
    var currentPosition: Int? = null
    @SerializedName("customer")
    @Expose
    var customer: QudiniCustomer? = null
    @SerializedName("expectedTime")
    @Expose
    var expectedTime: String? = null
    @SerializedName("hasBeenSentReturnMessage")
    @Expose
    var hasBeenSentReturnMessage: Boolean? = null
    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("inStore")
    @Expose
    var inStore: Boolean? = null
    @SerializedName("isArrived")
    @Expose
    var isArrived: Boolean? = null
    @SerializedName("isFixed")
    @Expose
    var isFixed: Boolean? = null
    @SerializedName("joinedTime")
    @Expose
    var joinedTime: String? = null
    @SerializedName("lastSMSStatus")
    @Expose
    var lastSMSStatus: Any? = null
    @SerializedName("originalExpectedTime")
    @Expose
    var originalExpectedTime: String? = null
    @SerializedName("product")
    @Expose
    var product: Product? = null
    @SerializedName("productDescription")
    @Expose
    var productDescription: Any? = null
    @SerializedName("timeArrivedInStore")
    @Expose
    var timeArrivedInStore: Any? = null
    @SerializedName("timeSentReturnMessage")
    @Expose
    var timeSentReturnMessage: Any? = null
    @SerializedName("waitTime")
    @Expose
    var waitTime: Any? = null
    @SerializedName("waitTimePercentComplete")
    @Expose
    var waitTimePercentComplete: Int? = null

}