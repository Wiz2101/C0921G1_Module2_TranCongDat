package bai6_inheritance.bai_tap.triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        triangle = new Triangle(3.0,4.0,5.0);
        System.out.println(triangle);
    }
}
