package bai17_io_binary_file_and_serialization.bai_tap.copy_file_nhi_phan;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CopyBinaryFile copyBinaryFile = new CopyBinaryFile();
        List<Products> productsList = new ArrayList<>();
        productsList = copyBinaryFile.readBinary();
        productsList.add(new Products("1","A"));
        productsList.add(new Products("2","B"));
        productsList.add(new Products("3","C"));
        copyBinaryFile.writeBinary(productsList);
    }
}
