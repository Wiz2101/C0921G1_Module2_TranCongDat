package bai_tap_them.models;

public abstract class PhuongTien extends HangSanXuat{
    private String bienKiemSoat;

    private int namSX;
    private String chuSoHuu;

    public PhuongTien() {
    }

    public PhuongTien(String bienKiemSoat, int namSX, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.namSX = namSX;
        this.chuSoHuu = chuSoHuu;
    }

    public PhuongTien(String[] hangSX, String bienKiemSoat, int namSX, String chuSoHuu) {
        super(hangSX);
        this.bienKiemSoat = bienKiemSoat;
        this.namSX = namSX;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
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
        return "PhuongTien{" +
                "bienKiemSoat='" + bienKiemSoat + '\'' +
                ", namSX=" + namSX +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
}
