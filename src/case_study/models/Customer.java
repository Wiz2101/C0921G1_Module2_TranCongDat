package case_study.models;

public class Customer extends Person {
//    private String[] customerType = {"Diamond", "Platinium", "Gold", "Silver", "Member"};
    private String customerType;

    public Customer() {
    }

    public Customer(String id, String fullName, String dob, long idCard, String phoneNumber, String email, String customerType) {
        super(id, fullName, dob, idCard, phoneNumber, email);
        this.customerType = customerType;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                "customerType='" + customerType + '\'' +
                '}';
    }
}
