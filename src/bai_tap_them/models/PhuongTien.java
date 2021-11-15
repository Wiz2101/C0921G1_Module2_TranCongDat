package bai_tap_them.models;

public abstract class PhuongTien {
    private String bienKiemSoat;
//    private String hangSX = {"HSX-001,Yamaha,Nhật Bản", "HSX-002,Honda,Nhật Bản", "HSX-003, Dongfeng,Trung Quốc", "HSX-004, Huyndai,Hàn Quốc", "HSX-005, Ford,Mỹ", "HSX-006, Toyota,Nhật Bản", "HSX-006, Hino,Nhật Bản"};
    private int namSX;
    private String chuSoHuu;

    public PhuongTien() {
    }

    public PhuongTien(String bienKiemSoat, String hangSX, int namSX, String chuSoHuu) {
        int id = 0;
        this.bienKiemSoat = bienKiemSoat;
//        this.hangSX = hangSX;
        this.namSX = namSX;
        this.chuSoHuu = chuSoHuu;
    }

    public PhuongTien(String bienKiemSoat, int namSX, String chuSoHuu) {
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

//    public String getHangSX(int id) {
//        for (int i = 0; i < hangSX.length ; i++) {
//            if(id == i){
//                return hangSX[i];
//            }
//        }
//
//        return null;
//    }

//    public void setHangSX(String[] hangSX) {
//        this.hangSX = hangSX;
//    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return "PhuongTien: " +
                "bienKiemSoat='" + bienKiemSoat +
                ", namSX=" + namSX +
                ", chuSoHuu='" + chuSoHuu;
    }
}
