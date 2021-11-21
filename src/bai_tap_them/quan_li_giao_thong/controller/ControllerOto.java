package bai_tap_them.quan_li_giao_thong.controller;

import bai_tap_them.quan_li_giao_thong.models.Oto;
import bai_tap_them.quan_li_giao_thong.services.IOtoService;
import bai_tap_them.quan_li_giao_thong.services.impl.OtoService;

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerOto {
    IOtoService otoService = new OtoService();
    ArrayList<Oto> otoArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void addOto() {
        Oto oto = null;
        System.out.println("Nhập biển kiểm soát: ");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhập hãng SX: ");
        String hangSX = scanner.nextLine();
        System.out.println("Nhập năm SX: ");
        int namSX = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập số chỗ ngồi: ");
        int soChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu xe:");
        String kieuXe = scanner.nextLine();
        oto = new Oto(bienKiemSoat,hangSX,namSX,chuSoHuu,soChoNgoi,kieuXe);
        otoService.addOto(oto);
    }

    public void displayOto() {
        otoService.displayOto();
    }

    public void delOto(){
        otoService.delOto();
    }

}
