package bai11_dsa_stack_queue.bai_tap.kiem_tra_dau_ngoac_trong_bieu_thuc;

import java.util.Stack;

public class Bracket {
    public static boolean main(String[] args) {
        String string = "s * (s – a) * (s – b * (s – c)";
        String[] array = string.split("");
        Stack<String> bStack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("(")){
                bStack.add(array[i]);
            } else if (array[i].equals(")")){
                if(bStack.isEmpty()){
                    return false;
                }
                String left = array[i];
                if (left != array[i]){
                    return false;
                }
            }
        }
        return false;
    }
}
