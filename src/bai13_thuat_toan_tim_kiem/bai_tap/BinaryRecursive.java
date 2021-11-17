package bai13_thuat_toan_tim_kiem.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BinaryRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> stringList = new ArrayList<>();
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
        System.out.println("Enter a string, respectively");
        int inputNum = scanner.nextInt();
        stringList.add(inputNum);
        }
        Collections.sort(stringList);
        System.out.println(stringList);
        System.out.println(binarySearch(stringList,0,stringList.size(),4));
    }
    public static int binarySearch(List<Integer> array, int left, int right, int value){
        int middle = (left + right) / 2;
        int high = array.size() - 1;
        while (left > high) {
            if (array.get(middle) == value) {
                return middle;
            } else if (array.get(middle) < value) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return middle;
    }
}
