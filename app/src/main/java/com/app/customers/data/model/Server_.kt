package com.app.customers.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Server_ {

    @SerializedName("currentBreakReason")
    @Expose
    var currentBreakReason: Any? = null
    @SerializedName("displayName")
    @Expose
    var displayName: String? = null
    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("isOnBreak")
    @Expose
    var isOnBreak: Boolean? = null
    @SerializedName("location")
    @Expose
    var location: Any? = null

}