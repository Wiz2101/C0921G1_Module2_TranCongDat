package bai6_inheritance.thuc_hanh;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        System.out.println("The Rectangle Area: " + rectangle.getArea());
        System.out.println("The Rectangle Area: " + rectangle.getPerimeter());

        rectangle = new Rectangle(2.0,4.2,"grey",false);
        System.out.println(rectangle);
        System.out.println("The Rectangle Area: " + rectangle.getArea());
        System.out.println("The Rectangle Area: " + rectangle.getPerimeter());


    }
}
