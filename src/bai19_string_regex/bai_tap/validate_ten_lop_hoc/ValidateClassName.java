package bai19_string_regex.bai_tap.validate_ten_lop_hoc;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateClassName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the class name: ");
        String input = scanner.nextLine();
        while (!(Pattern.compile("(C|A|P)\\w\\d*(G|H|I|K|L|M)$").matcher(input).matches())){
            System.out.println("Please re-enter the class name: ");
            input = scanner.nextLine();
        };
    }
}
