package bai4_lop_va_doi_tuong_trong_java.bai_tap.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        double a = scanner.nextDouble();
        System.out.println("Enter b");
        double b = scanner.nextDouble();
        System.out.println("Enter c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println(quadraticEquation.display());
        System.out.println("Delta is: " + quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Root 1 & 2 is: " + quadraticEquation.getRoot1() + " & " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has one root is: " + quadraticEquation.getEqualRoot());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
