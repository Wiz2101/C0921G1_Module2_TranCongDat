package bai3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class TimMinTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Nhập độ dài mảng");
        size = scanner.nextInt();
        int [] arr = new int[size];
        for (int i=0; i<arr.length; i++){
            System.out.println("Nhập giá trị cho phần tử thứ " + (i+1));
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int j=0; j<arr.length; j++){
            if (arr[j]<min){
                min = arr[j];
            }
        }
        System.out.println("GTNN trong mảng là: " + min);
    }
}
