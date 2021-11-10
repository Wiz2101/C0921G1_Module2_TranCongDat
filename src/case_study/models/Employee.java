package case_study.models;

public class Employee extends Person{
    private String degree[] = {"Intermediate", "College", "University", "Graduate"};
    private String position [] = {"Receptionist", "Waiter", "Executive","Supervisor", "Manager", "Director"};
    private int salary;

    public Employee(int id, String fullName, String dob, int idCard, int phoneNumber, String email, String[] degree, String[] position, int salary) {
        super(id, fullName, dob, idCard, phoneNumber, email);
        this.degree = degree;
        this.position = position;
        this.salary = salary;
    }
}
