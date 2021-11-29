package case_study.models;

public class Employee extends Person{
//    private String degree[] = {"Intermediate", "College", "University", "Graduate"};
//    private String position [] = {"Receptionist", "Waiter", "Executive","Supervisor", "Manager", "Director"};
    private String degree;
    private String position;
    private int salary;

    public Employee(){}

    public Employee(String id, String fullName, String dob, long idCard, String phoneNumber, String email) {
        super(id, fullName, dob, idCard, phoneNumber, email);
    }

    public Employee(String id, String fullName, String dob, long idCard, String phoneNumber, String email, String degree, String position, int salary) {
        super(id, fullName, dob, idCard, phoneNumber, email);
        this.degree = degree;
        this.position = position;
        this.salary = salary;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                ", degree='" + degree + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
