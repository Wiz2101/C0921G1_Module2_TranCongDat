package bai6_inheritance.thuc_hanh;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        System.out.println("The Area of Square: " + square.getArea());
        System.out.println("The Perimeter of Square: " + square.getPerimeter());

        square = new Square(3.0);
        System.out.println(square);
        System.out.println("The Area of Square: " + square.getArea());
        System.out.println("The Perimeter of Square: " + square.getPerimeter());

        square = new Square(4.2,"violet",false);
        System.out.println(square);
        System.out.println("The Area of Square: " + square.getArea());
        System.out.println("The Perimeter of Square: " + square.getPerimeter());
    }
}
