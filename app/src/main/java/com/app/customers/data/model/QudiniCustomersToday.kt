package com.app.customers.data.model

import android.os.Parcel
import android.os.Parcelable

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class QudiniCustomersToday : Parcelable {

    @SerializedName("bookedServer")
    @Expose
    var bookedServer: Any? = null
    @SerializedName("bookingEndTime")
    @Expose
    var bookingEndTime: Any? = null
    @SerializedName("bookingStartTime")
    @Expose
    var bookingStartTime: Any? = null
    @SerializedName("collectingServer")
    @Expose
    var collectingServer: Any? = null
    @SerializedName("currentPosition")
    @Expose
    var currentPosition: Int = 0
    @SerializedName("qudiniCustomer")
    @Expose
    var qudiniCustomer: QudiniCustomer? = null
    @SerializedName("expectedTime")
    @Expose
    var expectedTime: String? = null
    @SerializedName("hasBeenSentReturnMessage")
    @Expose
    var isHasBeenSentReturnMessage: Boolean = false
    @SerializedName("id")
    @Expose
    var id: Int = 0
    @SerializedName("inStore")
    @Expose
    var isInStore: Boolean = false
    @SerializedName("isArrived")
    @Expose
    var isIsArrived: Boolean = false
    @SerializedName("isFixed")
    @Expose
    var isIsFixed: Boolean = false
    @SerializedName("joinedTime")
    @Expose
    var joinedTime: String? = null
    @SerializedName("lastSMSStatus")
    @Expose
    var lastSMSStatus: Any? = null
    @SerializedName("originalExpectedTime")
    @Expose
    var originalExpectedTime: String? = null
    @SerializedName("product")
    @Expose
    var product: Product? = null
    @SerializedName("productDescription")
    @Expose
    var productDescription: Any? = null
    @SerializedName("timeArrivedInStore")
    @Expose
    var timeArrivedInStore: Any? = null
    @SerializedName("timeSentReturnMessage")
    @Expose
    var timeSentReturnMessage: Any? = null
    @SerializedName("waitTime")
    @Expose
    var waitTime: Any? = null
    @SerializedName("waitTimePercentComplete")
    @Expose
    var waitTimePercentComplete: Int = 0

    protected constructor(`in`: Parcel) {
        this.bookedServer = `in`.readValue(Any::class.java.classLoader) as Any
        this.bookingEndTime = `in`.readValue(Any::class.java.classLoader) as Any
        this.bookingStartTime = `in`.readValue(Any::class.java.classLoader) as Any
        this.collectingServer = `in`.readValue(Any::class.java.classLoader) as Any
        this.currentPosition = `in`.readValue(Int::class.javaPrimitiveType!!.classLoader) as Int
        this.qudiniCustomer = `in`.readValue(QudiniCustomer::class.java.classLoader) as QudiniCustomer
        this.expectedTime = `in`.readValue(String::class.java.classLoader) as String
        this.isHasBeenSentReturnMessage = `in`.readValue(Boolean::class.javaPrimitiveType!!.classLoader) as Boolean
        this.id = `in`.readValue(Int::class.javaPrimitiveType!!.classLoader) as Int
        this.isInStore = `in`.readValue(Boolean::class.javaPrimitiveType!!.classLoader) as Boolean
        this.isIsArrived = `in`.readValue(Boolean::class.javaPrimitiveType!!.classLoader) as Boolean
        this.isIsFixed = `in`.readValue(Boolean::class.javaPrimitiveType!!.classLoader) as Boolean
        this.joinedTime = `in`.readValue(String::class.java.classLoader) as String
        this.lastSMSStatus = `in`.readValue(Any::class.java.classLoader) as Any
        this.originalExpectedTime = `in`.readValue(String::class.java.classLoader) as String
        this.product = `in`.readValue(Product::class.java.classLoader) as Product
        this.productDescription = `in`.readValue(Any::class.java.classLoader) as Any
        this.timeArrivedInStore = `in`.readValue(Any::class.java.classLoader) as Any
        this.timeSentReturnMessage = `in`.readValue(Any::class.java.classLoader) as Any
        this.waitTime = `in`.readValue(Any::class.java.classLoader) as Any
        this.waitTimePercentComplete = `in`.readValue(Int::class.javaPrimitiveType!!.classLoader) as Int
    }

    /**
     * No args constructor for use in serialization
     */
    constructor() {}

    constructor(bookedServer: Any, bookingEndTime: Any, bookingStartTime: Any, collectingServer: Any, currentPosition: Int, qudiniCustomer: QudiniCustomer, expectedTime: String, hasBeenSentReturnMessage: Boolean, id: Int, inStore: Boolean, isArrived: Boolean, isFixed: Boolean, joinedTime: String, lastSMSStatus: Any, originalExpectedTime: String, product: Product, productDescription: Any, timeArrivedInStore: Any, timeSentReturnMessage: Any, waitTime: Any, waitTimePercentComplete: Int) : super() {
        this.bookedServer = bookedServer
        this.bookingEndTime = bookingEndTime
        this.bookingStartTime = bookingStartTime
        this.collectingServer = collectingServer
        this.currentPosition = currentPosition
        this.qudiniCustomer = qudiniCustomer
        this.expectedTime = expectedTime
        this.isHasBeenSentReturnMessage = hasBeenSentReturnMessage
        this.id = id
        this.isInStore = inStore
        this.isIsArrived = isArrived
        this.isIsFixed = isFixed
        this.joinedTime = joinedTime
        this.lastSMSStatus = lastSMSStatus
        this.originalExpectedTime = originalExpectedTime
        this.product = product
        this.productDescription = productDescription
        this.timeArrivedInStore = timeArrivedInStore
        this.timeSentReturnMessage = timeSentReturnMessage
        this.waitTime = waitTime
        this.waitTimePercentComplete = waitTimePercentComplete
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeValue(bookedServer)
        dest.writeValue(bookingEndTime)
        dest.writeValue(bookingStartTime)
        dest.writeValue(collectingServer)
        dest.writeValue(currentPosition)
        dest.writeValue(qudiniCustomer)
        dest.writeValue(expectedTime)
        dest.writeValue(isHasBeenSentReturnMessage)
        dest.writeValue(id)
        dest.writeValue(isInStore)
        dest.writeValue(isIsArrived)
        dest.writeValue(isIsFixed)
        dest.writeValue(joinedTime)
        dest.writeValue(lastSMSStatus)
        dest.writeValue(originalExpectedTime)
        dest.writeValue(product)
        dest.writeValue(productDescription)
        dest.writeValue(timeArrivedInStore)
        dest.writeValue(timeSentReturnMessage)
        dest.writeValue(waitTime)
        dest.writeValue(waitTimePercentComplete)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {

        val CREATOR: Parcelable.Creator<QudiniCustomersToday> = object : Parcelable.Creator<QudiniCustomersToday> {


            override fun createFromParcel(`in`: Parcel): QudiniCustomersToday {
                return QudiniCustomersToday(`in`)
            }

            override fun newArray(size: Int): Array<QudiniCustomersToday?> {
                return arrayOfNulls(size)
            }

        }
    }

}
