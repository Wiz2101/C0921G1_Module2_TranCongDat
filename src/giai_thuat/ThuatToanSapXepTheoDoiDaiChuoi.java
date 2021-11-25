package giai_thuat;

import java.util.Arrays;

/*Với inputArray = ["abc", "", "aaa", "a", "zz"] thì kết quả sortStr(inputArray) = ["", "a", "zz", "abc", "aaa"]

Mảng được sắp xếp theo thứ tự tăng của độ dài xâu. Xâu "abc" có cùng độ dài với xâu "aaa", nhưng do đứng trước "aaa" trong mảng ban đầu nên vẫn đứng trước "aaa" trong mảng kết quả.
Lưu ý: Không dùng các phương thức có sẵn dể sắp xếp, phải dùng thuật toán tự viết.*/
public class ThuatToanSapXepTheoDoiDaiChuoi {
    public static void sortByLength(String[] inputArray) {
//        for (int i = 1; i < inputArray.length ; i++) {
        int i = 1;
        for (String st:inputArray) {
            for (int j = 0; j < inputArray.length - i; j++) {
                if (inputArray[j].length() > inputArray[j + 1].length()) {
                    String temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                }
            }
            i++;
        }

        for (String st:inputArray) {
            System.out.println(st);
        }
    }


    public static void main(String[] args) {
        String[] inputArray = {"abc", "", "aaa", "a", "zz"};
        sortByLength(inputArray);
    }
}
