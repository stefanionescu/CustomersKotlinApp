package com.app.customers.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QudiniCustomer implements Parcelable
{

    @SerializedName("bookingRef")
    @Expose
    private String bookingRef;
    @SerializedName("createdBy")
    @Expose
    private CreatedBy createdBy;
    @SerializedName("customerProfile")
    @Expose
    private Object customerProfile;
    @SerializedName("emailAddress")
    @Expose
    private String emailAddress;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("isInMultipleQueue")
    @Expose
    private Object isInMultipleQueue;
    @SerializedName("language")
    @Expose
    private Language language;
    @SerializedName("merchantCustomer")
    @Expose
    private MerchantCustomer merchantCustomer;
    @SerializedName("mobileNetwork")
    @Expose
    private Object mobileNetwork;
    @SerializedName("mobileNumber")
    @Expose
    private String mobileNumber;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("notes")
    @Expose
    private String notes;
    @SerializedName("numberCountryCode")
    @Expose
    private String numberCountryCode;
    @SerializedName("orderNumber")
    @Expose
    private Object orderNumber;
    @SerializedName("pagerNumber")
    @Expose
    private Object pagerNumber;
    @SerializedName("surname")
    @Expose
    private String surname;
    @SerializedName("ticketNumber")
    @Expose
    private String ticketNumber;
    @SerializedName("unreadMessages")
    @Expose
    private int unreadMessages;
    public final static Parcelable.Creator<QudiniCustomer> CREATOR = new Creator<QudiniCustomer>() {


        @SuppressWarnings({
                "unchecked"
        })
        public QudiniCustomer createFromParcel(Parcel in) {
            return new QudiniCustomer(in);
        }

        public QudiniCustomer[] newArray(int size) {
            return (new QudiniCustomer[size]);
        }

    }
            ;

    protected QudiniCustomer(Parcel in) {
        this.bookingRef = ((String) in.readValue((String.class.getClassLoader())));
        this.createdBy = ((CreatedBy) in.readValue((CreatedBy.class.getClassLoader())));
        this.customerProfile = ((Object) in.readValue((Object.class.getClassLoader())));
        this.emailAddress = ((String) in.readValue((String.class.getClassLoader())));
        this.firstName = ((String) in.readValue((String.class.getClassLoader())));
        this.id = ((int) in.readValue((int.class.getClassLoader())));
        this.isInMultipleQueue = ((Object) in.readValue((Object.class.getClassLoader())));
        this.language = ((Language) in.readValue((Language.class.getClassLoader())));
        this.merchantCustomer = ((MerchantCustomer) in.readValue((MerchantCustomer.class.getClassLoader())));
        this.mobileNetwork = ((Object) in.readValue((Object.class.getClassLoader())));
        this.mobileNumber = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.notes = ((String) in.readValue((String.class.getClassLoader())));
        this.numberCountryCode = ((String) in.readValue((String.class.getClassLoader())));
        this.orderNumber = ((Object) in.readValue((Object.class.getClassLoader())));
        this.pagerNumber = ((Object) in.readValue((Object.class.getClassLoader())));
        this.surname = ((String) in.readValue((String.class.getClassLoader())));
        this.ticketNumber = ((String) in.readValue((String.class.getClassLoader())));
        this.unreadMessages = ((int) in.readValue((int.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public QudiniCustomer() {
    }

    /**
     *
     * @param unreadMessages
     * @param isInMultipleQueue
     * @param bookingRef
     * @param merchantCustomer
     * @param surname
     * @param emailAddress
     * @param ticketNumber
     * @param id
     * @param createdBy
     * @param numberCountryCode
     * @param orderNumber
     * @param name
     * @param pagerNumber
     * @param mobileNetwork
     * @param language
     * @param notes
     * @param customerProfile
     * @param firstName
     * @param mobileNumber
     */
    public QudiniCustomer(String bookingRef, CreatedBy createdBy, Object customerProfile, String emailAddress, String firstName, int id, Object isInMultipleQueue, Language language, MerchantCustomer merchantCustomer, Object mobileNetwork, String mobileNumber, String name, String notes, String numberCountryCode, Object orderNumber, Object pagerNumber, String surname, String ticketNumber, int unreadMessages) {
        super();
        this.bookingRef = bookingRef;
        this.createdBy = createdBy;
        this.customerProfile = customerProfile;
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.id = id;
        this.isInMultipleQueue = isInMultipleQueue;
        this.language = language;
        this.merchantCustomer = merchantCustomer;
        this.mobileNetwork = mobileNetwork;
        this.mobileNumber = mobileNumber;
        this.name = name;
        this.notes = notes;
        this.numberCountryCode = numberCountryCode;
        this.orderNumber = orderNumber;
        this.pagerNumber = pagerNumber;
        this.surname = surname;
        this.ticketNumber = ticketNumber;
        this.unreadMessages = unreadMessages;
    }

    public String getBookingRef() {
        return bookingRef;
    }

    public void setBookingRef(String bookingRef) {
        this.bookingRef = bookingRef;
    }

    public CreatedBy getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public Object getCustomerProfile() {
        return customerProfile;
    }

    public void setCustomerProfile(Object customerProfile) {
        this.customerProfile = customerProfile;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getIsInMultipleQueue() {
        return isInMultipleQueue;
    }

    public void setIsInMultipleQueue(Object isInMultipleQueue) {
        this.isInMultipleQueue = isInMultipleQueue;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public MerchantCustomer getMerchantCustomer() {
        return merchantCustomer;
    }

    public void setMerchantCustomer(MerchantCustomer merchantCustomer) {
        this.merchantCustomer = merchantCustomer;
    }

    public Object getMobileNetwork() {
        return mobileNetwork;
    }

    public void setMobileNetwork(Object mobileNetwork) {
        this.mobileNetwork = mobileNetwork;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNumberCountryCode() {
        return numberCountryCode;
    }

    public void setNumberCountryCode(String numberCountryCode) {
        this.numberCountryCode = numberCountryCode;
    }

    public Object getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Object orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Object getPagerNumber() {
        return pagerNumber;
    }

    public void setPagerNumber(Object pagerNumber) {
        this.pagerNumber = pagerNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public int getUnreadMessages() {
        return unreadMessages;
    }

    public void setUnreadMessages(int unreadMessages) {
        this.unreadMessages = unreadMessages;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(bookingRef);
        dest.writeValue(createdBy);
        dest.writeValue(customerProfile);
        dest.writeValue(emailAddress);
        dest.writeValue(firstName);
        dest.writeValue(id);
        dest.writeValue(isInMultipleQueue);
        dest.writeValue(language);
        dest.writeValue(merchantCustomer);
        dest.writeValue(mobileNetwork);
        dest.writeValue(mobileNumber);
        dest.writeValue(name);
        dest.writeValue(notes);
        dest.writeValue(numberCountryCode);
        dest.writeValue(orderNumber);
        dest.writeValue(pagerNumber);
        dest.writeValue(surname);
        dest.writeValue(ticketNumber);
        dest.writeValue(unreadMessages);
    }

    public int describeContents() {
        return 0;
    }

}