package case_study.services.impl;

import case_study.models.Booking;
import case_study.models.Customer;

import java.util.*;

public class PromotionServiceImpl {
    Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static Set<String> stringList = new TreeSet<>();
    static List<Customer> customerList = new LinkedList<>();
    static Stack<Booking> bookingStack = new Stack<>();
    static Stack<String> voucherStack = new Stack<>();

    static {
        bookingSet.addAll(BookingServiceImpl.bookingList);
        customerList.addAll(CustomerServiceImpl.customerList);
        bookingStack.addAll(bookingSet);
    }

    public void displayCustomerListInYear() {
        System.out.println("Enter the year would like to sort");
        int year = Integer.parseInt(scanner.nextLine());
        stringList.clear();
        for (Booking bo : bookingSet) {
            if (year == Integer.parseInt(bo.getStartDate().substring(6, 10))) {
                stringList.add(bo.getCustomerID());
            }
        }
        for (Customer cu : customerList) {
            for (String st : stringList) {
                if (st.equals(cu.getId())) {
                    System.out.println(cu);
                }
            }
        }
    }

    public void getVoucher() {
        while (true) {
            try {
                bookingStack.clear();
                voucherStack.clear();
                int totalVoucher;
                System.out.println("Enter the current month");
                String currentMonth = scanner.nextLine();
                for (Booking boVoucher : bookingSet) {
                    if (currentMonth.equals(boVoucher.getStartDate().substring(3, 5))) {
                        bookingStack.add(boVoucher);
                    }
                }
                do {
                    System.out.println("The number of customer in current month: " + bookingStack.size());
                    System.out.println("Enter the quantity of voucher 50%");
                    int voucher50 = Integer.parseInt(scanner.nextLine());
                    for (int i = 1; i <= voucher50; i++) {
                        voucherStack.add("Voucher 50%");
                    }
                    System.out.println("Enter the quantity of voucher 20%");
                    int voucher20 = Integer.parseInt(scanner.nextLine());
                    for (int i = 1; i <= voucher20; i++) {
                        voucherStack.add("Voucher 20%");
                    }
                    System.out.println("Enter the quantity of voucher 10%");
                    int voucher10 = Integer.parseInt(scanner.nextLine());
                    for (int i = 1; i <= voucher10; i++) {
                        voucherStack.add("Voucher 10%");
                    }
                    totalVoucher = voucher10 + voucher20 + voucher50;
                    if (totalVoucher != bookingStack.size()) {
                        System.err.println("Please enter the quantity of voucher equal with the quantity of booking");
                    }
                } while (totalVoucher != bookingStack.size());
                while (bookingStack.size() != 0)
                    System.out.println(bookingStack.pop() + " : get " + voucherStack.pop());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


