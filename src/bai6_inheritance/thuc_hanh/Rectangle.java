package bai6_inheritance.thuc_hanh;

public class Rectangle extends Shape {
    private double width = 2.0;
    private double height = 1.0;

    public Rectangle(){}

    public Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        System.out.print("Rectangle Area: ");
        return width*height;
    }

    public double getPerimeter(){
        return (width+height) * 2;
    }

    @Override
    public String toString() {
        return "A rectangle with height: " + getHeight() + " and " + getWidth() + ",which is a subclass of " + super.toString();
    }
}
