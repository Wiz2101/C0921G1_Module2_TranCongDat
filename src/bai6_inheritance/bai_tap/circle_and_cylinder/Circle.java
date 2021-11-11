package bai6_inheritance.bai_tap.circle_and_cylinder;

public class Circle {
    public double radius = 1.0;
    private String color = "red";

    public Circle(){};

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Cylinder with radius: " + getRadius()
                + ". It has area is: " + getArea();
    }
}
