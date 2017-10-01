package com.app.customers.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Language {

    @SerializedName("isoCode")
    @Expose
    var isoCode: String? = null
    @SerializedName("name")
    @Expose
    var name: String? = null

}