package case_study.exception;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BirthdayException extends Exception {
    public BirthdayException() {
        super("Please re-enter the Date of Birth following format: dd/mm/YYYY");
    }

    public BirthdayException(String message) {
        super(message);
    }
}

