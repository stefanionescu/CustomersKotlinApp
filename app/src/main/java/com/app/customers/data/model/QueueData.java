package com.app.customers.data.model;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QueueData implements Parcelable
{

    @SerializedName("currentUserRole")
    @Expose
    private String currentUserRole;
    @SerializedName("customerServed")
    @Expose
    private Object customerServed;
    @SerializedName("isActive")
    @Expose
    private boolean isActive;
    @SerializedName("isMyLastCustomer")
    @Expose
    private boolean isMyLastCustomer;
    @SerializedName("minutesToNextFree")
    @Expose
    private int minutesToNextFree;
    @SerializedName("queue")
    @Expose
    private Queue queue;
    @SerializedName("queueLength")
    @Expose
    private int queueLength;
    @SerializedName("queueLengthBooked")
    @Expose
    private int queueLengthBooked;
    @SerializedName("queueLengthNonBooked")
    @Expose
    private int queueLengthNonBooked;
    @SerializedName("serversAvailable")
    @Expose
    private List<ServersAvailable> serversAvailable = null;
    @SerializedName("staffAvailable")
    @Expose
    private int staffAvailable;
    @SerializedName("staffTotal")
    @Expose
    private int staffTotal;
    public final static Parcelable.Creator<QueueData> CREATOR = new Creator<QueueData>() {


        @SuppressWarnings({
                "unchecked"
        })
        public QueueData createFromParcel(Parcel in) {
            return new QueueData(in);
        }

        public QueueData[] newArray(int size) {
            return (new QueueData[size]);
        }

    }
            ;

    protected QueueData(Parcel in) {
        this.currentUserRole = ((String) in.readValue((String.class.getClassLoader())));
        this.customerServed = ((Object) in.readValue((Object.class.getClassLoader())));
        this.isActive = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.isMyLastCustomer = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.minutesToNextFree = ((int) in.readValue((int.class.getClassLoader())));
        this.queue = ((Queue) in.readValue((Queue.class.getClassLoader())));
        this.queueLength = ((int) in.readValue((int.class.getClassLoader())));
        this.queueLengthBooked = ((int) in.readValue((int.class.getClassLoader())));
        this.queueLengthNonBooked = ((int) in.readValue((int.class.getClassLoader())));
        in.readList(this.serversAvailable, (com.app.customers.data.model.ServersAvailable.class.getClassLoader()));
        this.staffAvailable = ((int) in.readValue((int.class.getClassLoader())));
        this.staffTotal = ((int) in.readValue((int.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public QueueData() {
    }

    /**
     *
     * @param isActive
     * @param queueLengthBooked
     * @param queue
     * @param isMyLastCustomer
     * @param staffTotal
     * @param serversAvailable
     * @param customerServed
     * @param queueLength
     * @param staffAvailable
     * @param queueLengthNonBooked
     * @param minutesToNextFree
     * @param currentUserRole
     */
    public QueueData(String currentUserRole, Object customerServed, boolean isActive, boolean isMyLastCustomer, int minutesToNextFree, Queue queue, int queueLength, int queueLengthBooked, int queueLengthNonBooked, List<ServersAvailable> serversAvailable, int staffAvailable, int staffTotal) {
        super();
        this.currentUserRole = currentUserRole;
        this.customerServed = customerServed;
        this.isActive = isActive;
        this.isMyLastCustomer = isMyLastCustomer;
        this.minutesToNextFree = minutesToNextFree;
        this.queue = queue;
        this.queueLength = queueLength;
        this.queueLengthBooked = queueLengthBooked;
        this.queueLengthNonBooked = queueLengthNonBooked;
        this.serversAvailable = serversAvailable;
        this.staffAvailable = staffAvailable;
        this.staffTotal = staffTotal;
    }

    public String getCurrentUserRole() {
        return currentUserRole;
    }

    public void setCurrentUserRole(String currentUserRole) {
        this.currentUserRole = currentUserRole;
    }

    public Object getCustomerServed() {
        return customerServed;
    }

    public void setCustomerServed(Object customerServed) {
        this.customerServed = customerServed;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isIsMyLastCustomer() {
        return isMyLastCustomer;
    }

    public void setIsMyLastCustomer(boolean isMyLastCustomer) {
        this.isMyLastCustomer = isMyLastCustomer;
    }

    public int getMinutesToNextFree() {
        return minutesToNextFree;
    }

    public void setMinutesToNextFree(int minutesToNextFree) {
        this.minutesToNextFree = minutesToNextFree;
    }

    public Queue getQueue() {
        return queue;
    }

    public void setQueue(Queue queue) {
        this.queue = queue;
    }

    public int getQueueLength() {
        return queueLength;
    }

    public void setQueueLength(int queueLength) {
        this.queueLength = queueLength;
    }

    public int getQueueLengthBooked() {
        return queueLengthBooked;
    }

    public void setQueueLengthBooked(int queueLengthBooked) {
        this.queueLengthBooked = queueLengthBooked;
    }

    public int getQueueLengthNonBooked() {
        return queueLengthNonBooked;
    }

    public void setQueueLengthNonBooked(int queueLengthNonBooked) {
        this.queueLengthNonBooked = queueLengthNonBooked;
    }

    public List<ServersAvailable> getServersAvailable() {
        return serversAvailable;
    }

    public void setServersAvailable(List<ServersAvailable> serversAvailable) {
        this.serversAvailable = serversAvailable;
    }

    public int getStaffAvailable() {
        return staffAvailable;
    }

    public void setStaffAvailable(int staffAvailable) {
        this.staffAvailable = staffAvailable;
    }

    public int getStaffTotal() {
        return staffTotal;
    }

    public void setStaffTotal(int staffTotal) {
        this.staffTotal = staffTotal;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(currentUserRole);
        dest.writeValue(customerServed);
        dest.writeValue(isActive);
        dest.writeValue(isMyLastCustomer);
        dest.writeValue(minutesToNextFree);
        dest.writeValue(queue);
        dest.writeValue(queueLength);
        dest.writeValue(queueLengthBooked);
        dest.writeValue(queueLengthNonBooked);
        dest.writeList(serversAvailable);
        dest.writeValue(staffAvailable);
        dest.writeValue(staffTotal);
    }

    public int describeContents() {
        return 0;
    }

}
