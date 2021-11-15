package bai_tap_them.controller;

import bai_tap_them.models.XeMay;
import bai_tap_them.services.IXeMayService;
import bai_tap_them.services.impl.XeMayService;

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerXeMay {
    IXeMayService xeMayService = new XeMayService();
    ArrayList<XeMay> xeMayArrayList = new ArrayList<>();
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
