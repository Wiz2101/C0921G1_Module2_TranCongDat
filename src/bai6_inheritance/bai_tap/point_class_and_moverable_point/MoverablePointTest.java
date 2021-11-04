package bai6_inheritance.bai_tap.point_class_and_moverable_point;

public class MoverablePointTest {
    public static void main(String[] args) {
        MoverablePoint moverablePoint = new MoverablePoint();
        System.out.println(moverablePoint);

        moverablePoint = new MoverablePoint(1.2f,2.3f,2.4f,4.2f);
        System.out.println(moverablePoint);

        for (int i = 0; i <100 ; i++) {
            moverablePoint.Move();
            System.out.println(moverablePoint);
        }
    }
}
