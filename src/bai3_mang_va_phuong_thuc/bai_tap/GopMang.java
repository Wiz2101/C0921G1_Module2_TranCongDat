package bai3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[7];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhập phần tử thử " + (i + 1));
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
        for (int j = 0; j < arr2.length; j++) {
            System.out.println("Nhập phần tử thứ " + (j + 1));
            arr2[j] = scanner.nextInt();
        }
        for (int j = 0; j < arr2.length; j++) {
            System.out.print(+arr2[j] + "\t");
        }
        System.out.println();
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        for (; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int j=0; j< arr2.length; j++) {

            arr3[j+arr1.length] = arr2[j];
        }
        for (int k = 0; k < arr3.length; k++) {
            System.out.print(arr3[k] + "\t");
        }
    }
}
