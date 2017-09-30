package com.app.customers.data.model

import android.os.Parcel
import android.os.Parcelable
import android.os.Parcelable.Creator
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Venue : Parcelable {

    @SerializedName("enableAllQueuesView")
    @Expose
    var isEnableAllQueuesView: Boolean = false
    @SerializedName("id")
    @Expose
    var id: Int = 0
    @SerializedName("isBookingEnabled")
    @Expose
    var isIsBookingEnabled: Boolean = false
    @SerializedName("isCustomerProfileEnabled")
    @Expose
    var isIsCustomerProfileEnabled: Boolean = false
    @SerializedName("isCustomerProfileIconEnabled")
    @Expose
    var isIsCustomerProfileIconEnabled: Boolean = false
    @SerializedName("isWalkinEnabled")
    @Expose
    var isIsWalkinEnabled: Boolean = false
    @SerializedName("name")
    @Expose
    var name: String? = null

    protected constructor(`in`: Parcel) {
        this.isEnableAllQueuesView = `in`.readValue(Boolean::class.javaPrimitiveType!!.classLoader) as Boolean
        this.id = `in`.readValue(Int::class.javaPrimitiveType!!.classLoader) as Int
        this.isIsBookingEnabled = `in`.readValue(Boolean::class.javaPrimitiveType!!.classLoader) as Boolean
        this.isIsCustomerProfileEnabled = `in`.readValue(Boolean::class.javaPrimitiveType!!.classLoader) as Boolean
        this.isIsCustomerProfileIconEnabled = `in`.readValue(Boolean::class.javaPrimitiveType!!.classLoader) as Boolean
        this.isIsWalkinEnabled = `in`.readValue(Boolean::class.javaPrimitiveType!!.classLoader) as Boolean
        this.name = `in`.readValue(String::class.java.classLoader) as String
    }

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}

    constructor(enableAllQueuesView: Boolean, id: Int, isBookingEnabled: Boolean, isCustomerProfileEnabled: Boolean, isCustomerProfileIconEnabled: Boolean, isWalkinEnabled: Boolean, name: String) : super() {
        this.isEnableAllQueuesView = enableAllQueuesView
        this.id = id
        this.isIsBookingEnabled = isBookingEnabled
        this.isIsCustomerProfileEnabled = isCustomerProfileEnabled
        this.isIsCustomerProfileIconEnabled = isCustomerProfileIconEnabled
        this.isIsWalkinEnabled = isWalkinEnabled
        this.name = name
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeValue(isEnableAllQueuesView)
        dest.writeValue(id)
        dest.writeValue(isIsBookingEnabled)
        dest.writeValue(isIsCustomerProfileEnabled)
        dest.writeValue(isIsCustomerProfileIconEnabled)
        dest.writeValue(isIsWalkinEnabled)
        dest.writeValue(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        val CREATOR: Parcelable.Creator<Venue> = object : Creator<Venue> {


            override fun createFromParcel(`in`: Parcel): Venue {
                return Venue(`in`)
            }

            override fun newArray(size: Int): Array<Venue?> {
                return arrayOfNulls(size)
            }

        }
    }

}