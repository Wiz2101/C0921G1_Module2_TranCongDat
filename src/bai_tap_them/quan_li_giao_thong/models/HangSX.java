package bai_tap_them.quan_li_giao_thong.models;

import java.util.ArrayList;
import java.util.List;

public class HangSX {
    private String maHangSX;
    private String tenHangSX;
    private String tenQuocGia;

    public HangSX() {
    }

    public HangSX(String maHangSX, String tenHangSX, String tenQuocGia) {
        this.maHangSX = maHangSX;
        this.tenHangSX = tenHangSX;
        this.tenQuocGia = tenQuocGia;
    }

    public String getMaHangSX() {
        return maHangSX;
    }

    public void setMaHangSX(String maHangSX) {
        this.maHangSX = maHangSX;
    }

    public String getTenHangSX() {
        return tenHangSX;
    }

    public void setTenHangSX(String tenHangSX) {
        this.tenHangSX = tenHangSX;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }

    @Override
    public String toString() {
        return "HangSX{" +
                "maHangSX='" + maHangSX + '\'' +
                ", tenHangSX='" + tenHangSX + '\'' +
                ", tenQuocGia='" + tenQuocGia + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<HangSX> hangSXList = new ArrayList<>();
        HangSX hangSX1 = new HangSX("HSX-001", "Yamaha", "Nhật Bản");
        HangSX hangSX2 = new HangSX("HSX-002", "Honda", "Nhật Bản");
        HangSX hangSX3 = new HangSX("HSX-003", " Dongfeng", "Trung Quốc");
        HangSX hangSX4 = new HangSX("HSX-004", " Huyndai", "Hàn Quốc");
        HangSX hangSX5 = new HangSX("HSX-005", " Ford", "Mỹ");
        HangSX hangSX6 = new HangSX("HSX-006", " Toyota", "Nhật Bản");
        HangSX hangSX7 = new HangSX("HSX-006", " Hino", "Nhật Bản");
        hangSXList.add(hangSX1);
        hangSXList.add(hangSX2);
        hangSXList.add(hangSX3);
        hangSXList.add(hangSX4);
        hangSXList.add(hangSX5);
        hangSXList.add(hangSX6);
        hangSXList.add(hangSX7);
    }


}
