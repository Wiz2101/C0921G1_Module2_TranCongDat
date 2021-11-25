package case_study.models;

public abstract class Person {
    private String id;
    private String fullName;
    private String dob;
    private long idCard;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String id, String fullName, String dob, long idCard, String phoneNumber, String email){
        this.id = id;
        this.fullName = fullName;
        this.dob = dob;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public long getIdCard() {
        return idCard;
    }

    public void setIdCard(long idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dob='" + dob + '\'' +
                ", idCard=" + idCard +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email;
    }
}
