package bai18_threading.bai_tap.validate_so_dien_thoai;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the phone number: ");
        String phoneNum = scanner.nextLine();
        while (!(Pattern.compile("\\(\\d*\\)-\\(\\d*\\)").matcher(phoneNum).matches())){
            System.out.println("Please re-enter the phone number: ");
            phoneNum = scanner.nextLine();
        }
    }
}
