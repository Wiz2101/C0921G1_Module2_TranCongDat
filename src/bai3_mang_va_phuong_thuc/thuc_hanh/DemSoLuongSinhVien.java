package bai3_mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class DemSoLuongSinhVien {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài mảng");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Độ dài mảng không được vượt quá 30");
            }
            } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i<array.length){
            System.out.println("Nhập điểm số của sinh viên thứ " + (i+1));
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("Danh sách điểm: ");
        for (int j=0; j<array.length; j++){
            if (array[j] >= 5 && array[j]<=10){
                count++;
            }
        }
        System.out.println("\n Số học sinh vượt qua kỳ thi là: " + count);
    }
}
