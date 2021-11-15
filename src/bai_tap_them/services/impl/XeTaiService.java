package bai_tap_them.services.impl;

import bai_tap_them.models.XeTai;
import bai_tap_them.services.IXeTaiService;

import java.util.ArrayList;

public class XeTaiService implements IXeTaiService {
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

//    @Override
//    public void delXeTai(int id) {
//        for (int i = 0; i < xeTaiArrayList.size(); i++) {
//            if(xeTaiArrayList.get(i).getId() == id){
//                xeTaiArrayList.remove(i);
//            }
//        }
//    }

}
