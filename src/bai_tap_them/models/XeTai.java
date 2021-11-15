package bai_tap_them.models;

public class XeTai extends PhuongTien {
    private double trongTai;

    public XeTai() {
    }

    public XeTai(String bienKiemSoat, String hangSX, int namSX, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, hangSX, namSX, chuSoHuu);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                super.toString() +
                "trongTai=" + trongTai +
                '}';
    }
}
