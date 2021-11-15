package bai_tap_them.models;

public class XeTai extends PhuongTien {
    private double trongTai;

    public XeTai(double trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String bienKiemSoat, String tenHangSX, int namSX, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, tenHangSX, namSX, chuSoHuu);
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
