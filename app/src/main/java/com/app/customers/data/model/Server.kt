package com.app.customers.data.model

import android.os.Parcel
import android.os.Parcelable
import android.os.Parcelable.Creator
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Server : Parcelable {

    @SerializedName("displayName")
    @Expose
    var displayName: String? = null
    @SerializedName("id")
    @Expose
    var id: Int = 0

    protected constructor(`in`: Parcel) {
        this.displayName = `in`.readValue(String::class.java.classLoader) as String
        this.id = `in`.readValue(Int::class.javaPrimitiveType!!.classLoader) as Int
    }

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}

    /**
     *
     * @param id
     * @param displayName
     */
    constructor(displayName: String, id: Int) : super() {
        this.displayName = displayName
        this.id = id
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeValue(displayName)
        dest.writeValue(id)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        val CREATOR: Parcelable.Creator<Server> = object : Creator<Server> {


            override fun createFromParcel(`in`: Parcel): Server {
                return Server(`in`)
            }

            override fun newArray(size: Int): Array<Server?> {
                return arrayOfNulls(size)
            }

        }
    }

}
