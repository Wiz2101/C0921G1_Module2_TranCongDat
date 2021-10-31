package bai2_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println("The number " + number + " is not a Prime");
        } else {
            boolean flag = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println("The number " + number + " is a Prime");
            } else {
                System.out.println("The number " + number + " is not a Prime");
            }
        }
    }
}
