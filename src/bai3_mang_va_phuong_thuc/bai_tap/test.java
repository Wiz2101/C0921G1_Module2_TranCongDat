package bai3_mang_va_phuong_thuc.bai_tap;

public class test {
    public static void main(String[] args) {
        int[] x = {3,5,6,9};
        int a = 0, b = 0;
        for(int y : x){
            if(y % 2 != 0)
            {
                a+=y;
                b++;
            }
        }
    }
}
