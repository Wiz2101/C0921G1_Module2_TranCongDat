package bai_tap_them.quan_li_giao_thong.controller;

import java.util.Scanner;

public class MenuController {
    Scanner scanner = new Scanner(System.in);
    ControllerXeTai controllerXeTai = new ControllerXeTai();
    ControllerOto controllerOto = new ControllerOto();
    ControllerXeMay controllerXeMay = new ControllerXeMay();

    public void displayMainMenu() {
        int input;
        int subInput;

        do {
            System.out.println(" CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG\n" +
                    "Chọn chức năng:\n" +
                    "1. Thêm mới phương tiện.\n" +
                    "2. Hiển thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Thoát\n");
            System.out.print("Vui lòng nhập lựa chọn của bạn: ");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Chọn chức năng:\n" +
                            "1. Thêm mới xe tải\n" +
                            "2. Thêm mới ô tô\n" +
                            "3. Thêm mới xe máy\n" +
                            "4. Thoát\n");
                    System.out.println("Vui lòng nhập lựa chọn của bạn: ");
                    subInput = scanner.nextInt();
                    switch (subInput){
                        case 1:
                            controllerXeTai.addXeTai();
                            break;
                        case 2:
                            controllerOto.addOto();
                            break;
                        case 3:
                            controllerXeMay.addXeMay();
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Vui lòng nhập từ 1-4");
                    }
                    break;
                case 2:
                    System.out.println("Chọn chức năng:\n" +
                            "1. Hiển thị xe tải\n" +
                            "2. Hiển thị ô tô\n" +
                            "3. Hiển thị xe máy\n" +
                            "4. Thoát\n");
                    System.out.println("Vui lòng nhập lựa chọn của bạn: ");
                    subInput = scanner.nextInt();
                    switch (subInput){
                        case 1:
                            controllerXeTai.displayXeTai();
                            break;
                        case 2:
                            controllerOto.displayOto();
                            break;
                        case 3:
                            controllerXeMay.displayXeMay();
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Vui lòng chọn từ 1-4");
                    }
                    break;
                case 3:
                    System.out.println("Chọn chức năng:\n" +
                            "1. Xóa xe tải\n" +
                            "2. Xóa ô tô\n" +
                            "3. Xóa xe máy\n" +
                            "4. Thoát\n");
                    System.out.println("Vui lòng nhập lựa chọn của bạn: ");
                    subInput = scanner.nextInt();
                    switch (subInput){
                        case 1:
                            controllerXeTai.delXeTai();
                            break;
                        case 2:
                            controllerOto.delOto();
                            break;
                        case 3:
                            controllerXeMay.delXeMay();
                            break;
                        default:
                            System.out.println("Vui lòng chọn từ 1-4");
                    }
                    break;
                default:
                    break;
            }
        } while (input != 4);
    }
}
