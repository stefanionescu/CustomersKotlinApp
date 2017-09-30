package com.app.customers.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product implements Parcelable
{

    @SerializedName("averageServeTimeMinutes")
    @Expose
    private int averageServeTimeMinutes;
    @SerializedName("colour")
    @Expose
    private Object colour;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;
    public final static Parcelable.Creator<Product> CREATOR = new Creator<Product>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        public Product[] newArray(int size) {
            return (new Product[size]);
        }

    }
            ;

    protected Product(Parcel in) {
        this.averageServeTimeMinutes = ((int) in.readValue((int.class.getClassLoader())));
        this.colour = ((Object) in.readValue((Object.class.getClassLoader())));
        this.id = ((int) in.readValue((int.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Product() {
    }

    /**
     *
     * @param id
     * @param colour
     * @param name
     * @param averageServeTimeMinutes
     */
    public Product(int averageServeTimeMinutes, Object colour, int id, String name) {
        super();
        this.averageServeTimeMinutes = averageServeTimeMinutes;
        this.colour = colour;
        this.id = id;
        this.name = name;
    }

    public int getAverageServeTimeMinutes() {
        return averageServeTimeMinutes;
    }

    public void setAverageServeTimeMinutes(int averageServeTimeMinutes) {
        this.averageServeTimeMinutes = averageServeTimeMinutes;
    }

    public Object getColour() {
        return colour;
    }

    public void setColour(Object colour) {
        this.colour = colour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(averageServeTimeMinutes);
        dest.writeValue(colour);
        dest.writeValue(id);
        dest.writeValue(name);
    }

    public int describeContents() {
        return 0;
    }

}