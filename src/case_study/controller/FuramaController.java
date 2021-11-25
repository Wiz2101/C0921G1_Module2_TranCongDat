package case_study.controller;

import case_study.services.CustomerService;
import case_study.services.EmployeeService;
import case_study.services.impl.CustomerServiceImpl;
import case_study.services.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    EmployeeService employeeService = new EmployeeServiceImpl();
    CustomerService customerService = new CustomerServiceImpl();
    public void displayMainMenu() {
        int input;
        int subInput = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            System.out.print("Please enter your choice: ");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    do {
                        System.out.println("1.\tDisplay list employees\n" +
                                "2.\tAdd new employee\n" +
                                "3.\tEdit employee\n" +
                                "4.\tReturn main menu\n");
                        System.out.println("Please enter your choice: ");
                        subInput = scanner.nextInt();
                        switch (subInput) {
                            case 1:
                                employeeService.display();
                                break;
                            case 2:
                                employeeService.add();
                                break;
                            case 3:
                                employeeService.edit();
                                break;
                            case 4:
                                break;
                        }
                    } while (subInput != 4);
                    break;
                case 2:
                    do {
                        System.out.println("1.\tDisplay list customers\n" +
                                "2.\tAdd new customer\n" +
                                "3.\tEdit customer\n" +
                                "4.\tReturn main menu\n");
                        System.out.println("Please enter your choice: ");
                        subInput = scanner.nextInt();
                        switch (subInput) {
                            case 1:
                                customerService.display();
                                break;
                            case 2:
                                customerService.add();
                                break;
                            case 3:
                                customerService.edit();
                                break;
                            case 4:
                                break;
                        }
                    } while (subInput != 4);
                    break;
                case 3:
                    do {
                        System.out.println("1\tDisplay list facility\n" +
                                "2\tAdd new facility\n" +
                                "3\tDisplay list facility maintenance\n" +
                                "4\tReturn main menu\n");
                        System.out.println("Please enter your choice: ");
                        subInput = scanner.nextInt();
                        switch (subInput) {
                            case 1:
                                System.out.println("---------------------");
                                System.out.println("Display list facility");
                                System.out.println("---------------------");
                            case 2:
                                System.out.println("---------------------");
                                System.out.println("Add new facility");
                                System.out.println("---------------------");
                            case 3:
                                System.out.println("---------------------");
                                System.out.println("Display list facility maintenance");
                                System.out.println("---------------------");
                            case 4:
                                break;
                        }
                    } while (subInput != 4);
                    break;
                case 4:
                    do {
                        System.out.println("1.\tAdd new booking\n" +
                                "2.\tDisplay list booking\n" +
                                "3.\tCreate new constracts\n" +
                                "4.\tDisplay list contracts\n" +
                                "5.\tEdit contracts\n" +
                                "6.\tReturn main menu\n");
                        System.out.println("Please enter your choice: ");
                        subInput = scanner.nextInt();
                        switch (subInput) {
                            case 1:
                                System.out.println("---------------------");
                                System.out.println("Add new booking");
                                System.out.println("---------------------");
                            case 2:
                                System.out.println("---------------------");
                                System.out.println("Display list booking");
                                System.out.println("---------------------");
                            case 3:
                                System.out.println("---------------------");
                                System.out.println("Create new contracts");
                                System.out.println("---------------------");
                            case 4:
                                System.out.println("---------------------");
                                System.out.println("Display list contracts");
                                System.out.println("---------------------");
                            case 5:
                                System.out.println("---------------------");
                                System.out.println("Edit contracts");
                                System.out.println("---------------------");
                            case 6:
                                break;
                        }
                    } while (subInput != 6);
                    break;
                case 5:
                    do {
                        System.out.println("1.\tDisplay list customers use service\n" +
                                "2.\tDisplay list customers get voucher\n" +
                                "3.\tReturn main menu\n");
                        System.out.println("Please enter your choice: ");
                        subInput = scanner.nextInt();
                        switch (subInput) {
                            case 1:
                                System.out.println("---------------------");
                                System.out.println("Display list customers use service");
                                System.out.println("---------------------");
                            case 2:
                                System.out.println("---------------------");
                                System.out.println("Display list customers get voucher");
                                System.out.println("---------------------");
                            case 3:
                                break;
                        }
                    } while (subInput != 3);
                    break;
                default:
                    System.out.println("Please enter the number following the menu");
            }
        } while (!(input == 6));
    }
}
