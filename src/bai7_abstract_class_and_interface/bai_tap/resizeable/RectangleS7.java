package bai7_abstract_class_and_interface.bai_tap.resizeable;

import bai6_inheritance.thuc_hanh.Rectangle;

public class RectangleS7 extends Rectangle implements Resizeable {
    @Override
    public void resize(double percent){
        this.setHeight(this.getHeight()*(100+Math.sqrt(percent))/100);
        this.setWidth(this.getWidth()*(100+Math.sqrt(percent))/100);
    }
}
