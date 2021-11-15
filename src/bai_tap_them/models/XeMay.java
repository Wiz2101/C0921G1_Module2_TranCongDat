package bai_tap_them.models;

public class XeMay extends PhuongTien {
    private double congSuat;

    public XeMay(double congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(String bienKiemSoat, String hangSX, int namSX, String chuSoHuu, double congSuat) {
        super(bienKiemSoat, hangSX, namSX, chuSoHuu);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                super.toString() +
                "congSuat=" + congSuat +
                '}';
    }
}
