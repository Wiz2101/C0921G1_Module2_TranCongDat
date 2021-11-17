package de_cuong.services.impl;

import de_cuong.models.SaveAccount;
import de_cuong.services.ISaveAccountService;

import java.util.ArrayList;
import java.util.List;

public class SaveAccountService implements ISaveAccountService {

    @Override
    public void addSaveAccount(SaveAccount saveAccount) {
        List<SaveAccount> saveAccountList = new ArrayList<>();
        saveAccountList.add(new SaveAccount());
    }

    @Override
    public void delSaveAccount() {

    }
}
