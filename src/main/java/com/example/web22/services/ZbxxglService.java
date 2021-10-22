package com.example.web22.services;

import com.example.web22.ZbxxglDo;

import java.util.List;

public interface ZbxxglService {

    public List<ZbxxglDo> list();
    public void insert(ZbxxglDo zbxxglDo);
    public void upd(ZbxxglDo zbxxglDo);
}
