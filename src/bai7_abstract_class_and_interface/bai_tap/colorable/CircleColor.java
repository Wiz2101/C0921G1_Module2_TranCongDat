package bai7_abstract_class_and_interface.bai_tap.colorable;

import bai6_inheritance.thuc_hanh.Circle;

public class CircleColor extends Circle implements Colorable {
    @Override
    public void howToColor(){
        this.setColor("DarkGrey");
    }
}
