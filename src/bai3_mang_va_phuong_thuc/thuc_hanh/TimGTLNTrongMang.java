package bai3_mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class TimGTLNTrongMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài mảng");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Độ dài mảng không được vượt quá 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Danh sách các phần tử trong mảng: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng: " + max + " ở vị trí " + index);
    }
}
