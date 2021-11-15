package bai11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_su_dung_stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập độ dài mảng:");
        int size = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Vui lòng nhập giá trị cho phần tử thứ " + i);
            stack.push(scanner.nextInt());
        }
        System.out.println("Mảng trước khi đảo ngược:" + stack.toString());
        Stack<Integer> newStack = new Stack<>();
        for (int i = 0; i < size; i++) {
            newStack.push(stack.pop());
        }
        System.out.println("Mảng sau khi đảo ngược: " + newStack.toString());

        Stack<String> wStack = new Stack<>();
        String[] mWord = "CodeGym Đà Nẵng".split("");
        System.out.print("Mảng trước khi đảo ngược: ");
        for (String st : mWord) {
            System.out.print(st);
        }
        String newWord = "";
        for (int i = 0; i < mWord.length; i++) {
            wStack.push(mWord[i]);
        }
        for (int i = 0; i < mWord.length; i++) {
            newWord += wStack.pop();
        }
        System.out.println("");
        System.out.println("Mảng sau khi đảo ngược:" + newWord);
    }
}
