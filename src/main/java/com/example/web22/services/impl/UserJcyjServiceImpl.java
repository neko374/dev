package com.example.web22.services.impl;

import com.example.web22.UserJcyjDo;
import com.example.web22.UserJcyjDoExample;
import com.example.web22.dao.UserJcyjDoMapper;
import com.example.web22.services.UserJcyjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserJcyjServiceImpl implements UserJcyjService {

    @Autowired(required = false)
    private UserJcyjDoMapper userJcyjDoMapper;
    @Override

    public List<UserJcyjDo> list() {
        UserJcyjDoExample userJcyjDoExample = new UserJcyjDoExample();
        return userJcyjDoMapper.selectByExample(userJcyjDoExample);
    }
}
