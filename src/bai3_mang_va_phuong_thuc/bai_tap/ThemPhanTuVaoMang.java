package bai3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {10,4,6,7,8,0,0,0,0,0};
        int []newArr = new int[arr.length +1];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số cần chèn");
        int addNum = scanner.nextInt();

        System.out.println("Nhập vào vị trí cần chèn vào trong mảng");
        int index = scanner.nextInt();

        if (index < 0 || index > arr.length-1 ){
            System.out.println("Không được phép chèn phần tử");
        } else {

            for (int i=0; i<arr.length; i++){
                newArr[i] = arr[i];
            }
            for (int j=newArr.length-1; j>index; j--){
                newArr[j] = newArr[j-1];
            }
            newArr[index] = addNum;
        }
        for (int i=0; i<newArr.length; i++){
            System.out.print(newArr[i] + "\t");
        }
    }
}
