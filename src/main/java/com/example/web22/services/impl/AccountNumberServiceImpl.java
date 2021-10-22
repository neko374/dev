package com.example.web22.services.impl;

import com.example.web22.AccountNumberDO;
import com.example.web22.AccountNumberDOExample;
import com.example.web22.dao.AccountNumberDOMapper;
import com.example.web22.services.AccountNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountNumberServiceImpl implements AccountNumberService {
    @Autowired(required = false)
    private AccountNumberDOMapper accountNumberDOMapper;
    @Override
    public List<AccountNumberDO> list(){
        return accountNumberDOMapper.listAllInfo(0);
    }

    @Override
    public void insert(AccountNumberDO accountnumber) {
        accountNumberDOMapper.insert(accountnumber);
    }

    @Override
    public void updPassword(AccountNumberDO accountNumberDO) {
        accountNumberDOMapper.updPassword(accountNumberDO);
    }
}
