package bai6_inheritance.bai_tap.point_2d_point_3d;

public class Point2D {
    private float x;
    private float y;

    public Point2D(){};

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX(float x) {
        return this.x;
    }

    public float getY(float y) {
        return this.y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float [] arr = {this.x, this.y};
        return arr;
    }

    @Override
    public String toString() {
        return "The Point2D has x,y respectively: " + getXY();
    }
}
