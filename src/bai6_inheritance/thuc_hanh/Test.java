package bai6_inheritance.thuc_hanh;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2.0,"dark red", true);
        shapes[1] = new Rectangle(3.2,2.4,"darkblue", false);
        shapes[2] = new Square(2.5,"darkgrey",true);

    }
}
