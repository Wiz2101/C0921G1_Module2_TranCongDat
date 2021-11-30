package bai22_structural_design_pattern.thuc_hanh.adapt.src;

import bai22_structural_design_pattern.thuc_hanh.adapt.src.FileCalculator;

public class Client {
    private FileCalculator fileCalculator;

    public Client(FileCalculator fileCalculator) {
        this.fileCalculator = fileCalculator;
    }

    public void printFileSize(String path) {
        long size = fileCalculator.calculateSize(path);
        System.out.println("Size: " + size);
    }
}
