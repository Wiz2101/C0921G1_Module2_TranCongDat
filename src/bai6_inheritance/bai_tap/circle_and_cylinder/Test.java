package bai6_inheritance.bai_tap.circle_and_cylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(2.5, "black");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(3.0, 4.5, "darkgreen");
        System.out.println(cylinder);
    }
}
