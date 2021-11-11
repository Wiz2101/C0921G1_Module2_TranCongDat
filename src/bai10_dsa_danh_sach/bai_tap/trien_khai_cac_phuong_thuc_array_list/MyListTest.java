package bai10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_array_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> a = new MyList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(3);
        a.add(4);

        System.out.println(a.clone());
    }
}
