package com.app.customers.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomersToday implements Parcelable {

    @SerializedName("bookedServer")
    @Expose
    private Object bookedServer;
    @SerializedName("bookingEndTime")
    @Expose
    private Object bookingEndTime;
    @SerializedName("bookingStartTime")
    @Expose
    private Object bookingStartTime;
    @SerializedName("collectingServer")
    @Expose
    private Object collectingServer;
    @SerializedName("currentPosition")
    @Expose
    private int currentPosition;
    @SerializedName("customer")
    @Expose
    private Customer customer;
    @SerializedName("expectedTime")
    @Expose
    private String expectedTime;
    @SerializedName("hasBeenSentReturnMessage")
    @Expose
    private boolean hasBeenSentReturnMessage;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("inStore")
    @Expose
    private boolean inStore;
    @SerializedName("isArrived")
    @Expose
    private boolean isArrived;
    @SerializedName("isFixed")
    @Expose
    private boolean isFixed;
    @SerializedName("joinedTime")
    @Expose
    private String joinedTime;
    @SerializedName("lastSMSStatus")
    @Expose
    private Object lastSMSStatus;
    @SerializedName("originalExpectedTime")
    @Expose
    private String originalExpectedTime;
    @SerializedName("product")
    @Expose
    private Product product;
    @SerializedName("productDescription")
    @Expose
    private Object productDescription;
    @SerializedName("timeArrivedInStore")
    @Expose
    private Object timeArrivedInStore;
    @SerializedName("timeSentReturnMessage")
    @Expose
    private Object timeSentReturnMessage;
    @SerializedName("waitTime")
    @Expose
    private Object waitTime;
    @SerializedName("waitTimePercentComplete")
    @Expose
    private int waitTimePercentComplete;

    public final static Parcelable.Creator<CustomersToday> CREATOR = new Creator<CustomersToday>() {


        @SuppressWarnings({
                "unchecked"
        })
        public CustomersToday createFromParcel(Parcel in) {
            return new CustomersToday(in);
        }

        public CustomersToday[] newArray(int size) {
            return (new CustomersToday[size]);
        }

    };

    protected CustomersToday(Parcel in) {
        this.bookedServer = ((Object) in.readValue((Object.class.getClassLoader())));
        this.bookingEndTime = ((Object) in.readValue((Object.class.getClassLoader())));
        this.bookingStartTime = ((Object) in.readValue((Object.class.getClassLoader())));
        this.collectingServer = ((Object) in.readValue((Object.class.getClassLoader())));
        this.currentPosition = ((int) in.readValue((int.class.getClassLoader())));
        this.customer = ((Customer) in.readValue((Customer.class.getClassLoader())));
        this.expectedTime = ((String) in.readValue((String.class.getClassLoader())));
        this.hasBeenSentReturnMessage = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.id = ((int) in.readValue((int.class.getClassLoader())));
        this.inStore = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.isArrived = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.isFixed = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.joinedTime = ((String) in.readValue((String.class.getClassLoader())));
        this.lastSMSStatus = ((Object) in.readValue((Object.class.getClassLoader())));
        this.originalExpectedTime = ((String) in.readValue((String.class.getClassLoader())));
        this.product = ((Product) in.readValue((Product.class.getClassLoader())));
        this.productDescription = ((Object) in.readValue((Object.class.getClassLoader())));
        this.timeArrivedInStore = ((Object) in.readValue((Object.class.getClassLoader())));
        this.timeSentReturnMessage = ((Object) in.readValue((Object.class.getClassLoader())));
        this.waitTime = ((Object) in.readValue((Object.class.getClassLoader())));
        this.waitTimePercentComplete = ((int) in.readValue((int.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     */
    public CustomersToday() {
    }

    /**
     * @param waitTimePercentComplete
     * @param isFixed
     * @param waitTime
     * @param productDescription
     * @param expectedTime
     * @param originalExpectedTime
     * @param currentPosition
     * @param customer
     * @param isArrived
     * @param product
     * @param id
     * @param inStore
     * @param timeArrivedInStore
     * @param bookingEndTime
     * @param joinedTime
     * @param hasBeenSentReturnMessage
     * @param collectingServer
     * @param bookingStartTime
     * @param bookedServer
     * @param timeSentReturnMessage
     * @param lastSMSStatus
     */
    public CustomersToday(Object bookedServer, Object bookingEndTime, Object bookingStartTime, Object collectingServer, int currentPosition, Customer customer, String expectedTime, boolean hasBeenSentReturnMessage, int id, boolean inStore, boolean isArrived, boolean isFixed, String joinedTime, Object lastSMSStatus, String originalExpectedTime, Product product, Object productDescription, Object timeArrivedInStore, Object timeSentReturnMessage, Object waitTime, int waitTimePercentComplete) {
        super();
        this.bookedServer = bookedServer;
        this.bookingEndTime = bookingEndTime;
        this.bookingStartTime = bookingStartTime;
        this.collectingServer = collectingServer;
        this.currentPosition = currentPosition;
        this.customer = customer;
        this.expectedTime = expectedTime;
        this.hasBeenSentReturnMessage = hasBeenSentReturnMessage;
        this.id = id;
        this.inStore = inStore;
        this.isArrived = isArrived;
        this.isFixed = isFixed;
        this.joinedTime = joinedTime;
        this.lastSMSStatus = lastSMSStatus;
        this.originalExpectedTime = originalExpectedTime;
        this.product = product;
        this.productDescription = productDescription;
        this.timeArrivedInStore = timeArrivedInStore;
        this.timeSentReturnMessage = timeSentReturnMessage;
        this.waitTime = waitTime;
        this.waitTimePercentComplete = waitTimePercentComplete;
    }

    public Object getBookedServer() {
        return bookedServer;
    }

    public void setBookedServer(Object bookedServer) {
        this.bookedServer = bookedServer;
    }

    public Object getBookingEndTime() {
        return bookingEndTime;
    }

    public void setBookingEndTime(Object bookingEndTime) {
        this.bookingEndTime = bookingEndTime;
    }

    public Object getBookingStartTime() {
        return bookingStartTime;
    }

    public void setBookingStartTime(Object bookingStartTime) {
        this.bookingStartTime = bookingStartTime;
    }

    public Object getCollectingServer() {
        return collectingServer;
    }

    public void setCollectingServer(Object collectingServer) {
        this.collectingServer = collectingServer;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getExpectedTime() {
        return expectedTime;
    }

    public void setExpectedTime(String expectedTime) {
        this.expectedTime = expectedTime;
    }

    public boolean isHasBeenSentReturnMessage() {
        return hasBeenSentReturnMessage;
    }

    public void setHasBeenSentReturnMessage(boolean hasBeenSentReturnMessage) {
        this.hasBeenSentReturnMessage = hasBeenSentReturnMessage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isInStore() {
        return inStore;
    }

    public void setInStore(boolean inStore) {
        this.inStore = inStore;
    }

    public boolean isIsArrived() {
        return isArrived;
    }

    public void setIsArrived(boolean isArrived) {
        this.isArrived = isArrived;
    }

    public boolean isIsFixed() {
        return isFixed;
    }

    public void setIsFixed(boolean isFixed) {
        this.isFixed = isFixed;
    }

    public String getJoinedTime() {
        return joinedTime;
    }

    public void setJoinedTime(String joinedTime) {
        this.joinedTime = joinedTime;
    }

    public Object getLastSMSStatus() {
        return lastSMSStatus;
    }

    public void setLastSMSStatus(Object lastSMSStatus) {
        this.lastSMSStatus = lastSMSStatus;
    }

    public String getOriginalExpectedTime() {
        return originalExpectedTime;
    }

    public void setOriginalExpectedTime(String originalExpectedTime) {
        this.originalExpectedTime = originalExpectedTime;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Object getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(Object productDescription) {
        this.productDescription = productDescription;
    }

    public Object getTimeArrivedInStore() {
        return timeArrivedInStore;
    }

    public void setTimeArrivedInStore(Object timeArrivedInStore) {
        this.timeArrivedInStore = timeArrivedInStore;
    }

    public Object getTimeSentReturnMessage() {
        return timeSentReturnMessage;
    }

    public void setTimeSentReturnMessage(Object timeSentReturnMessage) {
        this.timeSentReturnMessage = timeSentReturnMessage;
    }

    public Object getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(Object waitTime) {
        this.waitTime = waitTime;
    }

    public int getWaitTimePercentComplete() {
        return waitTimePercentComplete;
    }

    public void setWaitTimePercentComplete(int waitTimePercentComplete) {
        this.waitTimePercentComplete = waitTimePercentComplete;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(bookedServer);
        dest.writeValue(bookingEndTime);
        dest.writeValue(bookingStartTime);
        dest.writeValue(collectingServer);
        dest.writeValue(currentPosition);
        dest.writeValue(customer);
        dest.writeValue(expectedTime);
        dest.writeValue(hasBeenSentReturnMessage);
        dest.writeValue(id);
        dest.writeValue(inStore);
        dest.writeValue(isArrived);
        dest.writeValue(isFixed);
        dest.writeValue(joinedTime);
        dest.writeValue(lastSMSStatus);
        dest.writeValue(originalExpectedTime);
        dest.writeValue(product);
        dest.writeValue(productDescription);
        dest.writeValue(timeArrivedInStore);
        dest.writeValue(timeSentReturnMessage);
        dest.writeValue(waitTime);
        dest.writeValue(waitTimePercentComplete);
    }

    public int describeContents() {
        return 0;
    }

}
