package case_study.validates;

import java.util.Scanner;

public final class Validates {
    private Validates() {
    }

    ;
    static Scanner scanner = new Scanner(System.in);

    public static String serviceID(String input) {
        String regex = "^(SV)(VL|HO|RO)-(\\d{4}$)";
        while (!input.matches(regex)) {
            System.err.println("Service ID must be true format: SVXX-YYYY, with YYYY is the number from 0-9, XX is:\n" +
                    "If is Villa, XX will be VL\n" +
                    "If is House, XX will be HO\n" +
                    "If Room, XX will be RO");
            input = scanner.nextLine();
        }
        return input;
    }

//    public static void main(String[] args) {
//        Validate validate = new Validate();
//        validate.customerType();
//    }

    public static String id(String id) {
        String regex = "^([A-Z]{2}\\d{3})$";
        while (!id.matches(regex)) {
            System.err.println("ID must following the format: XXYYY (X: Capital Alphabet | Y: Number)");
            id = scanner.nextLine();
        }
        return id;
    }

    public static String string(String string) {
        String regex = "^([A-Z]\\w*)(\\s\\w*){0,}$";
        while (!string.matches(regex)) {
            System.err.println("Name service must capitalize the first character");
            string = scanner.nextLine();
        }
        return string;
    }

    public static String date(String date) {
        String regex = "^\\d{2}\\/\\d{2}\\/\\d{4}$";
        while (!date.matches(regex)) {
            System.err.println("Date must be following the format: DD/MM/YYYY");
            date = scanner.nextLine();
        }
        return date;
    }

    public static String idCard(String idCard) {
        String regex = "^\\d*$";
        while (!idCard.matches(regex)) {
            System.err.println("ID Card must be only the number");
            idCard = scanner.nextLine();
        }
        return idCard;
    }

    public static String phoneNumber(String phoneNumber) {
        String regex = "^\\d*$";
        while (!phoneNumber.matches(regex)) {
            System.err.println("Phone number must be only the number");
            phoneNumber = scanner.nextLine();
        }
        return phoneNumber;
    }

    public static String email(String email) {
        String regex = "^.*@.*$";
        while (!email.matches(regex)) {
            System.err.println("Email must be following this format: example@something.com");
            email = scanner.nextLine();
        }
        return email;
    }

    public static String choice(String choice) {
        String regex = "^\\d*$";
        while (!choice.matches(regex)) {
            System.err.println("Please enter number only");
            choice = scanner.nextLine();
        }
        return choice;
    }

    public static String salary(String salary) {
        String regex = "^\\d*$";
        while (!salary.matches(regex)) {
            System.err.println("Please choose from the list above");
            salary = scanner.nextLine();
        }
        return salary;
    }

    public static String houseUsage(String houseUsage) {
        String regex = "^[3-9]\\d{1,}$";
        while (!houseUsage.matches(regex)) {
            System.err.println("Usable area and pool area must be greater than 30m2");
            houseUsage = scanner.nextLine();
        }
        return houseUsage;
    }

    public static String rentalCost(String rentalCost) {
        String regex = "^[1-9]\\d*$";
        while (!rentalCost.matches(regex)) {
            System.err.println("Rent must be a positive number");
            rentalCost = scanner.nextLine();
        }
        return rentalCost;
    }

    public static String capacity(String capacity) {
        while (!(Integer.parseInt(capacity) > 0 && Integer.parseInt(capacity) < 20)) {
            System.err.println("Capacity must be greater than 0 and less than 20");
            capacity = scanner.nextLine();
        }
        return capacity;
    }

    public static String floor(String floor) {
        String regex = "^[1-9]+$";
        while (!floor.matches(regex)) {
            System.err.println("The number of floors must be a positive integer");
            floor = scanner.nextLine();
        }
        return floor;
    }

    public static String number(String number) {
        String regex = "^\\d*$";
        while (!number.matches(regex)) {
            System.err.println("Voucher must be number only");
            number = scanner.nextLine();
        }
        return number;
    }
}