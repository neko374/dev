package com.example.web22.services.impl;

import com.example.web22.ZbxxglDo;
import com.example.web22.ZbxxglDoExample;
import com.example.web22.dao.ZbxxglDoMapper;
import com.example.web22.services.ZbxxglService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZbxxglServiceImpl implements ZbxxglService {

    @Autowired(required = false)
    private ZbxxglDoMapper zbxxglDoMapper;

    @Override
    public List<ZbxxglDo> list() {
        ZbxxglDoExample zbxxglDoExample = new ZbxxglDoExample();
        return zbxxglDoMapper.selectByExample(zbxxglDoExample);
    }

    @Override
    public void insert(ZbxxglDo zbxxglDo) {
        zbxxglDoMapper.insert(zbxxglDo);
    }

    @Override
    public void upd(ZbxxglDo zbxxglDo) {
        zbxxglDoMapper.updateByPrimaryKey(zbxxglDo);

    }
}
