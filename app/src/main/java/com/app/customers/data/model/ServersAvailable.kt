package com.app.customers.data.model

import android.os.Parcel
import android.os.Parcelable
import android.os.Parcelable.Creator
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ServersAvailable {

    @SerializedName("isAlwaysAvailable")
    @Expose
    var isAlwaysAvailable: Boolean? = null
    @SerializedName("minutesUntilNextAvailability")
    @Expose
    var minutesUntilNextAvailability: Int? = null
    @SerializedName("nextAvailableMinutes")
    @Expose
    var nextAvailableMinutes: Int? = null
    @SerializedName("server")
    @Expose
    var server: Server_? = null

}