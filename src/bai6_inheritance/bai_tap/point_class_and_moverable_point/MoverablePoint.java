package bai6_inheritance.bai_tap.point_class_and_moverable_point;

public class MoverablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoverablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoverablePoint(){};

    public float getXSpeed(){
        return this.xSpeed;
    }

    public void setXSpeed(float x){
        this.xSpeed = x;
    }
    public float getYSpeed(){
        return this.ySpeed;
    }

    public void setYSpeed(float y){
        this.ySpeed = y;
    }

    public void setSpeed(float x, float y){
        this.xSpeed = x;
        this.ySpeed = y;
    }

    public float[] getSpeed(){
        float[] arr = {this.xSpeed,this.ySpeed};
        return arr;
    }

    @Override
    public String toString() {
        return "x" + this.getX() + "y= " + this.getY() + "xs=" + getXSpeed() + "ys=" + getYSpeed();
    }

    public MoverablePoint Move(){
        this.setX(this.getX()+this.getXSpeed());
        this.setY(this.getY()+this.getYSpeed());
        return new MoverablePoint();
    }
}
