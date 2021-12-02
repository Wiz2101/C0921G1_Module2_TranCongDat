package de_cuong.controllers;

import de_cuong.services.IAccountService;
import de_cuong.services.impl.BankAccountServiceImpl;
import de_cuong.services.impl.PaymentAccountServiceImpl;
import de_cuong.services.impl.SaveAccountServiceImpl;

import java.util.Scanner;

public class MenuController {
    Scanner scanner = new Scanner(System.in);
    IAccountService saveAccountService = new SaveAccountServiceImpl();
    IAccountService paymentAccountService = new PaymentAccountServiceImpl();
    BankAccountServiceImpl bankAccountService = new BankAccountServiceImpl();

    public void displayMenu() {
        int choice;
        int subChoice;
        do {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN NGÂN HÀNG –-");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách các tài khoản ngân hàng");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            System.out.println("Vui lòng chọn chức năng");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("-----THÊM MỚI TÀI KHOẢN-----");
                    System.out.println("1. Thêm mới tài khoản tiết kiệm");
                    System.out.println("2. Thêm mới tài khoản thanh toán");
                    System.out.println("3. Quay trở lại");
                    System.out.println("Vui lòng chọn chức năng");
                    subChoice = Integer.parseInt(scanner.nextLine());
                    switch (subChoice) {
                        case 1:
                            saveAccountService.addAccount();
                            break;
                        case 2:
                            paymentAccountService.addAccount();
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Vui lòng chọn các chức năng 1-3");
                    }
                    break;
                case 2:
                    System.out.println("--------XÓA TÀI KHOẢN---------");
                    System.out.println("1. Tất cả tài khoản");
                    System.out.println("2. Tài khoản tiết kiệm");
                    System.out.println("3. Tài khoản thanh toán");
                    System.out.println("4. Quay trở lại");
                    System.out.println("Vui lòng chọn loại tài khoản để xóa");
                    subChoice = Integer.parseInt(scanner.nextLine());
                    switch (subChoice) {
                        case 1:
                            bankAccountService.del();
                            break;
                        case 2:
                            saveAccountService.delAccount();
                            break;
                        case 3:
                            paymentAccountService.delAccount();
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Vui lòng các chọn chức năng 1-3");
                    }
                    break;
                case 3:
                    System.out.println("1. Danh sách tất cả tài khoản");
                    System.out.println("2. Danh sách tài khoản tiết kiệm");
                    System.out.println("3. Danh sách tài khoản thanh toán");
                    System.out.println("Vui lòng chọn chức năng");
                    subChoice = Integer.parseInt(scanner.nextLine());
                    switch (subChoice) {
                        case 1:
                            bankAccountService.display();
                            break;
                        case 2:
                            saveAccountService.display();
                            break;
                        case 3:
                            paymentAccountService.display();
                            break;
                        default:
                            System.out.println("Vui lòng chọn chức năng 1-3");
                    }
                    break;
                case 4:
                    bankAccountService.find();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Vui lòng chọn các chức năng từ 1-5");
            }
        } while (choice > 0 && choice != 5);
    }
}
