package de_cuong.services.impl;

import de_cuong.models.BankAccount;
import de_cuong.models.PaymentAccount;
import de_cuong.models.SaveAccount;
import de_cuong.services.IAccountService;

import java.util.*;

public class SaveAccountServiceImpl implements IAccountService {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addAccount() {
        int max = 0;
        long saveMoney;
        for (BankAccount bankAccount : BankAccountServiceImpl.bankAccountSet) {
            if (bankAccount.getIdAccount() > max) {
                max = (int) bankAccount.getIdAccount();
            }
        }
        long id = max + 1;
        System.out.println("ID tài khoản: " + id);
        System.out.println("Vui lòng nhập mã tài khoản");
        String accountCode = scanner.nextLine();
        System.out.println("Vui lòng nhập tên chủ tài khoản");
        String customerName = scanner.nextLine();
        System.out.println("Vui lòng nhập ngày tạo tài khoản");
        String createDate = scanner.nextLine();
        do {
            System.out.println("Vui lòng nhập số tiền gửi tiết kiệm");
            saveMoney = Long.parseLong(scanner.nextLine());
        } while (!(saveMoney > 0));
        System.out.println("Vui lòng nhập ngày gửi tiết kiệm");
        String saveDate = scanner.nextLine();
        System.out.println("Vui lòng nhập lãi suất");
        double interest = Double.parseDouble(scanner.nextLine());
        System.out.println("Vui lòng nhập kỳ hạn");
        int period = Integer.parseInt(scanner.nextLine());
        BankAccountServiceImpl.bankAccountSet.add(new SaveAccount(id, accountCode, customerName, createDate, saveMoney, saveDate, interest, period));
        WriteReadServiceImpl.writeCSV(WriteReadServiceImpl.covertAccountToString(), false);
        System.out.println("Tài khoản đã được thêm thành công");
    }

    @Override
    public void delAccount() {
        display();
        System.out.println("Vui lòng nhập ID tài khoản ngân hàng cần xóa");
        long id = Long.parseLong(scanner.nextLine());
        for (BankAccount bankAccount : BankAccountServiceImpl.bankAccountSet)
            if (bankAccount instanceof SaveAccount) {
                if (id == bankAccount.getIdAccount()) {
                    System.out.println("Bạn có muốn xóa tài khoản: " + bankAccount);
                    System.out.println("Vui lòng nhập (Y) để xóa hoặc (N) để hủy lệnh xóa");
                    String confirm = scanner.nextLine();
                    if (confirm.toLowerCase().equals("y")) {
                        BankAccountServiceImpl.bankAccountSet.remove(bankAccount);
                        WriteReadServiceImpl.writeCSV(WriteReadServiceImpl.covertAccountToString(), false);
                    } else if (confirm.toLowerCase().equals("n")) {
                        display();
                        break;
                    }
                }
            }
    }

    public void display() {
        System.out.println("-----------SAVE ACCOUNT------------");
        for (BankAccount bankAccount : BankAccountServiceImpl.bankAccountSet) {
            if (bankAccount instanceof SaveAccount) {
                System.out.println(bankAccount);
            }
        }
        System.out.println("-----------------------------------");
    }

    public void find() {
        System.out.println("Vui lòng nhập tên chủ tài khoản cần tìm kiếm");
        String name = scanner.nextLine();
        for (BankAccount bankAccount : BankAccountServiceImpl.bankAccountSet) {
            if (bankAccount instanceof SaveAccount) {
                if (bankAccount.getAccountName().contains(name))
                    System.out.println(bankAccount);
            }
        }
    }

    public List<SaveAccount> convertStringToSaveAccount() {
        List<String> stringList = WriteReadServiceImpl.readCSV();
        List<SaveAccount> saveAccountList = new ArrayList<>();
        String[] saveAccount;
        for (String st : stringList) {
            saveAccount = st.split(",");
            if (saveAccount.length == 8)
                saveAccountList.add(new SaveAccount(Integer.parseInt(saveAccount[0]), saveAccount[1], saveAccount[2], saveAccount[3], Long.parseLong(saveAccount[4]), saveAccount[5], Double.parseDouble(saveAccount[6]), Integer.parseInt(saveAccount[7])));
        }
        return saveAccountList;
    }
}
