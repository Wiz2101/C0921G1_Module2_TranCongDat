package bai6_inheritance.thuc_hanh;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public Double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Double getArea(){
        return radius*radius*Math.PI;
    }

    public Double getPerimeter(){
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius: " + getRadius() + ", which is a subclass of " +super.toString();
    }
}
