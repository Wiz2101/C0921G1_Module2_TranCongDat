package case_study.models;

public class Booking {
    private String bookingNo;
    private String startDate;
    private String endDate;
    private String id;
    private String ServiceType;

    public Booking(String bookingNo, String startDate, String endDate, String id, String serviceType) {
        this.bookingNo = bookingNo;
        this.startDate = startDate;
        this.endDate = endDate;
        this.id = id;
        this.ServiceType = serviceType;
    }

    public String getBookingNo() {
        return bookingNo;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getId() {
        return id;
    }

    public String getServiceType() {
        return ServiceType;
    }
}
