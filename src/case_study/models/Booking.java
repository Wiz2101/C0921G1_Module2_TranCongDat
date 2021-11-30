package case_study.models;

import java.util.Comparator;
import java.util.Objects;

public class Booking {
    private String bookingID;
    private String startDate;
    private String endDate;
    private String customerID;
    private String serviceName;
    private String ServiceType;

    public Booking() {
    }

    public Booking(String bookingID, String startDate, String endDate, String customerID, String serviceName, String serviceType) {
        this.bookingID = bookingID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerID = customerID;
        this.serviceName = serviceName;
        ServiceType = serviceType;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return ServiceType;
    }

    public void setServiceType(String serviceType) {
        ServiceType = serviceType;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID='" + bookingID + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customerID='" + customerID + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", ServiceType='" + ServiceType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(bookingID, booking.bookingID) &&
                Objects.equals(startDate, booking.startDate) &&
                Objects.equals(endDate, booking.endDate) &&
                Objects.equals(customerID, booking.customerID) &&
                Objects.equals(serviceName, booking.serviceName) &&
                Objects.equals(ServiceType, booking.ServiceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingID, startDate, endDate, customerID, serviceName, ServiceType);
    }
}
