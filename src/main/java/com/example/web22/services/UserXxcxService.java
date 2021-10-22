package com.example.web22.services;


import com.example.web22.UserXxcxDo;

import java.util.List;

public interface UserXxcxService {

    public List<UserXxcxDo> list();

    public UserXxcxDo selectByPrimaryKey(Integer id);
}
