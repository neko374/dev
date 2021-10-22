package com.example.web22.services;

import com.example.web22.AccountNumberDO;

import java.util.List;

public interface AccountNumberService {
    List<AccountNumberDO> list();
    public void insert (AccountNumberDO accountnumber);
    public void updPassword(AccountNumberDO accountNumberDO);
}
