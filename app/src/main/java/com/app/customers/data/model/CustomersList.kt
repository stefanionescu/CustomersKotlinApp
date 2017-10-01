package com.app.customers.data.model

import android.os.Parcel
import android.os.Parcelable
import android.os.Parcelable.Creator
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class CustomersList {

    @SerializedName("queueData")
    @Expose
    var queueData: QueueData_? = null
    @SerializedName("status")
    @Expose
    var status: String? = null

}