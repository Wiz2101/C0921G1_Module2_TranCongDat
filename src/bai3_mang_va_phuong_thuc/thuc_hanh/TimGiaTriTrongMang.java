package bai3_mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String [] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên học sinh cần tìm");
        String inputName = scanner.nextLine();
        boolean isExist = false;
        for (int i=0; i<students.length; i++){
            if(students[i].equals(inputName)){
                System.out.println("Vị trí của học sinh " + inputName + " trong mảng: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Không tìm thấy tên " + inputName + " trong mảng");
        }
    }
}
