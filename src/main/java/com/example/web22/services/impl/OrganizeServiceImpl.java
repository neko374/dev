package com.example.web22.services.impl;

import com.example.web22.OrganizeDo;
import com.example.web22.OrganizeDoExample;
import com.example.web22.dao.OrganizeDoMapper;
import com.example.web22.services.OrganizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizeServiceImpl implements OrganizeService {

    @Autowired(required = false)
    private OrganizeDoMapper organizeDoMapper;

    @Override
    public List<OrganizeDo> list() {
        OrganizeDoExample organizeDoExample = new OrganizeDoExample();
        return organizeDoMapper.selectByExample(organizeDoExample);
    }

    @Override
    public void insert(OrganizeDo organizeDo) {
        organizeDoMapper.insert(organizeDo);
    }

    @Override
    public void del(Integer id) {
        organizeDoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void upd(OrganizeDo organizeDo) {
        organizeDoMapper.updateInfo(organizeDo);
    }
}
