package com.app.customers.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Venue implements Parcelable
{

    @SerializedName("enableAllQueuesView")
    @Expose
    private boolean enableAllQueuesView;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("isBookingEnabled")
    @Expose
    private boolean isBookingEnabled;
    @SerializedName("isCustomerProfileEnabled")
    @Expose
    private boolean isCustomerProfileEnabled;
    @SerializedName("isCustomerProfileIconEnabled")
    @Expose
    private boolean isCustomerProfileIconEnabled;
    @SerializedName("isWalkinEnabled")
    @Expose
    private boolean isWalkinEnabled;
    @SerializedName("name")
    @Expose
    private String name;
    public final static Parcelable.Creator<Venue> CREATOR = new Creator<Venue>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Venue createFromParcel(Parcel in) {
            return new Venue(in);
        }

        public Venue[] newArray(int size) {
            return (new Venue[size]);
        }

    }
            ;

    protected Venue(Parcel in) {
        this.enableAllQueuesView = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.id = ((int) in.readValue((int.class.getClassLoader())));
        this.isBookingEnabled = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.isCustomerProfileEnabled = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.isCustomerProfileIconEnabled = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.isWalkinEnabled = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Venue() {
    }

    public Venue(boolean enableAllQueuesView, int id, boolean isBookingEnabled, boolean isCustomerProfileEnabled, boolean isCustomerProfileIconEnabled, boolean isWalkinEnabled, String name) {
        super();
        this.enableAllQueuesView = enableAllQueuesView;
        this.id = id;
        this.isBookingEnabled = isBookingEnabled;
        this.isCustomerProfileEnabled = isCustomerProfileEnabled;
        this.isCustomerProfileIconEnabled = isCustomerProfileIconEnabled;
        this.isWalkinEnabled = isWalkinEnabled;
        this.name = name;
    }

    public boolean isEnableAllQueuesView() {
        return enableAllQueuesView;
    }

    public void setEnableAllQueuesView(boolean enableAllQueuesView) {
        this.enableAllQueuesView = enableAllQueuesView;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIsBookingEnabled() {
        return isBookingEnabled;
    }

    public void setIsBookingEnabled(boolean isBookingEnabled) {
        this.isBookingEnabled = isBookingEnabled;
    }

    public boolean isIsCustomerProfileEnabled() {
        return isCustomerProfileEnabled;
    }

    public void setIsCustomerProfileEnabled(boolean isCustomerProfileEnabled) {
        this.isCustomerProfileEnabled = isCustomerProfileEnabled;
    }

    public boolean isIsCustomerProfileIconEnabled() {
        return isCustomerProfileIconEnabled;
    }

    public void setIsCustomerProfileIconEnabled(boolean isCustomerProfileIconEnabled) {
        this.isCustomerProfileIconEnabled = isCustomerProfileIconEnabled;
    }

    public boolean isIsWalkinEnabled() {
        return isWalkinEnabled;
    }

    public void setIsWalkinEnabled(boolean isWalkinEnabled) {
        this.isWalkinEnabled = isWalkinEnabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(enableAllQueuesView);
        dest.writeValue(id);
        dest.writeValue(isBookingEnabled);
        dest.writeValue(isCustomerProfileEnabled);
        dest.writeValue(isCustomerProfileIconEnabled);
        dest.writeValue(isWalkinEnabled);
        dest.writeValue(name);
    }

    public int describeContents() {
        return 0;
    }

}