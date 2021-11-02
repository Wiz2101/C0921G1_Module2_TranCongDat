package bai4_lop_va_doi_tuong_trong_java.bai_tap.QuadraticEquation;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(){

    }

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }

    public double getDiscriminant(){
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getEqualRoot(){
        return -this.b / 2 * this.a;
    }
    public double getRoot1() {
        return (-this.b + Math.pow(this.b * this.b - 4 * this.a * this.c, 0.5)) / 2 * this.a;
    }
    public double getRoot2() {
        return (-this.b - Math.pow(this.b * this.b - 4 * this.a * this.c, 0.5)) / 2 * this.a;
    }
    public String display() {
        return "QuadraticEquation{" + this.a + "x2 " + this.b + "x" + this.c + " = 0 }";
    }
}
