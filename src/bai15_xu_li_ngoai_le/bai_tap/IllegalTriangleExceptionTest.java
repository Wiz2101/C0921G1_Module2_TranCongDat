package bai15_xu_li_ngoai_le.bai_tap;

import java.util.Scanner;

public class IllegalTriangleExceptionTest {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập cạnh a:");
            double a = scanner.nextDouble();
            System.out.println("Nhập cạnh b:");
            double b = scanner.nextDouble();
            System.out.println("Nhập cạnh c:");
            double c = scanner.nextDouble();
            try {
                Triangle triangle = new Triangle(a, b, c);
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

