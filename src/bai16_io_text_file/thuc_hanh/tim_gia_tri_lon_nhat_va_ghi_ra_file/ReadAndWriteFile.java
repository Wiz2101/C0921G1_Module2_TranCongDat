package bai16_io_text_file.thuc_hanh.tim_gia_tri_lon_nhat_va_ghi_ra_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {
    public List<Integer> readFile(String path){
        List<Integer> numbersList = new ArrayList<>();
        try{
            File file = new File(path);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                numbersList.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (Exception e){
            System.err.println("File không tồn tại hoặc nội dung có lỗi!");
        }
        return numbersList;
    }

    public void writeFile(String path, int max){
        try {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static int findMaxValue(List<Integer> numbersList){
        int max = numbersList.get(0);
        for (int i = 0; i < numbersList.size() ; i++) {
            if (numbersList.get(i) > max){
                max = numbersList.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbersList = readAndWriteFile.readFile(path);
        int maxValue = findMaxValue(numbersList);
        System.out.println("Nhập đường dẫn file ghi: ");
        String writePath = scanner.nextLine();
        readAndWriteFile.writeFile(writePath, maxValue);

    }
}
