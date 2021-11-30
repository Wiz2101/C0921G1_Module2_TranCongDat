package case_study.services.impl;

import case_study.models.Booking;

import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        if (o1.getStartDate().compareTo(o2.getStartDate()) == 0){
            return o1.getEndDate().compareTo(o2.getEndDate());
        } else {
            return o1.getStartDate().compareTo(o2.getStartDate());
        }
    }
}
