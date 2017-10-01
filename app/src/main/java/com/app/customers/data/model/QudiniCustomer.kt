package com.app.customers.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class QudiniCustomer {

    @SerializedName("bookingRef")
    @Expose
    var bookingRef: String? = null
    @SerializedName("createdBy")
    @Expose
    var createdBy: CreatedBy? = null
    @SerializedName("customerProfile")
    @Expose
    var customerProfile: Any? = null
    @SerializedName("emailAddress")
    @Expose
    var emailAddress: String? = null
    @SerializedName("firstName")
    @Expose
    var firstName: String? = null
    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("isInMultipleQueue")
    @Expose
    var isInMultipleQueue: Any? = null
    @SerializedName("language")
    @Expose
    var language: Language? = null
    @SerializedName("merchantCustomer")
    @Expose
    var merchantCustomer: QudiniMerchantCustomer? = null
    @SerializedName("mobileNetwork")
    @Expose
    var mobileNetwork: Any? = null
    @SerializedName("mobileNumber")
    @Expose
    var mobileNumber: String? = null
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("notes")
    @Expose
    var notes: String? = null
    @SerializedName("numberCountryCode")
    @Expose
    var numberCountryCode: String? = null
    @SerializedName("orderNumber")
    @Expose
    var orderNumber: Any? = null
    @SerializedName("pagerNumber")
    @Expose
    var pagerNumber: Any? = null
    @SerializedName("surname")
    @Expose
    var surname: String? = null
    @SerializedName("ticketNumber")
    @Expose
    var ticketNumber: String? = null
    @SerializedName("unreadMessages")
    @Expose
    var unreadMessages: Int? = null

}