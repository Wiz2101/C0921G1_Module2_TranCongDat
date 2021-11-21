package bai_tap_them.quan_li_giao_thong.controller;

import bai_tap_them.quan_li_giao_thong.models.HangSX;
import bai_tap_them.quan_li_giao_thong.models.XeMay;
import bai_tap_them.quan_li_giao_thong.services.IXeMayService;
import bai_tap_them.quan_li_giao_thong.services.impl.XeMayService;

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerXeMay {
    IXeMayService xeMayService = new XeMayService();
    ArrayList<XeMay> xeMayArrayList = new ArrayList<>();
    HangSX hangSX1 = new HangSX("HSX-001", "Yamaha", "Nhật Bản");
    HangSX hangSX2 = new HangSX("HSX-002", "Honda", "Nhật Bản");
    HangSX hangSX3 = new HangSX("HSX-003", " Dongfeng", "Trung Quốc");
    HangSX hangSX4 = new HangSX("HSX-004", " Huyndai", "Hàn Quốc");
    HangSX hangSX5 = new HangSX("HSX-005", " Ford", "Mỹ");
    HangSX hangSX6 = new HangSX("HSX-006", " Toyota", "Nhật Bản");
    HangSX hangSX7 = new HangSX("HSX-006", " Hino", "Nhật Bản");
    Scanner scanner = new Scanner(System.in);
    public void addXeMay() {
        XeMay xeMay = null;
        System.out.println("Nhập biển kiểm soát: ");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhập hãng SX: ");
        String hangSX = scanner.nextLine();
        System.out.println("Nhập năm SX: ");
        int namSX = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập công suất:");
        double congSuat = Double.parseDouble(scanner.nextLine());
        xeMay = new XeMay(bienKiemSoat,hangSX, namSX,chuSoHuu,congSuat);
        xeMayService.addXeMay(xeMay);
    }
    public void displayXeMay() {
        xeMayService.displayXeMay();
    }

    public void delXeMay(){
        xeMayService.delXeMay();
    }
}
