package bai2_loop_in_java.thuc_hanh;

import java.math.BigDecimal;
import java.util.Scanner;

public class TinhLaiVay {
    public static void main(String[] args) {
        double tienVay;
        int soThang;
        double laiVay;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền muốn vay");
        tienVay = scanner.nextDouble();
        System.out.println("Nhập thời gian vay");
        soThang = scanner.nextInt();
        System.out.println("Nhập tỉ lệ lãi vay");
        laiVay = scanner.nextDouble();
        
        double tienLai = 0;
        for (int i=1; i<soThang; i++){
            tienLai += tienVay * (laiVay * 100) / 12 * soThang;
        }
        BigDecimal bDec = new BigDecimal(tienLai);
        System.out.println("Tổng tiền lãi là: " + bDec.toPlainString());
    }
}
