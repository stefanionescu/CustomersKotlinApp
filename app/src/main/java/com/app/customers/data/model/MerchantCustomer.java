package com.app.customers.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MerchantCustomer implements Parcelable
{

    @SerializedName("id")
    @Expose
    private int id;
    public final static Parcelable.Creator<MerchantCustomer> CREATOR = new Creator<MerchantCustomer>() {


        @SuppressWarnings({
                "unchecked"
        })
        public MerchantCustomer createFromParcel(Parcel in) {
            return new MerchantCustomer(in);
        }

        public MerchantCustomer[] newArray(int size) {
            return (new MerchantCustomer[size]);
        }

    }
            ;

    protected MerchantCustomer(Parcel in) {
        this.id = ((int) in.readValue((int.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public MerchantCustomer() {
    }

    /**
     *
     * @param id
     */
    public MerchantCustomer(int id) {
        super();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
    }

    public int describeContents() {
        return 0;
    }

}