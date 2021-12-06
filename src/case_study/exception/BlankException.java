package case_study.exception;

public class BlankException extends Exception{
    public BlankException() {
        super("The information must not be blank! Please enter fully information");
    }

    public BlankException(String message) {
        super(message);
    }
}
