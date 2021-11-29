package case_study.models;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return idCard == person.idCard &&
                Objects.equals(id, person.id) &&
                Objects.equals(fullName, person.fullName) &&
                Objects.equals(dob, person.dob) &&
                Objects.equals(phoneNumber, person.phoneNumber) &&
                Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, dob, idCard, phoneNumber, email);
    }
}
