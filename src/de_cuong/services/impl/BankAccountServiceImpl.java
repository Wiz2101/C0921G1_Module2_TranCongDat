package de_cuong.services.impl;

import de_cuong.exception.NotFoundBankAccountException;
import de_cuong.models.BankAccount;
import de_cuong.models.PaymentAccount;
import de_cuong.models.SaveAccount;

import java.util.*;

public class BankAccountServiceImpl {
    Scanner scanner = new Scanner(System.in);
    static Set<BankAccount> bankAccountSet = new TreeSet<>(new CompaById());

    static {
        bankAccountSet = convertStringToBankAccount();
    }

    public void del() {
        display();
        while (true) {
            try {
                boolean check = true;
                Iterator<BankAccount> iterator = bankAccountSet.iterator();
                System.out.println("Vui lòng nhập ID tài khoản muốn xóa");
                long id = Long.parseLong(scanner.nextLine());
                while (iterator.hasNext()) {
                    if (iterator.next().getIdAccount() == id) {
                        iterator.remove();
                        check = true;
                        break;
                    } else {
                        check = false;
                    }
                }
                if (!check) {
                    throw new NotFoundBankAccountException();
                }
                WriteReadServiceImpl.writeCSV(WriteReadServiceImpl.covertAccountToString(), false);
                System.out.println("Tài khoản đã được xóa thành công!");
                break;
            } catch (NotFoundBankAccountException e) {
                e.printStackTrace();
            }
        }
        display();
    }

    public void display() {
        System.out.println("-------DANH SÁCH TÁT CẢ TÀI KHOẢN-------");
        for (BankAccount bankAccount : bankAccountSet) {
            System.out.println(bankAccount);
        }
        System.out.println("----------------------------------------");
    }

    public static Set<BankAccount> convertStringToBankAccount() {
        Set<BankAccount> bankAccountSet = new TreeSet<>(new CompaById());
        List<String> stringList = new ArrayList<>();
        stringList = WriteReadServiceImpl.readCSV();
        String[] bankAccount;
        for (String st : stringList) {
            bankAccount = st.split(",");
            if (bankAccount.length == 6) {
                bankAccountSet.add(new PaymentAccount(Long.parseLong(bankAccount[0]), bankAccount[1], bankAccount[2], bankAccount[3], Long.parseLong(bankAccount[4]), Long.parseLong(bankAccount[5])));
            } else if (bankAccount.length == 8) {
                bankAccountSet.add(new SaveAccount(Integer.parseInt(bankAccount[0]), bankAccount[1], bankAccount[2], bankAccount[3], Long.parseLong(bankAccount[4]), bankAccount[5], Double.parseDouble(bankAccount[6]), Integer.parseInt(bankAccount[7])));

            }
        }
        return bankAccountSet;
    }

    public void find() {
        System.out.println("Vui lòng nhập tên chủ tài khoản cần tìm kiếm");
        String input = scanner.nextLine();
        for (BankAccount bankAccount : bankAccountSet) {
            if (bankAccount.getAccountName().toLowerCase().contains(input.toLowerCase()) | bankAccount.getAccountCode().toLowerCase().contains(input.toLowerCase())) {
                System.out.println(bankAccount);
            }
        }
    }
}
