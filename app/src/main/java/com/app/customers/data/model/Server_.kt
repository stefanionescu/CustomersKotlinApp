package com.app.customers.data.model

import android.os.Parcel
import android.os.Parcelable
import android.os.Parcelable.Creator
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Server_ : Parcelable {

    @SerializedName("currentBreakReason")
    @Expose
    var currentBreakReason: Any? = null
    @SerializedName("displayName")
    @Expose
    var displayName: String? = null
    @SerializedName("id")
    @Expose
    var id: Int = 0
    @SerializedName("isOnBreak")
    @Expose
    var isIsOnBreak: Boolean = false
    @SerializedName("location")
    @Expose
    var location: Any? = null

    protected constructor(`in`: Parcel) {
        this.currentBreakReason = `in`.readValue(Any::class.java.classLoader) as Any
        this.displayName = `in`.readValue(String::class.java.classLoader) as String
        this.id = `in`.readValue(Int::class.javaPrimitiveType!!.classLoader) as Int
        this.isIsOnBreak = `in`.readValue(Boolean::class.javaPrimitiveType!!.classLoader) as Boolean
        this.location = `in`.readValue(Any::class.java.classLoader) as Any
    }

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}


    constructor(currentBreakReason: Any, displayName: String, id: Int, isOnBreak: Boolean, location: Any) : super() {
        this.currentBreakReason = currentBreakReason
        this.displayName = displayName
        this.id = id
        this.isIsOnBreak = isOnBreak
        this.location = location
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeValue(currentBreakReason)
        dest.writeValue(displayName)
        dest.writeValue(id)
        dest.writeValue(isIsOnBreak)
        dest.writeValue(location)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        val CREATOR: Parcelable.Creator<Server_> = object : Creator<Server_> {


            override fun createFromParcel(`in`: Parcel): Server_ {
                return Server_(`in`)
            }

            override fun newArray(size: Int): Array<Server_?> {
                return arrayOfNulls(size)
            }

        }
    }

}