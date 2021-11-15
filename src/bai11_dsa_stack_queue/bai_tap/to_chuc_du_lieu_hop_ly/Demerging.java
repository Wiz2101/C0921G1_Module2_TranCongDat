package bai11_dsa_stack_queue.bai_tap.to_chuc_du_lieu_hop_ly;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class Demerging {
    String name;
    String gender;
    String dob;

    public Demerging() {
    }

    public Demerging(String name, String gender, String dob) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Demerging{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
