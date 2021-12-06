package case_study.services.impl;

import case_study.models.Employee;
import case_study.services.EmployeeService;
import case_study.validates.Validates;

import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    Employee employee = new Employee();
    Scanner scanner = new Scanner(System.in);
    public static List<Employee> employeeList;

    static {
        employeeList = EmployeeWriteReadServiceImpl.convertStringToEmployee();
    }

    @Override
    public void add() {
        System.out.println("Enter the id");
        String id = Validates.id(scanner.nextLine());
        System.out.println("Enter the full name");
        String name = Validates.string(scanner.nextLine());
        System.out.println("Enter the birthday");
        String dob = Validates.date(scanner.nextLine());
        System.out.println("Enter the idCard");
        String idCard = Validates.idCard(scanner.nextLine());
        System.out.println("Enter the phone number");
        String phoneNum = Validates.phoneNumber(scanner.nextLine());
        System.out.println("Enter the email");
        String email = Validates.email(scanner.nextLine());
        System.out.println("Please choose 1 in 4 of degree as below:");
        System.out.println("1. Intermediate");
        System.out.println("2. College");
        System.out.println("3. University");
        System.out.println("4. Graduate");
        System.out.println("Enter your choice");
        int choiceDeg = Integer.parseInt(Validates.choice(scanner.nextLine()));
        switch (choiceDeg) {
            case 1:
                employee.setDegree("Intermediate");
                break;
            case 2:
                employee.setDegree("College");
                break;
            case 3:
                employee.setDegree("University");
                break;
            case 4:
                employee.setDegree("Graduate");
                break;
            default:
                System.out.println("Please choose from 1-4");
        }
        System.out.println("Please choose 1 in 6 positions as below:");
        System.out.println("1. Receptionist");
        System.out.println("2. Waiter");
        System.out.println("3. Executive");
        System.out.println("4. Supervisor");
        System.out.println("5. Manager");
        System.out.println("6. Director");
        System.out.println("Please enter your choice");
        int choicePos = Integer.parseInt(Validates.choice(scanner.nextLine()));
        switch (choicePos) {
            case 1:
                employee.setPosition("Receptionist");
                break;
            case 2:
                employee.setPosition("Waiter");
                break;
            case 3:
                employee.setPosition("Executive");
                break;
            case 4:
                employee.setPosition("Supervisor");
                break;
            case 5:
                employee.setPosition("Manager");
                break;
            case 6:
                employee.setPosition("Director");
                break;
            default:
                System.out.println("Please enter from 1-6");
        }
        System.out.println("Enter the salary");
        int salary = Integer.parseInt(Validates.salary(scanner.nextLine()));
        employeeList.add(new Employee(id, name, dob, idCard, phoneNum, email, employee.getDegree(), employee.getPosition(), salary));
        EmployeeWriteReadServiceImpl.writeCSV(employeeList, true);
    }

    @Override
    public void display() {
        System.out.println("---------EMPLOYEE LIST-----------");
        for (Employee em : employeeList) {
            System.out.println(em);
        }
        System.out.println("---------------------------------");
    }

    @Override
    public void edit() {
        System.out.println("Enter the id would like to edit");
        String id = Validates.id(scanner.nextLine());
        for (Employee em : employeeList) {
            if (em.getId().equals(id)) {
                System.out.println("Please choose data would like to edit:");
                System.out.println("1. Id");
                System.out.println("2. Full Name");
                System.out.println("3. Date of Birth");
                System.out.println("4. ID Card");
                System.out.println("5. Phone Number");
                System.out.println("6. Email");
                System.out.println("7. Degree");
                System.out.println("8. Position");
                System.out.println("9. Salary");
                System.out.println("0. Exit");
                System.out.println("Please enter your choice");
                int choice = Integer.parseInt(Validates.choice(scanner.nextLine()));
                switch (choice) {
                    case 1:
                        System.out.println("Enter the updated ID");
                        String newId = Validates.id(scanner.nextLine());
                        em.setId(newId);
                        break;
                    case 2:
                        System.out.println("Enter the updated Full Name");
                        String newName = Validates.string(scanner.nextLine());
                        em.setFullName(newName);
                        break;
                    case 3:
                        System.out.println("Enter the updated DoB");
                        String newDOB = Validates.date(scanner.nextLine());
                        em.setId(newDOB);
                        break;
                    case 4:
                        System.out.println("Enter the updated ID Card");
                        String newIdCard = Validates.idCard(scanner.nextLine());
                        em.setId(newIdCard);
                        break;
                    case 5:
                        System.out.println("Enter the updated Phone Number");
                        String newPhone = Validates.phoneNumber(scanner.nextLine());
                        em.setId(newPhone);
                        break;
                    case 6:
                        System.out.println("Enter the updated Email");
                        String newEmail = Validates.email(scanner.nextLine());
                        em.setId(newEmail);
                        break;
                    case 7:
                        System.out.println("Please choose 1 in 4 of degree as below:");
                        System.out.println("1. Intermediate");
                        System.out.println("2. College");
                        System.out.println("3. University");
                        System.out.println("4. Graduate");
                        System.out.println("Enter your choice");
                        int choiceDeg = Integer.parseInt(Validates.choice(scanner.nextLine()));
                        switch (choiceDeg) {
                            case 1:
                                em.setDegree("Intermediate");
                                break;
                            case 2:
                                em.setDegree("College");
                                break;
                            case 3:
                                em.setDegree("University");
                                break;
                            case 4:
                                em.setDegree("Graduate");
                                break;
                            default:
                                System.out.println("Please choose from 1-4");
                        }
                        break;
                    case 8:
                        System.out.println("Please choose 1 in 6 positions as below:");
                        System.out.println("1. Receptionist");
                        System.out.println("2. Waiter");
                        System.out.println("3. Executive");
                        System.out.println("4. Supervisor");
                        System.out.println("5. Manager");
                        System.out.println("6. Director");
                        System.out.println("Please enter your choice");
                        int choicePos = Integer.parseInt(Validates.choice(scanner.nextLine()));
                        switch (choicePos) {
                            case 1:
                                em.setPosition("Receptionist");
                                break;
                            case 2:
                                em.setPosition("Waiter");
                                break;
                            case 3:
                                em.setPosition("Executive");
                                break;
                            case 4:
                                em.setPosition("Supervisor");
                                break;
                            case 5:
                                em.setPosition("Manager");
                                break;
                            case 6:
                                em.setPosition("Director");
                                break;
                            default:
                                System.out.println("Please enter from 1-6");
                        }
                        break;
                    case 9:
                        System.out.println("Enter the updated Salary");
                        String newSalary = Validates.salary(scanner.nextLine());
                        em.setId(newSalary);
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Please choose from 0-9");
                }
            }
        }
        display();
    }
}
