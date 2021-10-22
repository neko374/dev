package com.example.web22.services;

import com.example.web22.OrganizeDo;

import java.util.List;

public interface OrganizeService {
    public List<OrganizeDo> list();
    public void insert(OrganizeDo organizeDo);
    public void del(Integer id);
    public void upd(OrganizeDo organizeDo);
}
