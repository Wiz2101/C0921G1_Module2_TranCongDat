package de_cuong.exception;

public class NotFoundBankAccountException extends Exception {
    public NotFoundBankAccountException() {
        super("Không tìm thấy tài khoản ngân hàng!");
    }

    public NotFoundBankAccountException(String message) {
        super(message);
    }
}
