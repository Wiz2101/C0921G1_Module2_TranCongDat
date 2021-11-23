package bai17_io_binary_file_and_serialization.bai_tap.copy_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyBinaryFile {
    static final String SOURCE_PATH = "src/bai17_io_binary_file_and_serialization/bai_tap/copy_file_nhi_phan/productResult.csv";
    static final String TARGET_PATH = "src/bai17_io_binary_file_and_serialization/bai_tap/copy_file_nhi_phan/productNew.csv";

    public List<Product> readBinary() {
        List<Product> list = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        File file = new File(SOURCE_PATH);
        try {
            fileInputStream = new FileInputStream(file);
            if (fileInputStream.available() != 0) {
                objectInputStream = new ObjectInputStream(fileInputStream);
                list = (List<Product>) objectInputStream.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }


            public void writeBinary (List <bai17_io_binary_file_and_serialization.bai_tap.copy_file_nhi_phan.Product> list) {
                FileOutputStream fileOutputStream = null;
                ObjectOutputStream objectOutputStream = null;
                try {
                    File file = new File(TARGET_PATH);
                    fileOutputStream = new FileOutputStream(file);
                    objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    objectOutputStream.writeObject(list);
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        fileOutputStream.close();
                        objectOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
