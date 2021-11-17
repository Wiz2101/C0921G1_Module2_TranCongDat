package bai14_thuat_toan_sap_xep.bai_tap;

public class CaiDatThuatToanSapXepChen {
    public static void main(String[] args) {
    int[] intArr = {2,4,1,23,1,6,7,4,2};
    sapXepChen(intArr);
    }

    public static void sapXepChen(int[] array) {
        int x, pos;
        for (int i = 0; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
        for (int ar:array) {
            System.out.print(ar + "\t");
        }
    }
}
