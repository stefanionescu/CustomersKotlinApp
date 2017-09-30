package com.app.customers.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Server_ implements Parcelable
{

    @SerializedName("currentBreakReason")
    @Expose
    private Object currentBreakReason;
    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("isOnBreak")
    @Expose
    private boolean isOnBreak;
    @SerializedName("location")
    @Expose
    private Object location;
    public final static Parcelable.Creator<Server_> CREATOR = new Creator<Server_>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Server_ createFromParcel(Parcel in) {
            return new Server_(in);
        }

        public Server_[] newArray(int size) {
            return (new Server_[size]);
        }

    }
            ;

    protected Server_(Parcel in) {
        this.currentBreakReason = ((Object) in.readValue((Object.class.getClassLoader())));
        this.displayName = ((String) in.readValue((String.class.getClassLoader())));
        this.id = ((int) in.readValue((int.class.getClassLoader())));
        this.isOnBreak = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.location = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Server_() {
    }


    public Server_(Object currentBreakReason, String displayName, int id, boolean isOnBreak, Object location) {
        super();
        this.currentBreakReason = currentBreakReason;
        this.displayName = displayName;
        this.id = id;
        this.isOnBreak = isOnBreak;
        this.location = location;
    }

    public Object getCurrentBreakReason() {
        return currentBreakReason;
    }

    public void setCurrentBreakReason(Object currentBreakReason) {
        this.currentBreakReason = currentBreakReason;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIsOnBreak() {
        return isOnBreak;
    }

    public void setIsOnBreak(boolean isOnBreak) {
        this.isOnBreak = isOnBreak;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(currentBreakReason);
        dest.writeValue(displayName);
        dest.writeValue(id);
        dest.writeValue(isOnBreak);
        dest.writeValue(location);
    }

    public int describeContents() {
        return 0;
    }

}