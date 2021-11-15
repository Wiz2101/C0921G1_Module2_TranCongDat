package bai_tap_them.services.impl;

import bai_tap_them.models.Oto;
import bai_tap_them.services.IOtoService;

import java.util.ArrayList;

public class OtoService implements IOtoService {
    ArrayList<Oto> otoServiceArrayList = new ArrayList<>();
    @Override
    public void addOto(Oto oto) {
        otoServiceArrayList.add(oto);
    }

    @Override
    public void displayOto() {
        for (Oto oto:otoServiceArrayList) {
            System.out.println(oto);
        }
    }

//    @Override
//    public void delOto(int id) {
//        for (int i = 0; i < otoServiceArrayList.size() ; i++) {
//            if (otoServiceArrayList.get(i).getId() == id){
//                otoServiceArrayList.remove(i);
//            }
//        }
//    }

    @Override
    public String toString() {
        return "OtoService{" +
                "otoServiceArrayList=" + otoServiceArrayList +
                '}';
    }
}
