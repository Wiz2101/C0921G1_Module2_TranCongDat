package bai14_thuat_toan_sap_xep.bai_tap;

import java.util.Scanner;

public class MinhHoaSapXepChen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài mảng");
        int size = scanner.nextInt();
        int[] intArr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập giá trị ở vị trí thứ " + (i + 1));
            intArr[i] = scanner.nextInt();
        }
        System.out.println("Tạo biến pos đại diện cho con trỏ và biến x để đại diện giá trị tại vị trí index");
        int pos, x;
        System.out.println("Thao tác sắp xếp đang diễn ra");
        for (int i = 0; i < intArr.length; i++) {
            x = intArr[i];
            pos = i;
            System.out.println("Gán biến x bằng giá trị vị trị thứ " + i + " trong mảng với giá trị: " + intArr[i]);
            System.out.println("Gán biến pos bằng vị trí thứ " + i + " trong mảng");
            System.out.println("Thực hiện vòng lặp while lần thứ " + pos);
            System.out.println("Nếu pos > 0 và x nhỏ hơn giá trị ở vị trị " + (pos - 1) + " trong mảng thì gán giá trị ở vị trí " + pos + " bằng giá trị ở vị trí " + (pos - 1));
            while (pos > 0 && x < intArr[pos - 1]) {
                intArr[pos] = intArr[pos - 1];
                System.out.println("Đã gán giá trị " + intArr[pos] + " tại vị trí " + pos + " bằng " + intArr[pos - 1] + " tại vị trí " + (pos - 1));
                pos--;
                System.out.println("Giảm pos đi 1 để vị trí hiện tại so sánh với vị trí tiếp theo");
            }
            intArr[pos] = x;
        }
        for (int i : intArr) {
            System.out.print(i + "\t");
        }
    }
}
