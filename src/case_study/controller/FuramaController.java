package case_study.controller;

import case_study.services.*;
import case_study.services.impl.*;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FuramaController {
    EmployeeService employeeService = new EmployeeServiceImpl();
    CustomerService customerService = new CustomerServiceImpl();
    FacilityService facilityService = new FaciltyServiceImpl();
    BookingService bookingService = new BookingServiceImpl();
    ContractService contractService = new ContractServiceImpl();
    PromotionServiceImpl promotionService = new PromotionServiceImpl();

    public void displayMainMenu() {
        int input = 0;
        int subInput = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            do {
                try {
                    System.out.println("1.\tEmployee Management\n" +
                            "2.\tCustomer Management\n" +
                            "3.\tFacility Management \n" +
                            "4.\tBooking Management\n" +
                            "5.\tPromotion Management\n" +
                            "6.\tExit\n");
                    System.out.print("Please enter your choice: ");
                    input = Integer.parseInt(scanner.nextLine());
                    switch (input) {
                        case 1:
                            do {
                                try {
                                    System.out.println("1.\tDisplay list employees\n" +
                                            "2.\tAdd new employee\n" +
                                            "3.\tEdit employee\n" +
                                            "4.\tReturn main menu\n");
                                    System.out.println("Please enter your choice: ");
                                    subInput = Integer.parseInt(scanner.nextLine());
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
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            } while (subInput != 4);
                            break;
                        case 2:
                            do {
                                try {
                                    System.out.println("1.\tDisplay list customers\n" +
                                            "2.\tAdd new customer\n" +
                                            "3.\tEdit customer\n" +
                                            "4.\tReturn main menu\n");
                                    System.out.println("Please enter your choice: ");
                                    subInput = Integer.parseInt(scanner.nextLine());
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
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            } while (subInput != 4);
                            break;
                        case 3:
                            do {
                                try {
                                    System.out.println("1\tDisplay list facility\n" +
                                            "2\tAdd new facility\n" +
                                            "3\tDisplay list facility maintenance\n" +
                                            "4\tEdit facility\n" +
                                            "5\tReturn main menu\n");
                                    System.out.println("Please enter your choice: ");
                                    subInput = Integer.parseInt(scanner.nextLine());
                                    switch (subInput) {
                                        case 1:
                                            facilityService.display();
                                            break;
                                        case 2:
                                            facilityService.add();
                                            break;
                                        case 3:
                                            facilityService.displayMaintain();
                                            break;
                                        case 4:
                                            facilityService.edit();
                                            break;
                                        case 5:
                                            break;
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            } while (subInput != 5);
                            break;
                        case 4:
                            do {
                                try {
                                    System.out.println("1.\tAdd new booking\n" +
                                            "2.\tDisplay list booking\n" +
                                            "3.\tCreate new contract\n" +
                                            "4.\tDisplay list contracts\n" +
                                            "5.\tEdit contracts\n" +
                                            "6.\tReturn main menu\n");
                                    System.out.println("Please enter your choice: ");
                                    subInput = Integer.parseInt(scanner.nextLine());
                                    switch (subInput) {
                                        case 1:
                                            bookingService.add();
                                            break;
                                        case 2:
                                            bookingService.display();
                                            break;
                                        case 3:
                                            contractService.add();
                                            break;
                                        case 4:
                                            contractService.display();
                                            break;
                                        case 5:
                                            contractService.edit();
                                            break;
                                        case 6:
                                            break;
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            } while (subInput != 6);
                            break;
                        case 5:
                            do {
                                try {
                                    System.out.println("1.\tDisplay list customers use service\n" +
                                            "2.\tDisplay list customers get voucher\n" +
                                            "3.\tReturn main menu\n");
                                    System.out.println("Please enter your choice: ");
                                    subInput = Integer.parseInt(scanner.nextLine());
                                    switch (subInput) {
                                        case 1:
                                            promotionService.displayCustomerListInYear();
                                            break;
                                        case 2:
                                            promotionService.getVoucher();
                                            break;
                                        case 3:
                                            break;
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            } while (subInput != 3);
                            break;
                        default:
                            System.out.println("Please enter the number following the menu");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } while (!(input == 6));
        }
    }
}
