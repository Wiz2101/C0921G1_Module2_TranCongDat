package bai_tap_them.quan_li_giao_thong.services.impl;

import bai_tap_them.quan_li_giao_thong.models.XeMay;
import bai_tap_them.quan_li_giao_thong.services.IXeMayService;

import java.util.ArrayList;
import java.util.Scanner;

public class XeMayService implements IXeMayService {
    Scanner scanner = new Scanner(System.in);
    ArrayList<XeMay> xeMayArrayList = new ArrayList<>();

    @Override
    public void addXeMay(XeMay xeMay) {
        xeMayArrayList.add(xeMay);
    }

    @Override
    public void displayXeMay() {
        for (XeMay xeMay : xeMayArrayList) {
            System.out.println(xeMay);
        }
    }

    @Override
    public void delXeMay() {
        System.out.println("Nhập biển kiếm soát cần xóa");
        String bienKiemSoat = scanner.nextLine();
        for (int i = 0; i < xeMayArrayList.size(); i++) {
            if(xeMayArrayList.get(i).getBienKiemSoat().equals(bienKiemSoat)){
                xeMayArrayList.remove(i);
            }
        }
        displayXeMay();
    }

    @Override
    public String toString() {
        return "XeMayService{" +
                "scanner=" + scanner +
                ", xeMayArrayList=" + xeMayArrayList +
                '}';
    }
}
