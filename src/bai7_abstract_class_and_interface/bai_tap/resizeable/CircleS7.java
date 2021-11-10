package bai7_abstract_class_and_interface.bai_tap.resizeable;

import bai6_inheritance.thuc_hanh.Circle;

public class CircleS7 extends Circle implements Resizeable {
    @Override
    public void resize (double percent){
        this.setRadius(this.getRadius()*Math.sqrt((100+percent)/100));
    };


}
