package bai7_abstract_class_and_interface.bai_tap.colorable;

import bai6_inheritance.thuc_hanh.Square;

public class SquareColor extends Square implements Colorable {

    @Override
    public void howToColor() {
        this.setColor("DarkBlue");
    }
}
