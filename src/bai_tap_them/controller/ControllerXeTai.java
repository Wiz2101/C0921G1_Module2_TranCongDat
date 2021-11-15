package bai_tap_them.controller;

import bai_tap_them.models.XeTai;
import bai_tap_them.services.IXeTaiService;
import bai_tap_them.services.impl.XeTaiService;

import java.util.Scanner;

public class ControllerXeTai {
    IXeTaiService xeTaiService = new XeTaiService();
    Scanner scanner = new Scanner(System.in);
    public void addXeTai() {
        XeTai xeTai = null;
        System.out.println("Nhập biển kiểm soát: ");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhập hãng SX: ");
        String hangSX = scanner.nextLine();
        System.out.println("Nhập năm SX: ");
        int namSX = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập tải trọng: ");
        double taiTrong = Double.parseDouble(scanner.nextLine());
        xeTai = new XeTai(bienKiemSoat,hangSX,namSX,chuSoHuu,taiTrong);
        xeTaiService.addXeTai(xeTai);
    }

    public void delXeTai(){
        xeTaiService.delXeTai();
    }
}
