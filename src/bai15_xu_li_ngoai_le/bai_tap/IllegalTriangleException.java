package bai15_xu_li_ngoai_le.bai_tap;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        super("Tam giác không hợp lệ");
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
}
