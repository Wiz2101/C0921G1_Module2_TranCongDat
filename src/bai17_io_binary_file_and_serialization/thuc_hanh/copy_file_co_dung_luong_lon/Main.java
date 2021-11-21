package bai17_io_binary_file_and_serialization.thuc_hanh.copy_file_co_dung_luong_lon;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file input: ");
        String inputSource = scanner.nextLine();
        System.out.println("Nhập đường dẫn file output: ");
        String outputSource = scanner.nextLine();

        File sourceFile = new File(inputSource);
        File destFile = new File(outputSource);

        try{
            copyFileUsingJava7Files(sourceFile,destFile);
            System.out.println("Copy Completed");
        } catch (Exception e){
            System.out.println("Can't copy that file");
            System.out.println(e.getMessage());
        }
    }
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try{
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0){
                outputStream.write(buffer,0,length);
            }
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
