package de_cuong.models;

public class SaveAccount extends BankAccount {
    long moneyAmount;
    String savedDate;
    double interestRate;
    int period;

    public SaveAccount() {
    }

    public SaveAccount(long moneyAmount, String savedDate, double interestRate, int period) {
        this.moneyAmount = moneyAmount;
        this.savedDate = savedDate;
        this.interestRate = interestRate;
        this.period = period;
    }

    public SaveAccount(long idAccount, String accountCode, String accountName, String accountOpenedDate, long moneyAmount, String savedDate, double interestRate, int period) {
        super(idAccount, accountCode, accountName, accountOpenedDate);
        this.moneyAmount = moneyAmount;
        this.savedDate = savedDate;
        this.interestRate = interestRate;
        this.period = period;
    }

    public long getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(long moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public String getSavedDate() {
        return savedDate;
    }

    public void setSavedDate(String savedDate) {
        this.savedDate = savedDate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "SaveAccount{" +
                super.toString() +
                ", moneyAmount=" + moneyAmount +
                ", savedDate='" + savedDate + '\'' +
                ", interestRate=" + interestRate +
                ", period=" + period +
                '}';
    }

    public String toStringAttribute() {
        return super.toStringAttribute() +
                "," + moneyAmount +
                "," + savedDate +
                "," + interestRate +
                "," + period;
    }
}
