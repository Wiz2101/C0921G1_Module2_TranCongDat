package giai_thuat;

public class TanSuat {
    /*boolean checkCharFrequency(int[] arr) {
        int[] result = new int[arr.length];
        int s = 0;
        for (int i=0; i<arr.length;i++){
            int count = 0;
            for (int j=0; j<arr.length;j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            result[i] = count;
            if (result[0] != result[i]) {
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;
    }*/

    //For-each;
    void checkCharFrequency (int[] arr){
        int [] result = new int [arr.length];
        int i=0;
        for (int a:arr){
            int count = 0;
            for (int b:arr){
                if (a==b){
                    count++;
                }
            }
            result[i] = count;
            i++;
            if (result[0]!=result[i]){
                System.out.println("false");
            }
        }
        System.out.println("true");

    }
}

