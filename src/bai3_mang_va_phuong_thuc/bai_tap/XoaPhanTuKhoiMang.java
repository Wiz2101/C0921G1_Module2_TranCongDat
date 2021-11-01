package bai3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int [] array = {10,4,6,7,7,8,6,0,0,0,0};
        int indexDel;
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử muốn xóa");
        int input = scanner.nextInt();
        for (int j=0; j<array.length; j++){
            if (input == array[j]){
                flag = true;
                break;
            }
        }
        if (flag) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == input) {
                    indexDel = i;
                    for (int j = indexDel; j < array.length - 1; j++) {
                        array[j] = array[j + 1];
                    }
                    array[array.length - 1] = 0;
                    i--;
                }
            }
        } else {
            System.out.println("Phần tử " + input + " không có trong mảng");
        }
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
