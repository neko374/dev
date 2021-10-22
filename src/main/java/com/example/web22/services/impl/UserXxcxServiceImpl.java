package com.example.web22.services.impl;

import com.example.web22.UserXxcxDo;
import com.example.web22.UserXxcxDoExample;
import com.example.web22.dao.UserXxcxDoMapper;
import com.example.web22.services.UserXxcxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserXxcxServiceImpl implements UserXxcxService {

    @Autowired(required = false)
    private UserXxcxDoMapper userXxcxDoMapper;
    @Override
    public List<UserXxcxDo> list() {
        UserXxcxDoExample userXxcxDoExample = new UserXxcxDoExample();
        return userXxcxDoMapper.selectByExample(userXxcxDoExample);
    }

    @Override
    public UserXxcxDo selectByPrimaryKey(Integer id) {
        return userXxcxDoMapper.selectByPrimaryKey(id);
    }
}
