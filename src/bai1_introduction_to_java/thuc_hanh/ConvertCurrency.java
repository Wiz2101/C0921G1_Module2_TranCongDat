package bai1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of USD");
        int USD = scanner.nextInt();
        int VND = 23000 * USD;
        System.out.println("$" + USD + " convert to VND is " + VND + " VND");
    }
}
