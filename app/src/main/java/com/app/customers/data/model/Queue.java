package com.app.customers.data.model;

import java.util.List;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Queue implements Parcelable {

    @SerializedName("advanceBookingsMinutes")
    @Expose
    private int advanceBookingsMinutes;
    @SerializedName("advanceBookingsWeeks")
    @Expose
    private int advanceBookingsWeeks;
    @SerializedName("advisorCannotChooseCustomer")
    @Expose
    private boolean advisorCannotChooseCustomer;
    @SerializedName("allowedToToggleCustomerDescriptionOption")
    @Expose
    private boolean allowedToToggleCustomerDescriptionOption;
    @SerializedName("applyTicketNumber")
    @Expose
    private boolean applyTicketNumber;
    @SerializedName("averageServeTimeMinutes")
    @Expose
    private int averageServeTimeMinutes;
    @SerializedName("bookingStart")
    @Expose
    private int bookingStart;
    @SerializedName("bookingTimings")
    @Expose
    private String bookingTimings;
    @SerializedName("bufferSpace")
    @Expose
    private int bufferSpace;
    @SerializedName("captureOrderNumber")
    @Expose
    private boolean captureOrderNumber;
    @SerializedName("clearQueueOvernight")
    @Expose
    private boolean clearQueueOvernight;
    @SerializedName("colour")
    @Expose
    private Object colour;
    @SerializedName("conciergeAcceptReject")
    @Expose
    private boolean conciergeAcceptReject;
    @SerializedName("customerDescriptionEnabled")
    @Expose
    private boolean customerDescriptionEnabled;
    @SerializedName("customerEmailRequired")
    @Expose
    private boolean customerEmailRequired;
    @SerializedName("customerNameRequired")
    @Expose
    private boolean customerNameRequired;
    @SerializedName("customerNameRequiredKiosk")
    @Expose
    private boolean customerNameRequiredKiosk;
    @SerializedName("customerPostcodeRequired")
    @Expose
    private boolean customerPostcodeRequired;
    @SerializedName("customerSurnameRequired")
    @Expose
    private boolean customerSurnameRequired;
    @SerializedName("customerTimings")
    @Expose
    private String customerTimings;
    @SerializedName("customersToday")
    @Expose
    private List<CustomersToday> customersToday = null;
    @SerializedName("finishReminder")
    @Expose
    private boolean finishReminder;
    @SerializedName("forceAdvisorToReportOutcome")
    @Expose
    private boolean forceAdvisorToReportOutcome;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("identifier")
    @Expose
    private String identifier;
    @SerializedName("isBookingAllowed")
    @Expose
    private boolean isBookingAllowed;
    @SerializedName("isRestaurant")
    @Expose
    private boolean isRestaurant;
    @SerializedName("isRetainTicketNumber")
    @Expose
    private boolean isRetainTicketNumber;
    @SerializedName("isTabletCollectionEnabled")
    @Expose
    private boolean isTabletCollectionEnabled;
    @SerializedName("isWalkinAllowed")
    @Expose
    private boolean isWalkinAllowed;
    @SerializedName("maxQueueLength")
    @Expose
    private Object maxQueueLength;
    @SerializedName("minWaitTimeMinutes")
    @Expose
    private Object minWaitTimeMinutes;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("numberWithDuplicatedNameKiosk")
    @Expose
    private boolean numberWithDuplicatedNameKiosk;
    @SerializedName("outcomeReportingBooking")
    @Expose
    private boolean outcomeReportingBooking;
    @SerializedName("outcomeReportingWalkin")
    @Expose
    private boolean outcomeReportingWalkin;
    @SerializedName("outcomesEnabled")
    @Expose
    private boolean outcomesEnabled;
    @SerializedName("pagerRequired")
    @Expose
    private boolean pagerRequired;
    @SerializedName("queueMessagesThresholdMinutes")
    @Expose
    private int queueMessagesThresholdMinutes;
    @SerializedName("queueMessagesThresholdPosition")
    @Expose
    private int queueMessagesThresholdPosition;
    @SerializedName("rejectReasonAllowFreeText")
    @Expose
    private boolean rejectReasonAllowFreeText;
    @SerializedName("rejectReasons")
    @Expose
    private List<Object> rejectReasons = null;
    @SerializedName("removeCustomerEnabled")
    @Expose
    private boolean removeCustomerEnabled;
    @SerializedName("removeCustomerHours")
    @Expose
    private Object removeCustomerHours;
    @SerializedName("removeCustomerMins")
    @Expose
    private Object removeCustomerMins;
    @SerializedName("removeCustomerMinutes")
    @Expose
    private Object removeCustomerMinutes;
    @SerializedName("requestOutcomeAdvisors")
    @Expose
    private boolean requestOutcomeAdvisors;
    @SerializedName("requestOutcomeConcierge")
    @Expose
    private boolean requestOutcomeConcierge;
    @SerializedName("requiredMpn")
    @Expose
    private boolean requiredMpn;
    @SerializedName("secondsAcceptReject")
    @Expose
    private int secondsAcceptReject;
    @SerializedName("serverAcceptReject")
    @Expose
    private boolean serverAcceptReject;
    @SerializedName("serverAllowedBreak")
    @Expose
    private boolean serverAllowedBreak;
    @SerializedName("serverCannotViewProducts")
    @Expose
    private boolean serverCannotViewProducts;
    @SerializedName("servers")
    @Expose
    private List<Server> servers = null;
    @SerializedName("servingServers")
    @Expose
    private List<Object> servingServers = null;
    @SerializedName("showAllUncollected")
    @Expose
    private boolean showAllUncollected;
    @SerializedName("showAssignedCustomerPopup")
    @Expose
    private boolean showAssignedCustomerPopup;
    @SerializedName("skipJoinMessage")
    @Expose
    private boolean skipJoinMessage;
    @SerializedName("smsLanguagesEnabled")
    @Expose
    private List<Object> smsLanguagesEnabled = null;
    @SerializedName("smsRestricted")
    @Expose
    private boolean smsRestricted;
    @SerializedName("snsTopicArn")
    @Expose
    private String snsTopicArn;
    @SerializedName("staffBookingAvailability")
    @Expose
    private int staffBookingAvailability;
    @SerializedName("staffTimings")
    @Expose
    private String staffTimings;
    @SerializedName("tagSelectionList")
    @Expose
    private List<Object> tagSelectionList = null;
    @SerializedName("tags")
    @Expose
    private List<Object> tags = null;
    @SerializedName("ticketNumberTag")
    @Expose
    private String ticketNumberTag;
    @SerializedName("unreadMessagesForQueue")
    @Expose
    private int unreadMessagesForQueue;
    @SerializedName("venue")
    @Expose
    private Venue venue;

    public final static Parcelable.Creator<Queue> CREATOR = new Creator<Queue>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Queue createFromParcel(Parcel in) {
            return new Queue(in);
        }

        public Queue[] newArray(int size) {
            return (new Queue[size]);
        }

    };

    protected Queue(Parcel in) {
        this.advanceBookingsMinutes = ((int) in.readValue((int.class.getClassLoader())));
        this.advanceBookingsWeeks = ((int) in.readValue((int.class.getClassLoader())));
        this.advisorCannotChooseCustomer = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.allowedToToggleCustomerDescriptionOption = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.applyTicketNumber = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.averageServeTimeMinutes = ((int) in.readValue((int.class.getClassLoader())));
        this.bookingStart = ((int) in.readValue((int.class.getClassLoader())));
        this.bookingTimings = ((String) in.readValue((String.class.getClassLoader())));
        this.bufferSpace = ((int) in.readValue((int.class.getClassLoader())));
        this.captureOrderNumber = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.clearQueueOvernight = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.colour = ((Object) in.readValue((Object.class.getClassLoader())));
        this.conciergeAcceptReject = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.customerDescriptionEnabled = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.customerEmailRequired = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.customerNameRequired = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.customerNameRequiredKiosk = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.customerPostcodeRequired = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.customerSurnameRequired = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.customerTimings = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.customersToday, (com.app.customers.data.model.CustomersToday.class.getClassLoader()));
        this.finishReminder = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.forceAdvisorToReportOutcome = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.id = ((int) in.readValue((int.class.getClassLoader())));
        this.identifier = ((String) in.readValue((String.class.getClassLoader())));
        this.isBookingAllowed = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.isRestaurant = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.isRetainTicketNumber = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.isTabletCollectionEnabled = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.isWalkinAllowed = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.maxQueueLength = ((Object) in.readValue((Object.class.getClassLoader())));
        this.minWaitTimeMinutes = ((Object) in.readValue((Object.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.numberWithDuplicatedNameKiosk = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.outcomeReportingBooking = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.outcomeReportingWalkin = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.outcomesEnabled = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.pagerRequired = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.queueMessagesThresholdMinutes = ((int) in.readValue((int.class.getClassLoader())));
        this.queueMessagesThresholdPosition = ((int) in.readValue((int.class.getClassLoader())));
        this.rejectReasonAllowFreeText = ((boolean) in.readValue((boolean.class.getClassLoader())));
        in.readList(this.rejectReasons, (java.lang.Object.class.getClassLoader()));
        this.removeCustomerEnabled = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.removeCustomerHours = ((Object) in.readValue((Object.class.getClassLoader())));
        this.removeCustomerMins = ((Object) in.readValue((Object.class.getClassLoader())));
        this.removeCustomerMinutes = ((Object) in.readValue((Object.class.getClassLoader())));
        this.requestOutcomeAdvisors = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.requestOutcomeConcierge = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.requiredMpn = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.secondsAcceptReject = ((int) in.readValue((int.class.getClassLoader())));
        this.serverAcceptReject = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.serverAllowedBreak = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.serverCannotViewProducts = ((boolean) in.readValue((boolean.class.getClassLoader())));
        in.readList(this.servers, (com.app.customers.data.model.Server.class.getClassLoader()));
        in.readList(this.servingServers, (java.lang.Object.class.getClassLoader()));
        this.showAllUncollected = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.showAssignedCustomerPopup = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.skipJoinMessage = ((boolean) in.readValue((boolean.class.getClassLoader())));
        in.readList(this.smsLanguagesEnabled, (java.lang.Object.class.getClassLoader()));
        this.smsRestricted = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.snsTopicArn = ((String) in.readValue((String.class.getClassLoader())));
        this.staffBookingAvailability = ((int) in.readValue((int.class.getClassLoader())));
        this.staffTimings = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.tagSelectionList, (java.lang.Object.class.getClassLoader()));
        in.readList(this.tags, (java.lang.Object.class.getClassLoader()));
        this.ticketNumberTag = ((String) in.readValue((String.class.getClassLoader())));
        this.unreadMessagesForQueue = ((int) in.readValue((int.class.getClassLoader())));
        this.venue = ((Venue) in.readValue((Venue.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     */
    public Queue() {
    }

    public Queue(int advanceBookingsMinutes, int advanceBookingsWeeks, boolean advisorCannotChooseCustomer, boolean allowedToToggleCustomerDescriptionOption, boolean applyTicketNumber, int averageServeTimeMinutes, int bookingStart, String bookingTimings, int bufferSpace, boolean captureOrderNumber, boolean clearQueueOvernight, Object colour, boolean conciergeAcceptReject, boolean customerDescriptionEnabled, boolean customerEmailRequired, boolean customerNameRequired, boolean customerNameRequiredKiosk, boolean customerPostcodeRequired, boolean customerSurnameRequired, String customerTimings, List<CustomersToday> customersToday, boolean finishReminder, boolean forceAdvisorToReportOutcome, int id, String identifier, boolean isBookingAllowed, boolean isRestaurant, boolean isRetainTicketNumber, boolean isTabletCollectionEnabled, boolean isWalkinAllowed, Object maxQueueLength, Object minWaitTimeMinutes, String name, boolean numberWithDuplicatedNameKiosk, boolean outcomeReportingBooking, boolean outcomeReportingWalkin, boolean outcomesEnabled, boolean pagerRequired, int queueMessagesThresholdMinutes, int queueMessagesThresholdPosition, boolean rejectReasonAllowFreeText, List<Object> rejectReasons, boolean removeCustomerEnabled, Object removeCustomerHours, Object removeCustomerMins, Object removeCustomerMinutes, boolean requestOutcomeAdvisors, boolean requestOutcomeConcierge, boolean requiredMpn, int secondsAcceptReject, boolean serverAcceptReject, boolean serverAllowedBreak, boolean serverCannotViewProducts, List<Server> servers, List<Object> servingServers, boolean showAllUncollected, boolean showAssignedCustomerPopup, boolean skipJoinMessage, List<Object> smsLanguagesEnabled, boolean smsRestricted, String snsTopicArn, int staffBookingAvailability, String staffTimings, List<Object> tagSelectionList, List<Object> tags, String ticketNumberTag, int unreadMessagesForQueue, Venue venue) {
        super();
        this.advanceBookingsMinutes = advanceBookingsMinutes;
        this.advanceBookingsWeeks = advanceBookingsWeeks;
        this.advisorCannotChooseCustomer = advisorCannotChooseCustomer;
        this.allowedToToggleCustomerDescriptionOption = allowedToToggleCustomerDescriptionOption;
        this.applyTicketNumber = applyTicketNumber;
        this.averageServeTimeMinutes = averageServeTimeMinutes;
        this.bookingStart = bookingStart;
        this.bookingTimings = bookingTimings;
        this.bufferSpace = bufferSpace;
        this.captureOrderNumber = captureOrderNumber;
        this.clearQueueOvernight = clearQueueOvernight;
        this.colour = colour;
        this.conciergeAcceptReject = conciergeAcceptReject;
        this.customerDescriptionEnabled = customerDescriptionEnabled;
        this.customerEmailRequired = customerEmailRequired;
        this.customerNameRequired = customerNameRequired;
        this.customerNameRequiredKiosk = customerNameRequiredKiosk;
        this.customerPostcodeRequired = customerPostcodeRequired;
        this.customerSurnameRequired = customerSurnameRequired;
        this.customerTimings = customerTimings;
        this.customersToday = customersToday;
        this.finishReminder = finishReminder;
        this.forceAdvisorToReportOutcome = forceAdvisorToReportOutcome;
        this.id = id;
        this.identifier = identifier;
        this.isBookingAllowed = isBookingAllowed;
        this.isRestaurant = isRestaurant;
        this.isRetainTicketNumber = isRetainTicketNumber;
        this.isTabletCollectionEnabled = isTabletCollectionEnabled;
        this.isWalkinAllowed = isWalkinAllowed;
        this.maxQueueLength = maxQueueLength;
        this.minWaitTimeMinutes = minWaitTimeMinutes;
        this.name = name;
        this.numberWithDuplicatedNameKiosk = numberWithDuplicatedNameKiosk;
        this.outcomeReportingBooking = outcomeReportingBooking;
        this.outcomeReportingWalkin = outcomeReportingWalkin;
        this.outcomesEnabled = outcomesEnabled;
        this.pagerRequired = pagerRequired;
        this.queueMessagesThresholdMinutes = queueMessagesThresholdMinutes;
        this.queueMessagesThresholdPosition = queueMessagesThresholdPosition;
        this.rejectReasonAllowFreeText = rejectReasonAllowFreeText;
        this.rejectReasons = rejectReasons;
        this.removeCustomerEnabled = removeCustomerEnabled;
        this.removeCustomerHours = removeCustomerHours;
        this.removeCustomerMins = removeCustomerMins;
        this.removeCustomerMinutes = removeCustomerMinutes;
        this.requestOutcomeAdvisors = requestOutcomeAdvisors;
        this.requestOutcomeConcierge = requestOutcomeConcierge;
        this.requiredMpn = requiredMpn;
        this.secondsAcceptReject = secondsAcceptReject;
        this.serverAcceptReject = serverAcceptReject;
        this.serverAllowedBreak = serverAllowedBreak;
        this.serverCannotViewProducts = serverCannotViewProducts;
        this.servers = servers;
        this.servingServers = servingServers;
        this.showAllUncollected = showAllUncollected;
        this.showAssignedCustomerPopup = showAssignedCustomerPopup;
        this.skipJoinMessage = skipJoinMessage;
        this.smsLanguagesEnabled = smsLanguagesEnabled;
        this.smsRestricted = smsRestricted;
        this.snsTopicArn = snsTopicArn;
        this.staffBookingAvailability = staffBookingAvailability;
        this.staffTimings = staffTimings;
        this.tagSelectionList = tagSelectionList;
        this.tags = tags;
        this.ticketNumberTag = ticketNumberTag;
        this.unreadMessagesForQueue = unreadMessagesForQueue;
        this.venue = venue;
    }

    public int getAdvanceBookingsMinutes() {
        return advanceBookingsMinutes;
    }

    public void setAdvanceBookingsMinutes(int advanceBookingsMinutes) {
        this.advanceBookingsMinutes = advanceBookingsMinutes;
    }

    public int getAdvanceBookingsWeeks() {
        return advanceBookingsWeeks;
    }

    public void setAdvanceBookingsWeeks(int advanceBookingsWeeks) {
        this.advanceBookingsWeeks = advanceBookingsWeeks;
    }

    public boolean isAdvisorCannotChooseCustomer() {
        return advisorCannotChooseCustomer;
    }

    public void setAdvisorCannotChooseCustomer(boolean advisorCannotChooseCustomer) {
        this.advisorCannotChooseCustomer = advisorCannotChooseCustomer;
    }

    public boolean isAllowedToToggleCustomerDescriptionOption() {
        return allowedToToggleCustomerDescriptionOption;
    }

    public void setAllowedToToggleCustomerDescriptionOption(boolean allowedToToggleCustomerDescriptionOption) {
        this.allowedToToggleCustomerDescriptionOption = allowedToToggleCustomerDescriptionOption;
    }

    public boolean isApplyTicketNumber() {
        return applyTicketNumber;
    }

    public void setApplyTicketNumber(boolean applyTicketNumber) {
        this.applyTicketNumber = applyTicketNumber;
    }

    public int getAverageServeTimeMinutes() {
        return averageServeTimeMinutes;
    }

    public void setAverageServeTimeMinutes(int averageServeTimeMinutes) {
        this.averageServeTimeMinutes = averageServeTimeMinutes;
    }

    public int getBookingStart() {
        return bookingStart;
    }

    public void setBookingStart(int bookingStart) {
        this.bookingStart = bookingStart;
    }

    public String getBookingTimings() {
        return bookingTimings;
    }

    public void setBookingTimings(String bookingTimings) {
        this.bookingTimings = bookingTimings;
    }

    public int getBufferSpace() {
        return bufferSpace;
    }

    public void setBufferSpace(int bufferSpace) {
        this.bufferSpace = bufferSpace;
    }

    public boolean isCaptureOrderNumber() {
        return captureOrderNumber;
    }

    public void setCaptureOrderNumber(boolean captureOrderNumber) {
        this.captureOrderNumber = captureOrderNumber;
    }

    public boolean isClearQueueOvernight() {
        return clearQueueOvernight;
    }

    public void setClearQueueOvernight(boolean clearQueueOvernight) {
        this.clearQueueOvernight = clearQueueOvernight;
    }

    public Object getColour() {
        return colour;
    }

    public void setColour(Object colour) {
        this.colour = colour;
    }

    public boolean isConciergeAcceptReject() {
        return conciergeAcceptReject;
    }

    public void setConciergeAcceptReject(boolean conciergeAcceptReject) {
        this.conciergeAcceptReject = conciergeAcceptReject;
    }

    public boolean isCustomerDescriptionEnabled() {
        return customerDescriptionEnabled;
    }

    public void setCustomerDescriptionEnabled(boolean customerDescriptionEnabled) {
        this.customerDescriptionEnabled = customerDescriptionEnabled;
    }

    public boolean isCustomerEmailRequired() {
        return customerEmailRequired;
    }

    public void setCustomerEmailRequired(boolean customerEmailRequired) {
        this.customerEmailRequired = customerEmailRequired;
    }

    public boolean isCustomerNameRequired() {
        return customerNameRequired;
    }

    public void setCustomerNameRequired(boolean customerNameRequired) {
        this.customerNameRequired = customerNameRequired;
    }

    public boolean isCustomerNameRequiredKiosk() {
        return customerNameRequiredKiosk;
    }

    public void setCustomerNameRequiredKiosk(boolean customerNameRequiredKiosk) {
        this.customerNameRequiredKiosk = customerNameRequiredKiosk;
    }

    public boolean isCustomerPostcodeRequired() {
        return customerPostcodeRequired;
    }

    public void setCustomerPostcodeRequired(boolean customerPostcodeRequired) {
        this.customerPostcodeRequired = customerPostcodeRequired;
    }

    public boolean isCustomerSurnameRequired() {
        return customerSurnameRequired;
    }

    public void setCustomerSurnameRequired(boolean customerSurnameRequired) {
        this.customerSurnameRequired = customerSurnameRequired;
    }

    public String getCustomerTimings() {
        return customerTimings;
    }

    public void setCustomerTimings(String customerTimings) {
        this.customerTimings = customerTimings;
    }

    public List<CustomersToday> getCustomersToday() {
        return customersToday;
    }

    public void setCustomersToday(List<CustomersToday> customersToday) {
        this.customersToday = customersToday;
    }

    public boolean isFinishReminder() {
        return finishReminder;
    }

    public void setFinishReminder(boolean finishReminder) {
        this.finishReminder = finishReminder;
    }

    public boolean isForceAdvisorToReportOutcome() {
        return forceAdvisorToReportOutcome;
    }

    public void setForceAdvisorToReportOutcome(boolean forceAdvisorToReportOutcome) {
        this.forceAdvisorToReportOutcome = forceAdvisorToReportOutcome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public boolean isIsBookingAllowed() {
        return isBookingAllowed;
    }

    public void setIsBookingAllowed(boolean isBookingAllowed) {
        this.isBookingAllowed = isBookingAllowed;
    }

    public boolean isIsRestaurant() {
        return isRestaurant;
    }

    public void setIsRestaurant(boolean isRestaurant) {
        this.isRestaurant = isRestaurant;
    }

    public boolean isIsRetainTicketNumber() {
        return isRetainTicketNumber;
    }

    public void setIsRetainTicketNumber(boolean isRetainTicketNumber) {
        this.isRetainTicketNumber = isRetainTicketNumber;
    }

    public boolean isIsTabletCollectionEnabled() {
        return isTabletCollectionEnabled;
    }

    public void setIsTabletCollectionEnabled(boolean isTabletCollectionEnabled) {
        this.isTabletCollectionEnabled = isTabletCollectionEnabled;
    }

    public boolean isIsWalkinAllowed() {
        return isWalkinAllowed;
    }

    public void setIsWalkinAllowed(boolean isWalkinAllowed) {
        this.isWalkinAllowed = isWalkinAllowed;
    }

    public Object getMaxQueueLength() {
        return maxQueueLength;
    }

    public void setMaxQueueLength(Object maxQueueLength) {
        this.maxQueueLength = maxQueueLength;
    }

    public Object getMinWaitTimeMinutes() {
        return minWaitTimeMinutes;
    }

    public void setMinWaitTimeMinutes(Object minWaitTimeMinutes) {
        this.minWaitTimeMinutes = minWaitTimeMinutes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNumberWithDuplicatedNameKiosk() {
        return numberWithDuplicatedNameKiosk;
    }

    public void setNumberWithDuplicatedNameKiosk(boolean numberWithDuplicatedNameKiosk) {
        this.numberWithDuplicatedNameKiosk = numberWithDuplicatedNameKiosk;
    }

    public boolean isOutcomeReportingBooking() {
        return outcomeReportingBooking;
    }

    public void setOutcomeReportingBooking(boolean outcomeReportingBooking) {
        this.outcomeReportingBooking = outcomeReportingBooking;
    }

    public boolean isOutcomeReportingWalkin() {
        return outcomeReportingWalkin;
    }

    public void setOutcomeReportingWalkin(boolean outcomeReportingWalkin) {
        this.outcomeReportingWalkin = outcomeReportingWalkin;
    }

    public boolean isOutcomesEnabled() {
        return outcomesEnabled;
    }

    public void setOutcomesEnabled(boolean outcomesEnabled) {
        this.outcomesEnabled = outcomesEnabled;
    }

    public boolean isPagerRequired() {
        return pagerRequired;
    }

    public void setPagerRequired(boolean pagerRequired) {
        this.pagerRequired = pagerRequired;
    }

    public int getQueueMessagesThresholdMinutes() {
        return queueMessagesThresholdMinutes;
    }

    public void setQueueMessagesThresholdMinutes(int queueMessagesThresholdMinutes) {
        this.queueMessagesThresholdMinutes = queueMessagesThresholdMinutes;
    }

    public int getQueueMessagesThresholdPosition() {
        return queueMessagesThresholdPosition;
    }

    public void setQueueMessagesThresholdPosition(int queueMessagesThresholdPosition) {
        this.queueMessagesThresholdPosition = queueMessagesThresholdPosition;
    }

    public boolean isRejectReasonAllowFreeText() {
        return rejectReasonAllowFreeText;
    }

    public void setRejectReasonAllowFreeText(boolean rejectReasonAllowFreeText) {
        this.rejectReasonAllowFreeText = rejectReasonAllowFreeText;
    }

    public List<Object> getRejectReasons() {
        return rejectReasons;
    }

    public void setRejectReasons(List<Object> rejectReasons) {
        this.rejectReasons = rejectReasons;
    }

    public boolean isRemoveCustomerEnabled() {
        return removeCustomerEnabled;
    }

    public void setRemoveCustomerEnabled(boolean removeCustomerEnabled) {
        this.removeCustomerEnabled = removeCustomerEnabled;
    }

    public Object getRemoveCustomerHours() {
        return removeCustomerHours;
    }

    public void setRemoveCustomerHours(Object removeCustomerHours) {
        this.removeCustomerHours = removeCustomerHours;
    }

    public Object getRemoveCustomerMins() {
        return removeCustomerMins;
    }

    public void setRemoveCustomerMins(Object removeCustomerMins) {
        this.removeCustomerMins = removeCustomerMins;
    }

    public Object getRemoveCustomerMinutes() {
        return removeCustomerMinutes;
    }

    public void setRemoveCustomerMinutes(Object removeCustomerMinutes) {
        this.removeCustomerMinutes = removeCustomerMinutes;
    }

    public boolean isRequestOutcomeAdvisors() {
        return requestOutcomeAdvisors;
    }

    public void setRequestOutcomeAdvisors(boolean requestOutcomeAdvisors) {
        this.requestOutcomeAdvisors = requestOutcomeAdvisors;
    }

    public boolean isRequestOutcomeConcierge() {
        return requestOutcomeConcierge;
    }

    public void setRequestOutcomeConcierge(boolean requestOutcomeConcierge) {
        this.requestOutcomeConcierge = requestOutcomeConcierge;
    }

    public boolean isRequiredMpn() {
        return requiredMpn;
    }

    public void setRequiredMpn(boolean requiredMpn) {
        this.requiredMpn = requiredMpn;
    }

    public int getSecondsAcceptReject() {
        return secondsAcceptReject;
    }

    public void setSecondsAcceptReject(int secondsAcceptReject) {
        this.secondsAcceptReject = secondsAcceptReject;
    }

    public boolean isServerAcceptReject() {
        return serverAcceptReject;
    }

    public void setServerAcceptReject(boolean serverAcceptReject) {
        this.serverAcceptReject = serverAcceptReject;
    }

    public boolean isServerAllowedBreak() {
        return serverAllowedBreak;
    }

    public void setServerAllowedBreak(boolean serverAllowedBreak) {
        this.serverAllowedBreak = serverAllowedBreak;
    }

    public boolean isServerCannotViewProducts() {
        return serverCannotViewProducts;
    }

    public void setServerCannotViewProducts(boolean serverCannotViewProducts) {
        this.serverCannotViewProducts = serverCannotViewProducts;
    }

    public List<Server> getServers() {
        return servers;
    }

    public void setServers(List<Server> servers) {
        this.servers = servers;
    }

    public List<Object> getServingServers() {
        return servingServers;
    }

    public void setServingServers(List<Object> servingServers) {
        this.servingServers = servingServers;
    }

    public boolean isShowAllUncollected() {
        return showAllUncollected;
    }

    public void setShowAllUncollected(boolean showAllUncollected) {
        this.showAllUncollected = showAllUncollected;
    }

    public boolean isShowAssignedCustomerPopup() {
        return showAssignedCustomerPopup;
    }

    public void setShowAssignedCustomerPopup(boolean showAssignedCustomerPopup) {
        this.showAssignedCustomerPopup = showAssignedCustomerPopup;
    }

    public boolean isSkipJoinMessage() {
        return skipJoinMessage;
    }

    public void setSkipJoinMessage(boolean skipJoinMessage) {
        this.skipJoinMessage = skipJoinMessage;
    }

    public List<Object> getSmsLanguagesEnabled() {
        return smsLanguagesEnabled;
    }

    public void setSmsLanguagesEnabled(List<Object> smsLanguagesEnabled) {
        this.smsLanguagesEnabled = smsLanguagesEnabled;
    }

    public boolean isSmsRestricted() {
        return smsRestricted;
    }

    public void setSmsRestricted(boolean smsRestricted) {
        this.smsRestricted = smsRestricted;
    }

    public String getSnsTopicArn() {
        return snsTopicArn;
    }

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    public int getStaffBookingAvailability() {
        return staffBookingAvailability;
    }

    public void setStaffBookingAvailability(int staffBookingAvailability) {
        this.staffBookingAvailability = staffBookingAvailability;
    }

    public String getStaffTimings() {
        return staffTimings;
    }

    public void setStaffTimings(String staffTimings) {
        this.staffTimings = staffTimings;
    }

    public List<Object> getTagSelectionList() {
        return tagSelectionList;
    }

    public void setTagSelectionList(List<Object> tagSelectionList) {
        this.tagSelectionList = tagSelectionList;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public String getTicketNumberTag() {
        return ticketNumberTag;
    }

    public void setTicketNumberTag(String ticketNumberTag) {
        this.ticketNumberTag = ticketNumberTag;
    }

    public int getUnreadMessagesForQueue() {
        return unreadMessagesForQueue;
    }

    public void setUnreadMessagesForQueue(int unreadMessagesForQueue) {
        this.unreadMessagesForQueue = unreadMessagesForQueue;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(advanceBookingsMinutes);
        dest.writeValue(advanceBookingsWeeks);
        dest.writeValue(advisorCannotChooseCustomer);
        dest.writeValue(allowedToToggleCustomerDescriptionOption);
        dest.writeValue(applyTicketNumber);
        dest.writeValue(averageServeTimeMinutes);
        dest.writeValue(bookingStart);
        dest.writeValue(bookingTimings);
        dest.writeValue(bufferSpace);
        dest.writeValue(captureOrderNumber);
        dest.writeValue(clearQueueOvernight);
        dest.writeValue(colour);
        dest.writeValue(conciergeAcceptReject);
        dest.writeValue(customerDescriptionEnabled);
        dest.writeValue(customerEmailRequired);
        dest.writeValue(customerNameRequired);
        dest.writeValue(customerNameRequiredKiosk);
        dest.writeValue(customerPostcodeRequired);
        dest.writeValue(customerSurnameRequired);
        dest.writeValue(customerTimings);
        dest.writeList(customersToday);
        dest.writeValue(finishReminder);
        dest.writeValue(forceAdvisorToReportOutcome);
        dest.writeValue(id);
        dest.writeValue(identifier);
        dest.writeValue(isBookingAllowed);
        dest.writeValue(isRestaurant);
        dest.writeValue(isRetainTicketNumber);
        dest.writeValue(isTabletCollectionEnabled);
        dest.writeValue(isWalkinAllowed);
        dest.writeValue(maxQueueLength);
        dest.writeValue(minWaitTimeMinutes);
        dest.writeValue(name);
        dest.writeValue(numberWithDuplicatedNameKiosk);
        dest.writeValue(outcomeReportingBooking);
        dest.writeValue(outcomeReportingWalkin);
        dest.writeValue(outcomesEnabled);
        dest.writeValue(pagerRequired);
        dest.writeValue(queueMessagesThresholdMinutes);
        dest.writeValue(queueMessagesThresholdPosition);
        dest.writeValue(rejectReasonAllowFreeText);
        dest.writeList(rejectReasons);
        dest.writeValue(removeCustomerEnabled);
        dest.writeValue(removeCustomerHours);
        dest.writeValue(removeCustomerMins);
        dest.writeValue(removeCustomerMinutes);
        dest.writeValue(requestOutcomeAdvisors);
        dest.writeValue(requestOutcomeConcierge);
        dest.writeValue(requiredMpn);
        dest.writeValue(secondsAcceptReject);
        dest.writeValue(serverAcceptReject);
        dest.writeValue(serverAllowedBreak);
        dest.writeValue(serverCannotViewProducts);
        dest.writeList(servers);
        dest.writeList(servingServers);
        dest.writeValue(showAllUncollected);
        dest.writeValue(showAssignedCustomerPopup);
        dest.writeValue(skipJoinMessage);
        dest.writeList(smsLanguagesEnabled);
        dest.writeValue(smsRestricted);
        dest.writeValue(snsTopicArn);
        dest.writeValue(staffBookingAvailability);
        dest.writeValue(staffTimings);
        dest.writeList(tagSelectionList);
        dest.writeList(tags);
        dest.writeValue(ticketNumberTag);
        dest.writeValue(unreadMessagesForQueue);
        dest.writeValue(venue);
    }

    public int describeContents() {
        return 0;
    }

}