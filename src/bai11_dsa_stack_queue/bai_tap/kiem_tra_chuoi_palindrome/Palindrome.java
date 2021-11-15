package bai11_dsa_stack_queue.bai_tap.kiem_tra_chuoi_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String string = "Able was I ere I saw Elba";
        boolean isPalinDrome = true;
        String[] array = string.toLowerCase().split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
            queue.add(array[i]);
        }

        while (!stack.isEmpty()){
            if(!(stack.pop().equals(queue.poll()))){
                isPalinDrome = false;
                break;
            }
        }
        if(isPalinDrome){
            System.out.println("String is PalinDrome");
        } else {
            System.out.println("String is not PalinDrome");
        }
    }
}
