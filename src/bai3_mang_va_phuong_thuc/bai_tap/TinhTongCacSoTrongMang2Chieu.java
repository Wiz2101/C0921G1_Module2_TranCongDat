package bai3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class TinhTongCacSoTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] arr = new double[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập phần tử thứ " + (j + 1) + " trong mảng " + i);
                arr[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        double sum = 0;
        System.out.println("Nhập số cột muốn tính");
        int col = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][col-1];
        }
        System.out.println("Tổng số cấc phần tử ở cột " + col + " là: " + sum);
    }
}
