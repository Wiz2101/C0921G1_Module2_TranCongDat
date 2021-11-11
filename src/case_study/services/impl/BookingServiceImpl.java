package case_study.services.impl;

import case_study.models.Booking;
import case_study.services.BookingService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingServiceImpl implements BookingService {
    List<Booking> bookingList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for(Booking booking:bookingList){
            System.out.println(booking);
        }
    }

    @Override
    public void add() {
        System.out.println("Please enter booking number:");
        String bookingNo = scanner.nextLine();
        System.out.println("Please enter start date:");
        String startDate = scanner.nextLine();
        System.out.println("Please enter end date:");
        String endDate = scanner.nextLine();
        System.out.println("Please enter customer id");
        String customerId = scanner.nextLine();
        System.out.println("Please enter service name");
        String serviceName = scanner.nextLine();
        System.out.println("Please enter service type");
        String serviceType = scanner.nextLine();
        bookingList.add(new Booking(bookingNo,startDate,endDate,customerId,serviceName,serviceType));
    }

    @Override
    public void edit() {

    }

    @Override
    public void findByAll() {

    }
}
