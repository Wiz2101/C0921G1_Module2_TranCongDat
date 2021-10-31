package bai3_mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class ReversePhanTu {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài mảng");
            size = scanner.nextInt();
            if (size>20){
                System.out.println("Độ dài không được quá 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i<array.length){
            System.out.println("Nhập phần tử thứ " + (i+1));
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Các phần tử trong mảng: ","");
        for (int j=0; j<array.length; j++){
            System.out.print(array[j] + "\t");
        }
        for (int j=0; j<array.length / 2; j++){
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Mảng đảo ngược: ","");
        for (int j=0; j<array.length; j++){
            System.out.print(array[j] + "\t");
        }
    }
}
