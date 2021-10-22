package com.example.web22.services;

import com.example.web22.TabYlglDo;

import java.util.List;

public interface TabYlglService {
    public List<TabYlglDo> list();
    public void insert(TabYlglDo record);
    public void del(Integer id);
    public void upd(TabYlglDo tabYlglDo);
    public TabYlglDo selectByPrimaryKey(Integer id);
}
