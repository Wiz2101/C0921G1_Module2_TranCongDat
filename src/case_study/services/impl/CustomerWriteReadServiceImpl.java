package case_study.services.impl;

import case_study.models.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomerWriteReadServiceImpl {
    static final String CUSTOMER_SOURCE = "src/case_study/data/Customer.csv";
    static final String CUSTOMER_DESTINATION = "src/case_study/data/Customer.csv";
    static final String COMMA = ",";

    public static void writeCSV(List<Customer> list, boolean append) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        File file = new File(CUSTOMER_DESTINATION);
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer li : list) {
                bufferedWriter.write(li.getId() + COMMA + li.getFullName() + COMMA + li.getDob() + COMMA + li.getIdCard() + COMMA + li.getPhoneNumber() + COMMA + li.getEmail() + COMMA + li.getCustomerType());
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
        File file = new File(CUSTOMER_SOURCE);
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

    public static List<Customer> convertStringToCustomer(){
        List<String>stringList = readCSV();
        List<Customer> customerList = new LinkedList<>();
        String[] customer;
        for (String st:stringList){
            customer = st.split(",");
            customerList.add(new Customer(customer[0],customer[1],customer[2],customer[3],customer[4],customer[5],customer[6]));
        }
        return customerList;
    }

    public static List<String> covertCustomerToString() {
        List<String> listString = new ArrayList<>();
        List<Customer> customerList = null;
        for (Customer customer : customerList) {
            listString.add(customer.toString());
        }
        return listString;
    }
}
