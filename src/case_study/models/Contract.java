package case_study.models;

import java.util.Objects;

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

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getBookingNo() {
        return bookingNo;
    }

    public void setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
    }

    public long getDeposit() {
        return deposit;
    }

    public void setDeposit(long deposit) {
        this.deposit = deposit;
    }

    public long getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(long totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getCustomerNo() {
        return CustomerNo;
    }

    public void setCustomerNo(String customerNo) {
        CustomerNo = customerNo;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNo='" + contractNo + '\'' +
                ", bookingNo='" + bookingNo + '\'' +
                ", deposit=" + deposit +
                ", totalPayment=" + totalPayment +
                ", CustomerNo='" + CustomerNo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return deposit == contract.deposit &&
                totalPayment == contract.totalPayment &&
                Objects.equals(contractNo, contract.contractNo) &&
                Objects.equals(bookingNo, contract.bookingNo) &&
                Objects.equals(CustomerNo, contract.CustomerNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contractNo, bookingNo, deposit, totalPayment, CustomerNo);
    }
}
