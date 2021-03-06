package de_cuong.models;

public class PaymentAccount extends BankAccount{
    long cardNo;
    long moneyAccount;

    public PaymentAccount() {
    }

    public PaymentAccount(int cardNo, long moneyAccount) {
        this.cardNo = cardNo;
        this.moneyAccount = moneyAccount;
    }

    public PaymentAccount(long idAccount, String accountCode, String accountName, String accountOpenedDate, long cardNo, long moneyAccount) {
        super(idAccount, accountCode, accountName, accountOpenedDate);
        this.cardNo = cardNo;
        this.moneyAccount = moneyAccount;
    }

    public long getCardNo() {
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
                ", cardNo=" + cardNo +
                ", moneyAccount=" + moneyAccount +
                '}';
    }

    public String toStringAttribute() {
        return super.toString() +
                "," + cardNo +
                "," + moneyAccount;
    }
}
