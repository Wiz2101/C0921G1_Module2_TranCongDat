package bai_tap_them.quan_li_giao_thong.services.impl;

import bai_tap_them.quan_li_giao_thong.models.XeTai;
import bai_tap_them.quan_li_giao_thong.services.IXeTaiService;

import java.util.ArrayList;
import java.util.Scanner;

public class XeTaiService implements IXeTaiService {
    Scanner scanner = new Scanner(System.in);
    ArrayList<XeTai> xeTaiArrayList = new ArrayList<>();

    @Override
    public void addXeTai(XeTai xeTai) {
        xeTaiArrayList.add(xeTai);
    }

    @Override
    public void displayXeTai() {
        for (XeTai xeTai:xeTaiArrayList) {
            System.out.println(xeTai);
        }
    }

    @Override
    public void delXeTai() {
        System.out.println("Nhập biển kiếm soát cần xóa");
        String bienKiemSoat = scanner.nextLine();
        for (int i = 0; i < xeTaiArrayList.size(); i++) {
            if(xeTaiArrayList.get(i).getBienKiemSoat().equals(bienKiemSoat)){
                xeTaiArrayList.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        return "XeTaiService{" +
                "scanner=" + scanner +
                ", xeTaiArrayList=" + xeTaiArrayList +
                '}';
    }
}
