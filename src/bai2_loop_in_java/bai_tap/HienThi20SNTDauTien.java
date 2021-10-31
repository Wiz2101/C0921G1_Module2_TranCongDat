package bai2_loop_in_java.bai_tap;

public class HienThi20SNTDauTien {
    public static void main(String[] args) {
        int num = 1;
        int count = 0;
        String SNT = "";
        while (count<20){
            if (num >=2){
                boolean flag = true;
                for (int i=2; i<num; i++){
                    if (num % i == 0){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    count ++;
                    SNT += num + ",";

                }
            }
            num++;
        }
        System.out.println("20 SNT đầu tiên là: " + SNT);
    }
}
