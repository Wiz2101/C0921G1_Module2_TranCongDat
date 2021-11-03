package bai4_lop_va_doi_tuong_trong_java.bai_tap.Fan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan (int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public Fan(){};
    public int getSpeed(){
        return this.speed;
    }
    public boolean getOn(){
        return this.on;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        if (this.getOn()){
            return "Fan has radius: " + this.getRadius() + " with color " + this.getColor() + ". It is turning on with speed: " + this.getSpeed();
        } else {
            return "Fan has radius: " + this.getRadius() + " with color " + this.getColor() + ". It is turning off";

        }
    }


}
