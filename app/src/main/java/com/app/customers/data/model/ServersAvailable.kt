package com.app.customers.data.model

import android.os.Parcel
import android.os.Parcelable
import android.os.Parcelable.Creator
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ServersAvailable : Parcelable {

    @SerializedName("isAlwaysAvailable")
    @Expose
    var isIsAlwaysAvailable: Boolean = false
    @SerializedName("minutesUntilNextAvailability")
    @Expose
    var minutesUntilNextAvailability: Int = 0
    @SerializedName("nextAvailableMinutes")
    @Expose
    var nextAvailableMinutes: Int = 0
    @SerializedName("server")
    @Expose
    var server: Server_? = null

    protected constructor(`in`: Parcel) {
        this.isIsAlwaysAvailable = `in`.readValue(Boolean::class.javaPrimitiveType!!.classLoader) as Boolean
        this.minutesUntilNextAvailability = `in`.readValue(Int::class.javaPrimitiveType!!.classLoader) as Int
        this.nextAvailableMinutes = `in`.readValue(Int::class.javaPrimitiveType!!.classLoader) as Int
        this.server = `in`.readValue(Server_::class.java.classLoader) as Server_
    }

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}

    /**
     *
     * @param nextAvailableMinutes
     * @param minutesUntilNextAvailability
     * @param server
     * @param isAlwaysAvailable
     */
    constructor(isAlwaysAvailable: Boolean, minutesUntilNextAvailability: Int, nextAvailableMinutes: Int, server: Server_) : super() {
        this.isIsAlwaysAvailable = isAlwaysAvailable
        this.minutesUntilNextAvailability = minutesUntilNextAvailability
        this.nextAvailableMinutes = nextAvailableMinutes
        this.server = server
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeValue(isIsAlwaysAvailable)
        dest.writeValue(minutesUntilNextAvailability)
        dest.writeValue(nextAvailableMinutes)
        dest.writeValue(server)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        val CREATOR: Parcelable.Creator<ServersAvailable> = object : Creator<ServersAvailable> {


            override fun createFromParcel(`in`: Parcel): ServersAvailable {
                return ServersAvailable(`in`)
            }

            override fun newArray(size: Int): Array<ServersAvailable?> {
                return arrayOfNulls(size)
            }

        }
    }

}