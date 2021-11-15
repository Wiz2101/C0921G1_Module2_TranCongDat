package bai11_dsa_stack_queue.bai_tap.to_chuc_du_lieu_hop_ly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class DemergingTest {
    public static void main(String[] args) {
        ArrayList<Demerging> student = new ArrayList<>();
        student.add(new Demerging("Nguyễn B", "nữ", "16/05/96"));
        student.add(new Demerging("Nguyễn D", "nam", "22/11/96"));
        student.add(new Demerging("Nguyễn A", "nữ", "06/01/96"));
        student.add(new Demerging("Nguyễn C", "nam", "21/01/96"));
        Collections.sort(student, new CompaByDOB());
        for (Demerging st : student) {
            System.out.println(st);
        }
        Queue<ArrayList<Demerging>> newNu = new LinkedList<>();
        Queue<ArrayList<Demerging>> newNam = new LinkedList<>();
        for (Demerging de : student) {
            if (student.get(1).equals("nữ")) {
                newNu.add(student);
            } else {
                newNam.add(student);
            }
        }
        ArrayList<ArrayList<Demerging>> output = new ArrayList<>();
        for (ArrayList<Demerging> female : newNu) {
            if (female.isEmpty()) {
                output.add(female);
            }
        }
        for (ArrayList<Demerging> male : newNam) {
            if (male.isEmpty()) {
                output.add(male);
            }
        }
        for (ArrayList<Demerging> result:output) {
            System.out.println(result);
        }
    }

}
