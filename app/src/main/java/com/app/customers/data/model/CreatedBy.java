package com.app.customers.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreatedBy implements Parcelable
{

    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("id")
    @Expose
    private int id;
    public final static Parcelable.Creator<CreatedBy> CREATOR = new Creator<CreatedBy>() {


        @SuppressWarnings({
                "unchecked"
        })
        public CreatedBy createFromParcel(Parcel in) {
            return new CreatedBy(in);
        }

        public CreatedBy[] newArray(int size) {
            return (new CreatedBy[size]);
        }

    }
            ;

    protected CreatedBy(Parcel in) {
        this.displayName = ((String) in.readValue((String.class.getClassLoader())));
        this.id = ((int) in.readValue((int.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public CreatedBy() {
    }

    /**
     *
     * @param id
     * @param displayName
     */
    public CreatedBy(String displayName, int id) {
        super();
        this.displayName = displayName;
        this.id = id;
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

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(displayName);
        dest.writeValue(id);
    }

    public int describeContents() {
        return 0;
    }

}