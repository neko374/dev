package com.example.web22.services.impl;

import com.example.web22.UsersDO;
import com.example.web22.UsersDOExample;
import com.example.web22.dao.UsersDOMapper;
import com.example.web22.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicelmpl implements UserService {
    @Autowired(required=false)
    private UsersDOMapper usersDOMapper;
    @Override
    public List<UsersDO> list(){
        UsersDOExample usersDOExample = new UsersDOExample();
        return usersDOMapper.selectByExample(usersDOExample);
    }

    @Override
    public void insert(UsersDO users) {
        usersDOMapper.insert(users);
    }

    @Override
    public void del(Integer id) {
        usersDOMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void upd(UsersDO user) {
        usersDOMapper.updatePoint(user);
    }

    @Override
    public UsersDO login(UsersDO user) {
        UsersDOExample usersDOExample = new UsersDOExample();
        UsersDOExample.Criteria criteria = usersDOExample.createCriteria();
        criteria.andUnameEqualTo(user.getUname());
        criteria.andPwdEqualTo(user.getPwd());
        List<UsersDO> list = usersDOMapper.selectByExample(usersDOExample);
        if (list.size()>0){
            return list.get(0);
        }
        return null;
    }

    @Override
    public boolean getName(String name) {
        UsersDOExample usersDOExample = new UsersDOExample();
        UsersDOExample.Criteria criteria = usersDOExample.createCriteria();
        criteria.andUnameEqualTo(name);
        List<UsersDO> list = usersDOMapper.selectByExample(usersDOExample);
        if (list.size()>0){
            return true;
//            true存在，false不存在
        }
        return false;
    }
}
