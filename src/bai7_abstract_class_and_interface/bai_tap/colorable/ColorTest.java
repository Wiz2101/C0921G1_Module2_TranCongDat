package bai7_abstract_class_and_interface.bai_tap.colorable;

import bai6_inheritance.thuc_hanh.Rectangle;
import bai6_inheritance.thuc_hanh.Shape;
import bai6_inheritance.thuc_hanh.Square;

public class ColorTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new CircleColor();
        shapes[1] = new RectangleColor();
        shapes[2] = new SquareColor();
        for (Shape cl : shapes){
            if (cl instanceof CircleColor){
                CircleColor circleColor = (CircleColor) cl;
                circleColor.howToColor();
                System.out.println(circleColor);
                System.out.println(circleColor.getArea());
            } else if (cl instanceof RectangleColor) {
                RectangleColor rectangleColor = (RectangleColor) cl;
                rectangleColor.howToColor();
                System.out.println(rectangleColor);
                System.out.println(rectangleColor.getArea());
            } else {
                SquareColor squareColor = (SquareColor) cl;
                squareColor.howToColor();
                System.out.println(squareColor);
                System.out.println(squareColor.getArea());
            }
        }
    }
}
