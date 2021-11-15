package bai11_dsa_stack_queue.bai_tap.to_chuc_du_lieu_hop_ly;

import java.util.Comparator;

public class CompaByDOB implements Comparator<Demerging> {

    @Override
    public int compare(Demerging o1, Demerging o2) {
        return o1.dob.compareTo(o2.dob);
    }
}
