package com.example.web22.services;

import com.example.web22.UsersDO;

import java.util.List;

public interface UserService {
    public List<UsersDO> list();
    public void insert(UsersDO users);
    public void del(Integer id);
    public void upd(UsersDO user);
    public UsersDO login(UsersDO user);
    public boolean getName(String name);
}
