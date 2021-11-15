package bai_tap_them.models;

public class XeMay extends PhuongTien {
    private double congSuat;

    public XeMay(double congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(String bienKiemSoat, int namSX, String chuSoHuu, double congSuat) {
        super(bienKiemSoat, namSX, chuSoHuu);
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
