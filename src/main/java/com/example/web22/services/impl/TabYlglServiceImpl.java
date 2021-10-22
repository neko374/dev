package com.example.web22.services.impl;

import com.example.web22.TabYlglDo;
import com.example.web22.TabYlglDoExample;
import com.example.web22.dao.TabYlglDoMapper;
import com.example.web22.services.TabYlglService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TabYlglServiceImpl implements TabYlglService {
    @Autowired(required = false)
    private TabYlglDoMapper tabYlglDoMapper;

    @Override
    public List<TabYlglDo> list() {
        TabYlglDoExample tabYlglDoExample = new TabYlglDoExample();
        return tabYlglDoMapper.selectByExample(tabYlglDoExample);
    }

    @Override
    public void insert(TabYlglDo record) {
        tabYlglDoMapper.insert(record);
    }

    @Override
    public void del(Integer id) {
        tabYlglDoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void upd(TabYlglDo tabYlglDo) {
        tabYlglDoMapper.updateInfo(tabYlglDo);
    }

    @Override
    public TabYlglDo selectByPrimaryKey(Integer id) {
        return tabYlglDoMapper.selectByPrimaryKey(id);
    }
}
