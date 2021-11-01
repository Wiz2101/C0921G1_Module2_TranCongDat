package bai3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;
import java.lang.String;

public class DemSoLanKyTuXuatHienTrongChuoi {
    public static void main(String[] args) {
        String str = "toi dang hoc o codegym";
//        char [] strArr = str.toCharArray();
        char symbol;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ký tự muốn tìm");
        symbol = scanner.next().charAt(0);
        for (int i=0; i<str.length(); i++){
            if (symbol == str.charAt(i)){
                count++;
            }
        }
        System.out.println("Ký tự " + symbol + " được lặp lại " + count);
    }
}
