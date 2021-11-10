package bai7_abstract_class_and_interface.thuc_hanh.interface_comparator;

import bai6_inheritance.thuc_hanh.Circle;
import bai7_abstract_class_and_interface.thuc_hanh.interface_comparable.ComparableCircle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2){
        if (c1.getRadius() > c2.getRadius()){
            return 1;
        } else if (c1.getRadius() < c2.getRadius()){
            return -1;
        } else {
            return 0;
        }
    }
}
