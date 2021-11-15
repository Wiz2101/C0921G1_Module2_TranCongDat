package bai_tap_them.services.impl;

import bai_tap_them.models.Oto;
import bai_tap_them.services.IOtoService;

import java.util.ArrayList;
import java.util.Scanner;

public class OtoService implements IOtoService {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Oto> otoArrayList = new ArrayList<>();
    @Override
    public void addOto(Oto oto) {
        otoArrayList.add(oto);
    }

    @Override
    public void displayOto() {
        for (Oto oto:otoArrayList) {
            System.out.println(oto);
        }
    }

    @Override
    public void delOto() {
        System.out.println("Nhập biển kiếm soát cần xóa");
        String bienKiemSoat = scanner.nextLine();
        for (int i = 0; i < otoArrayList.size(); i++) {
            if(otoArrayList.get(i).getBienKiemSoat().equals(bienKiemSoat)){
                otoArrayList.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        return "OtoService{" +
                "scanner=" + scanner +
                ", otoArrayList=" + otoArrayList +
                '}';
    }
}
