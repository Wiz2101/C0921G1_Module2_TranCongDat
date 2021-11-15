package bai11_dsa_stack_queue.bai_tap.chuyen_doi_thap_phan_sang_he_nhi_phan;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhập số thập phân cần chuyển đổi");
        int dec = scanner.nextInt();
        while (dec>0){
            int result = dec % 2;
            stack.add(result);
            dec /= 2;
        }

        Collections.reverse(stack);
        System.out.println("Kết quả chuyển đổi sang nhị phân:");
        for (Integer st:stack) {
            System.out.print(st);
        }
        System.out.println();

        System.out.println("Nhập số nhị phân cần chuyển đổi:");
        int bin = scanner.nextInt();
        System.out.println("Kết quả chuyển đổi từ nhị phân sang thập phân: " + getDecima(bin));

    }

    public static int getDecima(int bin){
        int result = 0;
        int n=0;
        while(true){
            if(bin == 0){
                break;
            } else {
                int temp = bin%10;
                result += temp*Math.pow(2, n);
                bin = bin/10;
                n++;
            }
        }
        return result;
    }
}
