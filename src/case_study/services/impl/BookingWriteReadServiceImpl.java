package case_study.services.impl;

import case_study.models.Booking;
import case_study.models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class BookingWriteReadServiceImpl {
    public static final String BOOKING_SOURCE = "src/case_study/data/Booking.csv";
    public static final String BOOKING_DESTINATION = "src/case_study/data/Booking.csv";
    static final String COMMA = ",";
    public static void writeCSV(SortedSet<Booking> list, boolean append) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        File file = new File(BOOKING_DESTINATION);
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Booking li : list) {
                bufferedWriter.write(li.getBookingID() + COMMA + li.getStartDate() + COMMA + li.getEndDate() + COMMA + li.getCustomerID() + COMMA + li.getServiceName() + COMMA + li.getServiceType());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.flush();
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> readCSV() {
        List<String> stringList = new ArrayList<>();
        File file = new File(BOOKING_SOURCE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line=bufferedReader.readLine()) != null){
                stringList.add(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null){
                    bufferedReader.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        return stringList;
    }
    public static SortedSet<Booking> convertStringToEmployee(){
        List<String> stringList = readCSV();
        SortedSet<Booking> bookingList = new TreeSet<>();
        String[] booking;
        for (String st:stringList){
            booking = st.split(",");
            bookingList.add(new Booking(booking[0],booking[1],booking[2],booking[3],booking[4],booking[5]));
        }
        return bookingList;
    }
}
