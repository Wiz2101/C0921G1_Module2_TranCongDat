package bai6_inheritance.bai_tap.point_2d_point_3d;

public class Point3D extends Point2D {
    float z;
    public Point3D(){
    }

    public Point3D(float x, float y,float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        this.getX(x) = x;
        this.getY(y) = y;
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arr = {x,y,z};
        return arr;
    }

    @Override
    public String toString() {
        return "The Point3D has x,y,z respectively: " + getXYZ() + ", which is a subclass of " + super.toString();
    }
}
