package bai_tap_them.controller;

import bai_tap_them.models.XeMay;
import bai_tap_them.services.IXeMayService;
import bai_tap_them.services.impl.XeMayService;

import java.util.Scanner;

public class ControllerXeMay {
    IXeMayService xeMayService = new XeMayService();
    Scanner scanner = new Scanner(System.in);
    public void addXeMay() {
        XeMay xeMay = null;
        System.out.println("Nhập biển kiểm soát: ");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhập hãng SX: ");
        System.out.println("0.HSX-001,Yamaha,Nhật Bản\t\n" +
                "1.HSX-002,Honda,Nhật Bản\t\n" +
                "2.HSX-003, Dongfeng,Trung Quốc\n" +
                "3.HSX-004, Huyndai,Hàn Quốc\n" +
                "4.HSX-005, Ford,Mỹ\n" +
                "5.HSX-006, Toyota,Nhật Bản\n" +
                "6.HSX-006, Hino,Nhật Bản\n");
        int choice = scanner.nextInt();
        System.out.println("Nhập năm SX: ");
        int namSX = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập công suất:");
        double congSuat = Double.parseDouble(scanner.nextLine());
        xeMay = new XeMay(bienKiemSoat,namSX,chuSoHuu,congSuat);
        xeMayService.addXeMay(xeMay);
    }

//    public void delXeMay(){
//        System.out.println("Vui lòng nhập số thứ tự xe ô tô muốn xóa:");
//        int id = scanner.nextInt();
//        xeMayService.delXeMay(id);
//    }
}
