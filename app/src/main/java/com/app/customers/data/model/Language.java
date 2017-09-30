package com.app.customers.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Language implements Parcelable
{

    @SerializedName("isoCode")
    @Expose
    private String isoCode;
    @SerializedName("name")
    @Expose
    private String name;
    public final static Parcelable.Creator<Language> CREATOR = new Creator<Language>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Language createFromParcel(Parcel in) {
            return new Language(in);
        }

        public Language[] newArray(int size) {
            return (new Language[size]);
        }

    }
            ;

    protected Language(Parcel in) {
        this.isoCode = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Language() {
    }

    /**
     *
     * @param name
     * @param isoCode
     */
    public Language(String isoCode, String name) {
        super();
        this.isoCode = isoCode;
        this.name = name;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(isoCode);
        dest.writeValue(name);
    }

    public int describeContents() {
        return 0;
    }

}