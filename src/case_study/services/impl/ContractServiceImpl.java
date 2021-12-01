package case_study.services.impl;

import case_study.models.Booking;
import case_study.models.Contract;
import case_study.models.Customer;
import case_study.services.BookingService;
import case_study.services.ContractService;

import java.util.*;

public class ContractServiceImpl implements ContractService {
    Scanner scanner = new Scanner(System.in);
    static Queue<Booking> bookingQueue = new LinkedList<>();
    static List<Contract> contractList = new ArrayList<>();

    static {
        bookingQueue.addAll(BookingServiceImpl.bookingList);
        contractList = ContractWriteReadServiceImpl.convertStringToContract();
    }

    @Override
    public void display() {
        System.out.println("---------CONTRACT LIST-----------");
        for (Contract co : contractList) {
            System.out.println(co);
        }
        System.out.println("---------------------------------");
    }

    @Override
    public void add() {
        Booking booking = bookingQueue.peek();
        boolean isExit = true;
        for (Booking que : bookingQueue) {
            for (Contract co : contractList) {
                if (!(que.getBookingID().equals(co.getBookingNo()))) {
                    isExit = false;
                    continue;
                } else {
                    isExit = true;
                    break;
                }
            }
            if (!isExit) {
                booking = que;
                break;
            }
        }

        System.out.println("Entery the contract ID");
        String contractID = scanner.nextLine();
        String customerID = booking.getCustomerID();
        System.out.println("Customer ID: " + customerID);
        System.out.println("Enter the deposit");
        int deposit = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the fully payment");
        int fullyPayment = Integer.parseInt(scanner.nextLine());
        String bookingID = booking.getBookingID();
        System.out.println("Booking ID: " + bookingID);
        contractList.add(new Contract(contractID, bookingID, deposit, fullyPayment, customerID));
        ContractWriteReadServiceImpl.writeCSV(contractList, true);
    }


    @Override
    public void edit() {
        System.out.println("Enter the Contract ID would like to edit");
        String id = scanner.nextLine();
        for (Contract co : contractList) {
            if (co.getContractNo().toLowerCase().equals(id.toLowerCase())) {
                System.out.println("Please choose data would like to edit:");
                System.out.println("1. Contract Id");
                System.out.println("2. Booking number");
                System.out.println("3. Deposit");
                System.out.println("4. Total Payment");
                System.out.println("5. Customer Id");
                System.out.println("0. Exit");
                System.out.println("Please enter your choice");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Enter the updated Contract ID");
                        String newId = scanner.nextLine();
                        co.setContractNo(newId);
                        break;
                    case 2:
                        System.out.println("Enter the updated Booking ID");
                        String newBookingID = scanner.nextLine();
                        co.setBookingNo(newBookingID);
                        break;
                    case 3:
                        System.out.println("Enter the updated Deposit");
                        int newDeposit = Integer.parseInt(scanner.nextLine());
                        co.setDeposit(newDeposit);
                        break;
                    case 4:
                        System.out.println("Enter the updated Total Payment");
                        int newPayment = Integer.parseInt(scanner.nextLine());
                        co.setTotalPayment(newPayment);
                        break;
                    case 5:
                        System.out.println("Enter the updated Customer ID");
                        String newCustomerID = scanner.nextLine();
                        co.setCustomerNo(newCustomerID);
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Please choose from 0-5");
                }
            }
        }
        display();
    }
}
