package de_cuong.models;

public abstract class BankAccount {
    String idAccount;
    String accountCode;
    String accountName;
    String accountOpenedDate;

    public BankAccount() {
    }

    public BankAccount(String idAccount, String accountCode, String accountName, String accountOpenedDate) {
        this.idAccount = idAccount;
        this.accountCode = accountCode;
        this.accountName = accountName;
        this.accountOpenedDate = accountOpenedDate;
    }

    public String getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(String idAccount) {
        this.idAccount = idAccount;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountOpenedDate() {
        return accountOpenedDate;
    }

    public void setAccountOpenedDate(String accountOpenedDate) {
        this.accountOpenedDate = accountOpenedDate;
    }

    @Override
    public String toString() {
        return  "idAccount='" + idAccount + '\'' +
                ", accountCode='" + accountCode + '\'' +
                ", accountName='" + accountName + '\'' +
                ", accountOpenedDate='" + accountOpenedDate + '\'';
    }
}
