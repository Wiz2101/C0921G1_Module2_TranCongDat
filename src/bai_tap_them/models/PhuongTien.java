package bai_tap_them.models;

public abstract class PhuongTien {
    private String bienKiemSoat;
    private String hangSX;
    private int namSX;
    private String chuSoHuu;

    public PhuongTien() {
    }

    public PhuongTien(String bienKiemSoat, String hangSX, int namSX, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangSX = hangSX;
        this.namSX = namSX;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

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
        return  "bienKiemSoat='" + bienKiemSoat + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", namSX=" + namSX +
                ", chuSoHuu='" + chuSoHuu + '\'';
    }
}
