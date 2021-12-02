package de_cuong.services.impl;

import de_cuong.models.BankAccount;
import de_cuong.models.PaymentAccount;
import de_cuong.models.SaveAccount;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadServiceImpl {
    static final String SOURCE = "src/de_cuong/data/BankAccount.csv";
    static final String DESTINATION = "src/de_cuong/data/BankAccount.csv";
    public static void writeCSV(List<String> list, boolean append) {
        File file = new File(DESTINATION);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String li : list) {
                bufferedWriter.write(li);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.flush();
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static List<String> readCSV() {
        File file = new File(SOURCE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String> stringList = new ArrayList<>();

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
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

    public static List<String> covertAccountToString() {
        final String COMMA = ",";
        List<String> stringList = new ArrayList<>();
        for (BankAccount bankAccount : BankAccountServiceImpl.bankAccountSet) {
            if (bankAccount instanceof PaymentAccount) {
                stringList.add(bankAccount.getIdAccount() + COMMA + bankAccount.getAccountCode() + COMMA + bankAccount.getAccountName() + COMMA + bankAccount.getAccountOpenedDate() + COMMA + ((PaymentAccount) bankAccount).getCardNo() + COMMA + ((PaymentAccount) bankAccount).getMoneyAccount());
            }
            if (bankAccount instanceof SaveAccount){
                stringList.add(bankAccount.getIdAccount() + COMMA + bankAccount.getAccountCode() + COMMA + bankAccount.getAccountName() + COMMA + bankAccount.getAccountOpenedDate() + COMMA + ((SaveAccount) bankAccount).getMoneyAmount() + COMMA + ((SaveAccount) bankAccount).getSavedDate() + COMMA + ((SaveAccount) bankAccount).getInterestRate() + COMMA + ((SaveAccount) bankAccount).getPeriod());
            }
        }
        return stringList;
    }
}
