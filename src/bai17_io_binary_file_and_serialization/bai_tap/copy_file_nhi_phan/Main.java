package bai17_io_binary_file_and_serialization.bai_tap.copy_file_nhi_phan;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CopyBinaryFile copyBinaryFile = new CopyBinaryFile();
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("1","A"));
        productList.add(new Product("2","B"));
        productList.add(new Product("3","C"));
        copyBinaryFile.writeBinary(copyBinaryFile.readBinary());
    }
}
