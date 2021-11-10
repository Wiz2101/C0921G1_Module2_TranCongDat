package bai7_abstract_class_and_interface.bai_tap.colorable;

import bai6_inheritance.thuc_hanh.Rectangle;

public class RectangleColor extends Rectangle implements Colorable {
    @Override
    public void howToColor() {
        this.setColor("DarkRed");
    }
}
