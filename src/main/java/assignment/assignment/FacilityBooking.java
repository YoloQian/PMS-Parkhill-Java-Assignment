/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.assignment;

/**
 *
 * @author TeD
 */
public class FacilityBooking {
    
    private String facilityBookingId;
    private String facilityId;
    private String facilityName;
    private String tenantId;
    private String bookingDate;
    private String bookingStartTime;
    private String bookingEndTime;
    
    public FacilityBooking(String facilityBookingId, String facilityId, String facilityName, String tenantId, String bookingDate, String bookingStartTime, String bookingEndTime) {
        this.facilityBookingId = facilityBookingId;
        this.facilityId = facilityId;
        this.facilityName = facilityName;
        this.tenantId = tenantId;
        this.bookingDate = bookingDate;
        this.bookingStartTime = bookingStartTime;
        this.bookingEndTime = bookingEndTime;
    }
    
    public String getFacilityBookingId() {
        return facilityBookingId;
    }

    public void setFacilityBookingId(String facilityBookingId) {
        this.facilityBookingId = facilityBookingId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getBookingStartTime() {
        return bookingStartTime;
    }

    public void setBookingStartTime(String bookingStartTime) {
        this.bookingStartTime = bookingStartTime;
    }

    public String getBookingEndTime() {
        return bookingEndTime;
    }

    public void setBookingEndTime(String bookingEndTime) {
        this.bookingEndTime = bookingEndTime;
    }
    
    
}
