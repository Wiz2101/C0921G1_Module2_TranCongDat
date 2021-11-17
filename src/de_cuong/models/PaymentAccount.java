package de_cuong.models;

public class PaymentAccount extends BankAccount{
    int cardNo;
    long moneyAccount;

    public PaymentAccount() {
    }

    public PaymentAccount(int cardNo, long moneyAccount) {
        this.cardNo = cardNo;
        this.moneyAccount = moneyAccount;
    }

    public PaymentAccount(String idAccount, String accountCode, String accountName, String accountOpenedDate, int cardNo, long moneyAccount) {
        super(idAccount, accountCode, accountName, accountOpenedDate);
        this.cardNo = cardNo;
        this.moneyAccount = moneyAccount;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public long getMoneyAccount() {
        return moneyAccount;
    }

    public void setMoneyAccount(long moneyAccount) {
        this.moneyAccount = moneyAccount;
    }

    @Override
    public String toString() {
        return "PaymentAccount{" +
                super.toString() +
                "cardNo=" + cardNo +
                ", moneyAccount=" + moneyAccount;
    }
}
