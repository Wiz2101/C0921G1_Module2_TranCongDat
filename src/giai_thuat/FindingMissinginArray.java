package giai_thuat;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindingMissinginArray {
    public static void main(String[] args) {
        int[] A = {7, 2, 5, 3, 5, 3}; //[2,3,3,5,5,7]
        int[] B = {7, 2, 5, 4, 6, 3, 5, 3};//[2,3,3,4,5,5,6,7]
        Arrays.sort(A);
        Arrays.sort(B);
        int[] C = new int[B.length];
        int temp = 0;
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[j] == B[i]) {
                    break;
                }
                temp = B[i];
                System.out.println(temp);
            }
        }
//        for (int i = 0; i < b.length; i++) {
//            if (b[i] != 0){
//                for (int j = 0; j < c.length; j++) {
//                    c[i] = b[i];
//                }
//            }
//        }
//        for (int i = 0; i < c.length ; i++) {
//            System.out.println(c[i]);
//        }
    }
}


//    public static void findingMissing(int[] a, int[] b) {
//        int[] c = new int[2];
//        for (int i = 0; i < b.length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                if (b[i] != a[j]) {
//                    for (int k = 0; k < c.length; k++) {
//                        c[k] = b[i];
//                    }
//                }
//            }
//        }
//        for (Integer re : c) {
//            System.out.println(re);
//        }
//    }

