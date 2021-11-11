package bai10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity > 0) {
            elements = new Object[capacity];
        }
    }

    //    @Override
//    public Object clone()
//    {
//        try {
//            MyList<E> v = (MyList<E>) super.clone();
//            v.elements = Arrays.copyOf(elements, size);
////            v.modCount = 0;
//            return v;
//        } catch (CloneNotSupportedException e) {
//            throw new InternalError(e);
//        }
//    }
    public E clone() {
        Object[] newElements = Arrays.copyOf(elements, size);
        return (E) Arrays.toString(newElements);
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        elements[size++] = element;
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }
}