package bai_tap_them.services.impl;

import bai_tap_them.models.XeMay;
import bai_tap_them.services.IXeMayService;

import java.util.ArrayList;

public class XeMayService implements IXeMayService {
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

//    @Override
//    public void delXeMay(int id) {
//        for (int i = 0; i < xeMayArrayList.size(); i++) {
//            if (xeMayArrayList.get(i).getId() == id) {
//                xeMayArrayList.remove(i);
//            }
//        }
//    }

    @Override
    public String toString() {
        return "XeMayService{" +
                "xeMayArrayList=" + xeMayArrayList +
                '}';
    }
}
