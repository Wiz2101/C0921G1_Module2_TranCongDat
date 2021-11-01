package bai3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class TimMaxTrongMaTran {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Nhập phần tử thứ " + (j + 1) + " trong mảng " + (i + 1));
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int max = matrix[0][0];
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("GTLN trong matrix là: " +max);
    }
}
