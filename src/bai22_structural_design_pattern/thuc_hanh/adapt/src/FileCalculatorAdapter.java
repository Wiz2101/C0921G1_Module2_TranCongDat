package bai22_structural_design_pattern.thuc_hanh.adapt.src;

import com.codegym.FileUtil;

import java.io.File;

public class FileCalculatorAdapter implements FileCalculator {
    @Override
    public long calculateSize(String path) {
        FileUtil fileUtil = new FileUtil();
        File file = new File(path);
        return fileUtil.calculateSize(file);
    }
}
