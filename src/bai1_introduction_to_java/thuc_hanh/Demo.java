package bai1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        if (number >= 0 && number <= 9) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                default:
                    System.out.println("Out of Ability");
            }
        } else if (number >= 10 && number < 20) {
            int ones = number % 10;
            switch (ones) {
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                default:
                    System.out.println("Out of Ability");
            }
        } else if (number >= 20 && number < 100) {
            int ones = number % 10;
            int tens = (number - ones) / 10;
            switch (tens) {
                case 2:
                    System.out.println("twenty");
                    break;
                case 3:
                    System.out.println("thirty");
                    break;
                case 4:
                    System.out.println("forty");
                    break;
                case 5:
                    System.out.println("fifty");
                    break;
                case 6:
                    System.out.println("sixty");
                    break;
                case 7:
                    System.out.println("seventy");
                    break;
                case 8:
                    System.out.println("eighty");
                    break;
                case 9:
                    System.out.println("ninety");
                    break;
                default:
                    System.out.println("Out of Ability");
            }
            switch (ones) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                default:
                    System.out.println("Out of Ability");
            }
        } else if (number >= 100 && number <= 999) {
            int ones = number % 10; //697 ->
            int tens = (number - ones) / 100;//6
            int hundreds = (number - ones) / 100;
            switch (hundreds) {
                case 1:
                    System.out.println("one-hundred");
                    break;
                case 2:
                    System.out.println("two-hundred");
                    break;
                case 3:
                    System.out.println("three-hundred");
                    break;
                case 4:
                    System.out.println("four-hundred");
                    break;
                case 5:
                    System.out.println("five-hundred");
                    break;
                case 6:
                    System.out.println("six-hundred");
                    break;
                case 7:
                    System.out.println("seven-hundred");
                    break;
                case 8:
                    System.out.println("eight-hundred");
                    break;
                case 9:
                    System.out.println("nine-hundred");
                    break;
                default:
                    System.out.println("Out of Ability");
            }
        }
    }
}
