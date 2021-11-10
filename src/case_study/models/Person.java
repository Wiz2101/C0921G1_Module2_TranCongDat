package case_study.models;

public abstract class Person {
    private int id;
    private String fullName;
    private String dob;
    private int idCard;
    private int phoneNumber;
    private String email;


    public Person(int id, String fullName, String dob, int idCard, int phoneNumber, String email){
        this.id = id;
        this.fullName = fullName;
        this.dob = dob;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

}
