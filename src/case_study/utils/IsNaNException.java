package case_study.utils;

public class IsNaNException extends Exception{
    public IsNaNException() {
        super("The input must be Interger");
    }

    public IsNaNException(String message) {
        super(message);
    }
}
