package giai_thuat;

import java.util.*;

public class DifferentSubstringsTrie {
    public static void main(String[] args) {
        String string = "abca";
        Set<String> newStr = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                newStr.add(string.substring(i, j));
            }
        }
        System.out.println(newStr);
        System.out.println(newStr.size());
    }
}
//        public static int solution (String inputStr){
//            Set<String> result = new HashSet<>();
//
//            for (int i = 0; i < inputStr.length(); i++) {
//                for (int j = i + 1; j <= inputStr.length(); j++) {
//
//                    result.add(inputStr.substring(i, j));
//                }
//            }
//
//            return result.size();
//        }
//    }
//
