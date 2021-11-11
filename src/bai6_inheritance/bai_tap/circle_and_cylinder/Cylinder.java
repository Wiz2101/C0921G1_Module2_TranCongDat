package bai6_inheritance.bai_tap.circle_and_cylinder;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(){
    }

    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return height * radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Cylinder with radius: " + getRadius()
                + " and " + getHeight()
                + ", which is a subclass of "
                + super.toString()
                + ". It has area is: " + getArea()
                + " and volume is: " + getVolume();
    }
}
