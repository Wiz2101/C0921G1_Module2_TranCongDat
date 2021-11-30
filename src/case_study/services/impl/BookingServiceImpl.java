package case_study.services.impl;

import case_study.models.Booking;
import case_study.models.Contract;
import case_study.models.Customer;
import case_study.services.BookingService;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static SortedSet<Booking> bookingList = new TreeSet<>(new BookingComparator());

    static {
        bookingList = BookingWriteReadServiceImpl.convertStringToBooking();
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        System.out.println("---------BOOKING LIST-----------");
        for (Booking booking : bookingList) {
            System.out.println(booking);
        }
        System.out.println("---------------------------------");
    }

    @Override
    public void add() {
        System.out.println("Please enter booking number:");
        String bookingNo = scanner.nextLine();
        System.out.println("Please enter start date:");
        String startDate = scanner.nextLine();
        System.out.println("Please enter end date:");
        String endDate = scanner.nextLine();
        System.out.println("Please enter customer id as below:");
        for (int i = 0; i < CustomerServiceImpl.customerList.size(); i++) {
            System.out.println((i + 1) + "." + CustomerServiceImpl.customerList.get(i));
        }
        String customerId = scanner.nextLine();
        System.out.println("Please enter service name");
        String serviceName = scanner.nextLine();
        System.out.println("Please enter service type");
        String serviceType = scanner.nextLine();
        bookingList.add(new Booking(bookingNo, startDate, endDate, customerId, serviceName, serviceType));
        BookingWriteReadServiceImpl.writeCSV(bookingList, true);
    }

    @Override
    public void edit() {
        System.out.println("Enter the Booking ID would like to edit");
        String id = scanner.nextLine();
        for (Booking bo : bookingList) {
            if (bo.getBookingID().toLowerCase().equals(id.toLowerCase())) {
                System.out.println("Please choose data would like to edit:");
                System.out.println("1. Booking Id");
                System.out.println("2. Start Date");
                System.out.println("3. End Date");
                System.out.println("4. Customer ID");
                System.out.println("5. Service Name");
                System.out.println("6. Service Type");
                System.out.println("0. Exit");
                System.out.println("Please enter your choice");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Enter the updated Booking ID");
                        String newId = scanner.nextLine();
                        bo.setBookingID(newId);
                        break;
                    case 2:
                        System.out.println("Enter the updated Start Date");
                        String newStDate = scanner.nextLine();
                        bo.setStartDate(newStDate);
                        break;
                    case 3:
                        System.out.println("Enter the updated End Date");
                        String newEnDate = scanner.nextLine();
                        bo.setEndDate(newEnDate);
                        break;
                    case 4:
                        System.out.println("Enter the updated Customer ID");
                        for (int i = 0; i < CustomerServiceImpl.customerList.size(); i++) {
                            System.out.println((i + 1) + "." + CustomerServiceImpl.customerList.get(i));
                        }
                        String newIdCard = scanner.nextLine();
                        bo.setCustomerID(newIdCard);
                        break;
                    case 5:
                        System.out.println("Enter the updated Service Name");
                        String newSerName = scanner.nextLine();
                        bo.setServiceName(newSerName);
                        break;
                    case 6:
                        System.out.println("Enter the updated Service Type");
                        String newSerType = scanner.nextLine();
                        bo.setServiceType(newSerType);
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Please choose from 0-6");
                }
            }
        }
        display();
    }

    @Override
    public void findByAll() {

    }


}
