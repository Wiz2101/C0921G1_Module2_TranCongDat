package demo.write_csv_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {
        public static final String FILE_PATH = "src/demo/write_csv_file/student.csv";
        public static final String COMMA = ",";
        public static void writeCSV(Student student) {
            File file = new File(FILE_PATH);
            FileWriter fileWriter = null;
            BufferedWriter bufferedWriter = null;
            try {
                fileWriter = new FileWriter(file, true);
                bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(student.getId() + COMMA + student.getName() + "\n");
                bufferedWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if(bufferedWriter != null){
                        bufferedWriter.close();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

        public static void main(String[] args) {
            writeCSV(new Student(1, "Hoa"));
            writeCSV(new Student(2, "Hung"));
        }
    }

