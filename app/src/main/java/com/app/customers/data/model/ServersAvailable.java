package com.app.customers.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ServersAvailable implements Parcelable
{

    @SerializedName("isAlwaysAvailable")
    @Expose
    private boolean isAlwaysAvailable;
    @SerializedName("minutesUntilNextAvailability")
    @Expose
    private int minutesUntilNextAvailability;
    @SerializedName("nextAvailableMinutes")
    @Expose
    private int nextAvailableMinutes;
    @SerializedName("server")
    @Expose
    private Server_ server;
    public final static Parcelable.Creator<ServersAvailable> CREATOR = new Creator<ServersAvailable>() {


        @SuppressWarnings({
                "unchecked"
        })
        public ServersAvailable createFromParcel(Parcel in) {
            return new ServersAvailable(in);
        }

        public ServersAvailable[] newArray(int size) {
            return (new ServersAvailable[size]);
        }

    }
            ;

    protected ServersAvailable(Parcel in) {
        this.isAlwaysAvailable = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.minutesUntilNextAvailability = ((int) in.readValue((int.class.getClassLoader())));
        this.nextAvailableMinutes = ((int) in.readValue((int.class.getClassLoader())));
        this.server = ((Server_) in.readValue((Server_.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public ServersAvailable() {
    }

    /**
     *
     * @param nextAvailableMinutes
     * @param minutesUntilNextAvailability
     * @param server
     * @param isAlwaysAvailable
     */
    public ServersAvailable(boolean isAlwaysAvailable, int minutesUntilNextAvailability, int nextAvailableMinutes, Server_ server) {
        super();
        this.isAlwaysAvailable = isAlwaysAvailable;
        this.minutesUntilNextAvailability = minutesUntilNextAvailability;
        this.nextAvailableMinutes = nextAvailableMinutes;
        this.server = server;
    }

    public boolean isIsAlwaysAvailable() {
        return isAlwaysAvailable;
    }

    public void setIsAlwaysAvailable(boolean isAlwaysAvailable) {
        this.isAlwaysAvailable = isAlwaysAvailable;
    }

    public int getMinutesUntilNextAvailability() {
        return minutesUntilNextAvailability;
    }

    public void setMinutesUntilNextAvailability(int minutesUntilNextAvailability) {
        this.minutesUntilNextAvailability = minutesUntilNextAvailability;
    }

    public int getNextAvailableMinutes() {
        return nextAvailableMinutes;
    }

    public void setNextAvailableMinutes(int nextAvailableMinutes) {
        this.nextAvailableMinutes = nextAvailableMinutes;
    }

    public Server_ getServer() {
        return server;
    }

    public void setServer(Server_ server) {
        this.server = server;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(isAlwaysAvailable);
        dest.writeValue(minutesUntilNextAvailability);
        dest.writeValue(nextAvailableMinutes);
        dest.writeValue(server);
    }

    public int describeContents() {
        return 0;
    }

}