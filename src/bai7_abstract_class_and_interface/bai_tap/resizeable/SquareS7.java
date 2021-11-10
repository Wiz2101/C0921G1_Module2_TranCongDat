package bai7_abstract_class_and_interface.bai_tap.resizeable;

import bai6_inheritance.thuc_hanh.Square;

public class SquareS7 extends Square implements Resizeable {
    @Override
    public void resize(double percent){
        this.setSide(this.getSide()*Math.sqrt((100+percent)/100));
    }
}
