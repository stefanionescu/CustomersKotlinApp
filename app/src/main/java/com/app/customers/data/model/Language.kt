package com.app.customers.data.model

import android.os.Parcel
import android.os.Parcelable
import android.os.Parcelable.Creator
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Language : Parcelable {

    @SerializedName("isoCode")
    @Expose
    var isoCode: String? = null
    @SerializedName("name")
    @Expose
    var name: String? = null

    protected constructor(`in`: Parcel) {
        this.isoCode = `in`.readValue(String::class.java.classLoader) as String
        this.name = `in`.readValue(String::class.java.classLoader) as String
    }

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}

    constructor(isoCode: String, name: String) : super() {
        this.isoCode = isoCode
        this.name = name
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeValue(isoCode)
        dest.writeValue(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        val CREATOR: Parcelable.Creator<Language> = object : Creator<Language> {


            override fun createFromParcel(`in`: Parcel): Language {
                return Language(`in`)
            }

            override fun newArray(size: Int): Array<Language?> {
                return arrayOfNulls(size)
            }

        }
    }

}