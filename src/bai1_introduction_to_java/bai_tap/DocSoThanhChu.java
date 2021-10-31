package bai1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number:  ");
        int number = scanner.nextInt();
        if (number >= 0 && number <= 9) {
            switch (number) {
                case 0:
                    System.out.print("zero ");
                    break;
                case 1:
                    System.out.print("one ");
                    break;
                case 2:
                    System.out.print("two ");
                    break;
                case 3:
                    System.out.print("three ");
                    break;
                case 4:
                    System.out.print("four ");
                    break;
                case 5:
                    System.out.print("five ");
                    break;
                case 6:
                    System.out.print("six ");
                    break;
                case 7:
                    System.out.print("seven ");
                    break;
                case 8:
                    System.out.print("eight ");
                    break;
                case 9:
                    System.out.print("nine ");
                    break;
                default:
                    System.out.print("Out of Ability ");
            }
        } else if (number >= 10 && number < 20) {
            int ones = number % 10;
            switch (ones) {
                case 0:
                    System.out.print("ten ");
                    break;
                case 1:
                    System.out.print("eleven ");
                    break;
                case 2:
                    System.out.print("twelve ");
                    break;
                case 3:
                    System.out.print("thirteen ");
                    break;
                case 4:
                    System.out.print("four ");
                    break;
                case 5:
                    System.out.print("five ");
                    break;
                case 6:
                    System.out.print("six ");
                    break;
                case 7:
                    System.out.print("seven ");
                    break;
                case 8:
                    System.out.print("eight ");
                    break;
                case 9:
                    System.out.print("nine ");
                    break;
                default:
                    System.out.print("Out of Ability ");
            }
        } else if (number >= 20 && number < 100) {
            int ones = number % 10;
            int tens = (number - ones) / 10;
            switch (tens) {
                case 2:
                    System.out.print("twenty  ");
                    break;
                case 3:
                    System.out.print("thirty  ");
                    break;
                case 4:
                    System.out.print("forty  ");
                    break;
                case 5:
                    System.out.print("fifty  ");
                    break;
                case 6:
                    System.out.print("sixty  ");
                    break;
                case 7:
                    System.out.print("seventy  ");
                    break;
                case 8:
                    System.out.print("eighty  ");
                    break;
                case 9:
                    System.out.print("ninety  ");
                    break;
                default:
                    System.out.print("Out of Ability ");
            }
            switch (ones) {
                case 0:
                    System.out.print(" ");
                    break;
                case 1:
                    System.out.print("one ");
                    break;
                case 2:
                    System.out.print("two ");
                    break;
                case 3:
                    System.out.print("three ");
                    break;
                case 4:
                    System.out.print("four ");
                    break;
                case 5:
                    System.out.print("five ");
                    break;
                case 6:
                    System.out.print("six ");
                    break;
                case 7:
                    System.out.print("seven ");
                    break;
                case 8:
                    System.out.print("eight ");
                    break;
                case 9:
                    System.out.print("nine ");
                    break;
                default:
                    System.out.print("Out of Ability ");
            }

        } else if (number >= 100 && number <= 999) {
            int hundreds, tens, ones, numAfter;
            hundreds = number - (number % 100);
            numAfter = (number % 100);
            ones = numAfter % 10;
            tens = numAfter - ones;

            switch (hundreds) {
                case 100:
                    System.out.print("one-hundred  ");
                    break;
                case 200:
                    System.out.print("two-hundred  ");
                    break;
                case 300:
                    System.out.print("three-hundred  ");
                    break;
                case 400:
                    System.out.print("four-hundred ");
                    break;
                case 500:
                    System.out.print("five-hundred ");
                    break;
                case 600:
                    System.out.print("six-hundred ");
                    break;
                case 700:
                    System.out.print("seven-hundred ");
                    break;
                case 800:
                    System.out.print("eight-hundred ");
                    break;
                case 900:
                    System.out.print("nine-hundred ");
                    break;
                default:
                    System.out.print("Out of Ability ");
            }
            switch (tens) {
                case 10:
                    System.out.print("ten ");
                    break;
                case 20:
                    System.out.print("twenty ");
                    break;
                case 30:
                    System.out.print("thirty ");
                    break;
                case 40:
                    System.out.print("forty ");
                    break;
                case 50:
                    System.out.print("fifty ");
                    break;
                case 60:
                    System.out.print("sixty ");
                    break;
                case 70:
                    System.out.print("seventy ");
                    break;
                case 80:
                    System.out.print("eighty ");
                    break;
                case 90:
                    System.out.print("ninety ");
                    break;
                default:
                    System.out.print("Out of Ability ");
            }
            if (numAfter >= 10 && numAfter < 20) {
                switch (ones) {
                    case 0:
                        System.out.print("ten ");
                        break;
                    case 1:
                        System.out.print("eleven ");
                        break;
                    case 2:
                        System.out.print("twelve ");
                        break;
                    case 3:
                        System.out.print("thirteen ");
                        break;
                    case 4:
                        System.out.print("fourteen ");
                        break;
                    case 5:
                        System.out.print("fiveteen ");
                        break;
                    case 6:
                        System.out.print("sixteen ");
                        break;
                    case 7:
                        System.out.print("seventeen ");
                        break;
                    case 8:
                        System.out.print("eightteen ");
                        break;
                    case 9:
                        System.out.print("nineteen ");
                        break;
                    default:
                        System.out.print("Out of Ability ");
                }
            } else {
                switch (ones) {
                    case 0:
                        System.out.print(" ");
                        break;
                    case 1:
                        System.out.print("one ");
                        break;
                    case 2:
                        System.out.print("two ");
                        break;
                    case 3:
                        System.out.print("three ");
                        break;
                    case 4:
                        System.out.print("four ");
                        break;
                    case 5:
                        System.out.print("five ");
                        break;
                    case 6:
                        System.out.print("six ");
                        break;
                    case 7:
                        System.out.print("seven ");
                        break;
                    case 8:
                        System.out.print("eight ");
                        break;
                    case 9:
                        System.out.print("nine ");
                        break;
                    default:
                        System.out.print("Out of Ability ");
                }
            }
        }
    }
}


