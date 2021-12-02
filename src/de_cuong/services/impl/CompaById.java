package de_cuong.services.impl;

import de_cuong.models.BankAccount;

import java.util.Comparator;

public class CompaById implements Comparator<BankAccount> {
    @Override
    public int compare(BankAccount o1, BankAccount o2) {
        return (int) (o1.getIdAccount() - o2.getIdAccount());
    }
}
