package bai8_clean_code_refactoring.thuc_hanh.refractoring_doi_ten_tach_hang;

public class Calculator {
    public static final char ADDITION ='+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION ='*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperand, int secondOperancd, char operator) {
        switch (operator) {
            case '+':
                return firstOperand + secondOperancd;
            case '-':
                return firstOperand - secondOperancd;
            case '*':
                return firstOperand * secondOperancd;
            case '/':
                if (secondOperancd != 0)
                    return firstOperand / secondOperancd;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}

