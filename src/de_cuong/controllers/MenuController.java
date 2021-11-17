package de_cuong.controllers;

import java.util.Scanner;

public class MenuController {
    void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN NGÂN HÀNG –-\n" +
                "Chọn chức năng theo số (để tiếp tục):\n" +
                "1. Thêm mới\n" +
                "2. Xóa\n" +
                "3. Xem danh sách các tài khoản ngân hàng\n" +
                "4. Tìm kiếm\n" +
                "5. Thoát\n");
        System.out.print("Vui lòng chọn chức năng: ");
        int choice = scanner.nextInt();
        int subChoice = scanner.nextInt();
        while (choice > 0 && choice !=5){
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Vui lòng chọn chức năng từ 1 -> 5");
            }
        }
    }
}
