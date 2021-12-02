package de_cuong.services.impl;

import de_cuong.models.BankAccount;
import de_cuong.models.PaymentAccount;
import de_cuong.models.SaveAccount;
import de_cuong.services.IAccountService;

import java.util.*;

public class PaymentAccountServiceImpl implements IAccountService {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addAccount() {
        long cardNo;
        long moneyAccount;
        int max = 0;
        for (BankAccount bankAccount : BankAccountServiceImpl.bankAccountSet) {
            if (bankAccount.getIdAccount() > max) {
                max = (int) bankAccount.getIdAccount();
            }
        }
        long id = max + 1;
        System.out.println("ID tài khoản thanh toán: " + id);
        System.out.println("Vui lòng nhập mã tài khoản");
        String accountCode = scanner.nextLine();
        System.out.println("Vui lòng nhập tên chủ tài khoản");
        String customerName = scanner.nextLine();
        System.out.println("Vui lòng nhập ngày tạo tài khoản");
        String createDate = scanner.nextLine();
        do {
            System.out.println("Vui lòng nhập số thể");
            cardNo = Long.parseLong(scanner.nextLine());
        } while (!(cardNo > 0));
        do {
            System.out.println("Số tiền trong tài khoản");
            moneyAccount = Long.parseLong(scanner.nextLine());
        } while (!(moneyAccount > 0));
        BankAccountServiceImpl.bankAccountSet.add(new PaymentAccount(id, accountCode, customerName, createDate, cardNo, moneyAccount));
        WriteReadServiceImpl.writeCSV(WriteReadServiceImpl.covertAccountToString(), false);
        System.out.println("Tài khoản đã được thêm thành công");
    }

    @Override
    public void delAccount() {
        display();
        System.out.println("Vui lòng nhập ID tài khoản ngân hàng cần xóa");
        long id = Long.parseLong(scanner.nextLine());
        for (BankAccount bankAccount : BankAccountServiceImpl.bankAccountSet)
            if (bankAccount instanceof PaymentAccount) {
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

    @Override
    public void display() {
        System.out.println("-----------PAYMENT ACCOUNT------------");
        for (BankAccount bankAccount : BankAccountServiceImpl.bankAccountSet) {
            if (bankAccount instanceof PaymentAccount) {
                System.out.println(bankAccount);
            }
        }
        System.out.println("-----------------------------------");
    }

    @Override
    public void find() {

    }

    public List<PaymentAccount> convertStringToPaymentAccount() {
        List<PaymentAccount> paymentAccountList = new ArrayList<>();
        List<String> stringList = WriteReadServiceImpl.readCSV();
        String[] paymentAccount;
        for (String string : stringList) {
            paymentAccount = string.split(",");
            if (paymentAccount.length == 6) {
                paymentAccountList.add(new PaymentAccount(Long.parseLong(paymentAccount[0]), paymentAccount[1], paymentAccount[2], paymentAccount[3], Long.parseLong(paymentAccount[4]), Long.parseLong(paymentAccount[5])));
            }
        }
        return paymentAccountList;
    }
}
