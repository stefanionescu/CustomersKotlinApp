package com.app.customers.data.model

import android.os.Parcel
import android.os.Parcelable
import android.os.Parcelable.Creator
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class MerchantCustomer : Parcelable {

    @SerializedName("id")
    @Expose
    var id: Int = 0

    protected constructor(`in`: Parcel) {
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
     */
    constructor(id: Int) : super() {
        this.id = id
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeValue(id)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        val CREATOR: Parcelable.Creator<MerchantCustomer> = object : Creator<MerchantCustomer> {


            override fun createFromParcel(`in`: Parcel): MerchantCustomer {
                return MerchantCustomer(`in`)
            }

            override fun newArray(size: Int): Array<MerchantCustomer?> {
                return arrayOfNulls(size)
            }

        }
    }

}