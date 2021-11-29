package case_study.services.impl;

import case_study.models.Customer;
import case_study.models.Employee;
import case_study.services.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    Scanner scanner = new Scanner(System.in);
    Customer customer = new Customer();
    static List<Customer> customerList = new LinkedList<>();

    static {
        CustomerWriteReadServiceImpl.convertStringToCustomer();
    }
    @Override
    public void add() {
        System.out.println("Enter the id");
        String id = scanner.nextLine();
        System.out.println("Enter the full name");
        String name = scanner.nextLine();
        System.out.println("Enter the birthday");
        String dob = scanner.nextLine();
        System.out.println("Enter the idCard");
        long idCard = Long.parseLong(scanner.nextLine());
        System.out.println("Enter the phone number");
        String phoneNum = scanner.nextLine();
        System.out.println("Enter the email");
        String email = scanner.nextLine();
        System.out.println("Please choose 1 in 5 of Types as below:");
        System.out.println("1. Diamond");
        System.out.println("2. Platinum");
        System.out.println("3. Gold");
        System.out.println("4. Silver");
        System.out.println("5. Member");
        System.out.println("Enter your choice");
        int choiceDeg = Integer.parseInt(scanner.nextLine());
        switch (choiceDeg) {
            case 1:
                customer.setCustomerType("Diamond");
                break;
            case 2:
                customer.setCustomerType("Platinum");
                break;
            case 3:
                customer.setCustomerType("Gold");
                break;
            case 4:
                customer.setCustomerType("Silver");
                break;
            case 5:
                customer.setCustomerType("Member");
            case 0:
                break;
            default:
                System.out.println("Please choose from 0-5");
        }
        customerList.add(new Customer(id,name,dob,idCard,phoneNum,email,customer.getCustomerType()));
        CustomerWriteReadServiceImpl.writeCSV(customerList, true);
    }

    @Override
    public void display() {
        System.out.println("---------CUSTOMER LIST-----------");
        for (Customer cu : customerList) {
            System.out.println(cu);
        }
        System.out.println("---------------------------------");
    }

    @Override
    public void edit() {
        System.out.println("Enter the id would like to edit");
        String id = scanner.nextLine();
        for (Customer cu : customerList) {
            if (cu.getId().toLowerCase().equals(id.toLowerCase())) {
                System.out.println("Please choose data would like to edit:");
                System.out.println("1. Id");
                System.out.println("2. Full Name");
                System.out.println("3. Date of Birth");
                System.out.println("4. ID Card");
                System.out.println("5. Phone Number");
                System.out.println("6. Email");
                System.out.println("7. Customer Type");
                System.out.println("0. Exit");
                System.out.println("Please enter your choice");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Enter the updated ID");
                        String newId = scanner.nextLine();
                        cu.setId(newId);
                        break;
                    case 2:
                        System.out.println("Enter the updated Full Name");
                        String newName = scanner.nextLine();
                        cu.setFullName(newName);
                        break;
                    case 3:
                        System.out.println("Enter the updated DoB");
                        String newDOB = scanner.nextLine();
                        cu.setId(newDOB);
                        break;
                    case 4:
                        System.out.println("Enter the updated ID Card");
                        String newIdCard = scanner.nextLine();
                        cu.setId(newIdCard);
                        break;
                    case 5:
                        System.out.println("Enter the updated Phone Number");
                        String newPhone = scanner.nextLine();
                        cu.setId(newPhone);
                        break;
                    case 6:
                        System.out.println("Enter the updated Email");
                        String newEmail = scanner.nextLine();
                        cu.setId(newEmail);
                        break;
                    case 7:
                        System.out.println("Please choose 1 in 5 of Types as below:");
                        System.out.println("1. Diamond");
                        System.out.println("2. Platinum");
                        System.out.println("3. Gold");
                        System.out.println("4. Silver");
                        System.out.println("5. Member");
                        System.out.println("Enter your choice");
                        int choiceDeg = Integer.parseInt(scanner.nextLine());
                        switch (choiceDeg) {
                            case 1:
                                cu.setCustomerType("Diamond");
                                break;
                            case 2:
                                cu.setCustomerType("Platinum");
                                break;
                            case 3:
                                cu.setCustomerType("Gold");
                                break;
                            case 4:
                                cu.setCustomerType("Silver");
                                break;
                            case 5:
                                cu.setCustomerType("Member");
                            default:
                                System.out.println("Please choose from 1-5");
                        }
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Please choose from 0-7");
                }
            }
        }
        display();
    }

    @Override
    public void findByAll(){

    }
}
