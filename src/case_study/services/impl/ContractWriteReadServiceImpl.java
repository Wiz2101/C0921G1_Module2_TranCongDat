package case_study.services.impl;

import case_study.models.Contract;
import case_study.models.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContractWriteReadServiceImpl {
    static final String CONTRACT_SOURCE = "src/case_study/data/Contract.csv";
    static final String CONTRACT_DESTINATION = "src/case_study/data/Contract.csv";
    static final String COMMA = ",";

    public static void writeCSV(List<Contract> list, boolean append) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        File file = new File(CONTRACT_DESTINATION);
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Contract li : list) {
                bufferedWriter.write(li.getContractNo() + COMMA + li.getBookingNo() + COMMA + li.getDeposit() + COMMA + li.getTotalPayment() + COMMA + li.getCustomerNo());
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
        File file = new File(CONTRACT_SOURCE);
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

    public static List<Contract> convertStringToContract(){
        List<String>stringList = readCSV();
        List<Contract> contractList = new ArrayList<>();
        String[] contract;
        for (String st:stringList){
            contract = st.split(",");
            contractList.add(new Contract(contract[0],contract[1],Integer.parseInt(contract[2]),Integer.parseInt(contract[3]),contract[4]));
        }
        return contractList;
    }
}
