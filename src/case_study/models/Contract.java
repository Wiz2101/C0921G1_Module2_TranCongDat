package case_study.models;

public class Contract {
    private String contractNo;
    private String bookingNo;
    private long deposit;
    private long totalPayment;
    private String CustomerNo;

    public Contract(String contractNo, String bookingNo, long deposit, long totalPayment, String customerNo) {
        this.contractNo = contractNo;
        this.bookingNo = bookingNo;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
        CustomerNo = customerNo;
    }
}
