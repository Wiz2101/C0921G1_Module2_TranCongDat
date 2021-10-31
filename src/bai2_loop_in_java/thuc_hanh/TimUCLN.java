package bai2_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class TimUCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên a");
        int a = scanner.nextInt();
        System.out.println("Nhập vào số nguyên b");
        int b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println(a + " và " + b + " không có UCLN");
        }
        while (a != b) {
            for (int i = 0; i < a; i++) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
        }
        System.out.println("UCLN của " + a + " và " + b + "là: " + a);
    }
}
