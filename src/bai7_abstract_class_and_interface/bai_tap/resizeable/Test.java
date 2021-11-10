package bai7_abstract_class_and_interface.bai_tap.resizeable;

import bai6_inheritance.thuc_hanh.Circle;
import bai6_inheritance.thuc_hanh.Rectangle;
import bai6_inheritance.thuc_hanh.Shape;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new CircleS7();
        shapes[1] = new RectangleS7();
        shapes[2] = new SquareS7();
        for (Shape sh : shapes) {
            if (sh instanceof CircleS7) {
                CircleS7 circleS7 = (CircleS7) sh;
                System.out.println(circleS7.getArea());
                circleS7.resize(Math.random()*99+1);
                System.out.println(circleS7.getArea());
            } else if (sh instanceof RectangleS7) {
                RectangleS7 rectangleS7 = (RectangleS7) sh;
                rectangleS7.resize(100);
                System.out.println(rectangleS7.getArea());
            } else {
                SquareS7 squareS7 = (SquareS7) sh;
                squareS7.resize(Math.random()*99 + 1);
                System.out.println(squareS7);
            }
            System.out.println(sh);
        }


    }
}
