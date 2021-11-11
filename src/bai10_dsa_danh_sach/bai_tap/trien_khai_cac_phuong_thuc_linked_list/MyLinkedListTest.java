package bai10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(1);
        list.add(1, 2);
        list.add(2,"Melinda");
        list.add(3,4);
        list.add(4,5);
        list.addFirst(0);
        System.out.println(list.indexOf("Melinda"));
    }
}
