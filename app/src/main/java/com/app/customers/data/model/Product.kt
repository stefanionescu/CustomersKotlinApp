package com.app.customers.data.model

import android.os.Parcel
import android.os.Parcelable
import android.os.Parcelable.Creator
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Product : Parcelable {

    @SerializedName("averageServeTimeMinutes")
    @Expose
    var averageServeTimeMinutes: Int = 0
    @SerializedName("colour")
    @Expose
    var colour: Any? = null
    @SerializedName("id")
    @Expose
    var id: Int = 0
    @SerializedName("name")
    @Expose
    var name: String? = null

    protected constructor(`in`: Parcel) {
        this.averageServeTimeMinutes = `in`.readValue(Int::class.javaPrimitiveType!!.classLoader) as Int
        this.colour = `in`.readValue(Any::class.java.classLoader) as Any
        this.id = `in`.readValue(Int::class.javaPrimitiveType!!.classLoader) as Int
        this.name = `in`.readValue(String::class.java.classLoader) as String
    }

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}

    constructor(averageServeTimeMinutes: Int, colour: Any, id: Int, name: String) : super() {
        this.averageServeTimeMinutes = averageServeTimeMinutes
        this.colour = colour
        this.id = id
        this.name = name
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeValue(averageServeTimeMinutes)
        dest.writeValue(colour)
        dest.writeValue(id)
        dest.writeValue(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        val CREATOR: Parcelable.Creator<Product> = object : Creator<Product> {


            override fun createFromParcel(`in`: Parcel): Product {
                return Product(`in`)
            }

            override fun newArray(size: Int): Array<Product?> {
                return arrayOfNulls(size)
            }

        }
    }

}