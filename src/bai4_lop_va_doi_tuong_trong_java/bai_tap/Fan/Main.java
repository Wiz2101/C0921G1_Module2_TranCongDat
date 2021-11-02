package bai4_lop_va_doi_tuong_trong_java.bai_tap.Fan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the speed of fan 1 & fan 2, respectively");
        int speed1 = scanner.nextInt();
        int speed2 = scanner.nextInt();
        System.out.println("Enter the on/off of fan 1 & fan 2, respectively");
        boolean on1 = scanner.nextBoolean();
        boolean on2 = scanner.nextBoolean();
        System.out.println("Enter the radius of fan 1 & fan 2, respectively");
        double radius1 = scanner.nextDouble();
        double radius2 = scanner.nextDouble();
        System.out.println("Enter the color of fan 1 & fan 2, respectively");
        String color1 = scanner.next();
        String color2 = scanner.next();
        Fan fan = new Fan();
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(speed1);
        fan1.setOn(on1);
        fan1.setRadius(radius1);
        fan1.setColor(color1);

        fan2.setSpeed(speed2);
        fan2.setOn(on2);
        fan2.setRadius(radius2);
        fan2.setColor(color2);
        System.out.println(fan.toString());
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
