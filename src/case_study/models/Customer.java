package case_study.models;

public class Customer extends Person {
    private String[] customerType = {"Diamond", "Platinium", "Gold", "Silver", "Member"};


    public Customer(int id, String fullName, String dob, int idCard, int phoneNumber, String email, String[] customerType) {
        super(id, fullName, dob, idCard, phoneNumber, email);
        this.customerType = customerType;
    }


}
