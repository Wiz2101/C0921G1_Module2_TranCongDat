package bai6_inheritance.bai_tap.triangle;

public class Triangle {
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    public Triangle(){};

    public Triangle(double x, double y, double z){
        this.side1 = x;
        this.side2 = y;
        this.side3 = z;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea(){
        double p = (side1+side2+side3)/2;
        double h = 2 * Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)) / side1;
        return (h * side1) / 2;
    }

    public double getPerimeter(){
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return "side1,side2,side3, respectively: " + side1 + "," + side2 + "," + side3
                + ". The Triangle has Area is: " + getArea() + " and Perimeter is: " + getPerimeter();
    }
}
