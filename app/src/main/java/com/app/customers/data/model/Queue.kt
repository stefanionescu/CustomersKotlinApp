package com.app.customers.data.model

import java.util.ArrayList

import android.os.Parcel
import android.os.Parcelable

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Queue {

    @SerializedName("advanceBookingsMinutes")
    @Expose
    var advanceBookingsMinutes: Int? = null
    @SerializedName("advanceBookingsWeeks")
    @Expose
    var advanceBookingsWeeks: Int? = null
    @SerializedName("advisorCannotChooseCustomer")
    @Expose
    var advisorCannotChooseCustomer: Boolean? = null
    @SerializedName("allowedToToggleCustomerDescriptionOption")
    @Expose
    var allowedToToggleCustomerDescriptionOption: Boolean? = null
    @SerializedName("applyTicketNumber")
    @Expose
    var applyTicketNumber: Boolean? = null
    @SerializedName("averageServeTimeMinutes")
    @Expose
    var averageServeTimeMinutes: Int? = null
    @SerializedName("bookingStart")
    @Expose
    var bookingStart: Int? = null
    @SerializedName("bookingTimings")
    @Expose
    var bookingTimings: String? = null
    @SerializedName("bufferSpace")
    @Expose
    var bufferSpace: Int? = null
    @SerializedName("captureOrderNumber")
    @Expose
    var captureOrderNumber: Boolean? = null
    @SerializedName("clearQueueOvernight")
    @Expose
    var clearQueueOvernight: Boolean? = null
    @SerializedName("colour")
    @Expose
    var colour: Any? = null
    @SerializedName("conciergeAcceptReject")
    @Expose
    var conciergeAcceptReject: Boolean? = null
    @SerializedName("customerDescriptionEnabled")
    @Expose
    var customerDescriptionEnabled: Boolean? = null
    @SerializedName("customerEmailRequired")
    @Expose
    var customerEmailRequired: Boolean? = null
    @SerializedName("customerNameRequired")
    @Expose
    var customerNameRequired: Boolean? = null
    @SerializedName("customerNameRequiredKiosk")
    @Expose
    var customerNameRequiredKiosk: Boolean? = null
    @SerializedName("customerPostcodeRequired")
    @Expose
    var customerPostcodeRequired: Boolean? = null
    @SerializedName("customerSurnameRequired")
    @Expose
    var customerSurnameRequired: Boolean? = null
    @SerializedName("customerTimings")
    @Expose
    var customerTimings: String? = null
    @SerializedName("customersToday")
    @Expose
    var customersToday: List<QudiniCustomersToday>? = null
    @SerializedName("finishReminder")
    @Expose
    var finishReminder: Boolean? = null
    @SerializedName("forceAdvisorToReportOutcome")
    @Expose
    var forceAdvisorToReportOutcome: Boolean? = null
    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("identifier")
    @Expose
    var identifier: String? = null
    @SerializedName("isBookingAllowed")
    @Expose
    var isBookingAllowed: Boolean? = null
    @SerializedName("isRestaurant")
    @Expose
    var isRestaurant: Boolean? = null
    @SerializedName("isRetainTicketNumber")
    @Expose
    var isRetainTicketNumber: Boolean? = null
    @SerializedName("isTabletCollectionEnabled")
    @Expose
    var isTabletCollectionEnabled: Boolean? = null
    @SerializedName("isWalkinAllowed")
    @Expose
    var isWalkinAllowed: Boolean? = null
    @SerializedName("maxQueueLength")
    @Expose
    var maxQueueLength: Any? = null
    @SerializedName("minWaitTimeMinutes")
    @Expose
    var minWaitTimeMinutes: Any? = null
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("numberWithDuplicatedNameKiosk")
    @Expose
    var numberWithDuplicatedNameKiosk: Boolean? = null
    @SerializedName("outcomeReportingBooking")
    @Expose
    var outcomeReportingBooking: Boolean? = null
    @SerializedName("outcomeReportingWalkin")
    @Expose
    var outcomeReportingWalkin: Boolean? = null
    @SerializedName("outcomesEnabled")
    @Expose
    var outcomesEnabled: Boolean? = null
    @SerializedName("pagerRequired")
    @Expose
    var pagerRequired: Boolean? = null
    @SerializedName("queueMessagesThresholdMinutes")
    @Expose
    var queueMessagesThresholdMinutes: Int? = null
    @SerializedName("queueMessagesThresholdPosition")
    @Expose
    var queueMessagesThresholdPosition: Int? = null
    @SerializedName("rejectReasonAllowFreeText")
    @Expose
    var rejectReasonAllowFreeText: Boolean? = null
    @SerializedName("rejectReasons")
    @Expose
    var rejectReasons: List<Any>? = null
    @SerializedName("removeCustomerEnabled")
    @Expose
    var removeCustomerEnabled: Boolean? = null
    @SerializedName("removeCustomerHours")
    @Expose
    var removeCustomerHours: Any? = null
    @SerializedName("removeCustomerMins")
    @Expose
    var removeCustomerMins: Any? = null
    @SerializedName("removeCustomerMinutes")
    @Expose
    var removeCustomerMinutes: Any? = null
    @SerializedName("requestOutcomeAdvisors")
    @Expose
    var requestOutcomeAdvisors: Boolean? = null
    @SerializedName("requestOutcomeConcierge")
    @Expose
    var requestOutcomeConcierge: Boolean? = null
    @SerializedName("requiredMpn")
    @Expose
    var requiredMpn: Boolean? = null
    @SerializedName("secondsAcceptReject")
    @Expose
    var secondsAcceptReject: Int? = null
    @SerializedName("serverAcceptReject")
    @Expose
    var serverAcceptReject: Boolean? = null
    @SerializedName("serverAllowedBreak")
    @Expose
    var serverAllowedBreak: Boolean? = null
    @SerializedName("serverCannotViewProducts")
    @Expose
    var serverCannotViewProducts: Boolean? = null
    @SerializedName("servers")
    @Expose
    var servers: List<Server_>? = null
    @SerializedName("servingServers")
    @Expose
    var servingServers: List<Any>? = null
    @SerializedName("showAllUncollected")
    @Expose
    var showAllUncollected: Boolean? = null
    @SerializedName("showAssignedCustomerPopup")
    @Expose
    var showAssignedCustomerPopup: Boolean? = null
    @SerializedName("skipJoinMessage")
    @Expose
    var skipJoinMessage: Boolean? = null
    @SerializedName("smsLanguagesEnabled")
    @Expose
    var smsLanguagesEnabled: List<Any>? = null
    @SerializedName("smsRestricted")
    @Expose
    var smsRestricted: Boolean? = null
    @SerializedName("snsTopicArn")
    @Expose
    var snsTopicArn: String? = null
    @SerializedName("staffBookingAvailability")
    @Expose
    var staffBookingAvailability: Int? = null
    @SerializedName("staffTimings")
    @Expose
    var staffTimings: String? = null
    @SerializedName("tagSelectionList")
    @Expose
    var tagSelectionList: List<Any>? = null
    @SerializedName("tags")
    @Expose
    var tags: List<Any>? = null
    @SerializedName("ticketNumberTag")
    @Expose
    var ticketNumberTag: String? = null
    @SerializedName("unreadMessagesForQueue")
    @Expose
    var unreadMessagesForQueue: Int? = null
    @SerializedName("venue")
    @Expose
    var venue: Venue? = null

}