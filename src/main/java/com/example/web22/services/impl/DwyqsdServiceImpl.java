package com.example.web22.services.impl;

import com.example.web22.DwyqsdDo;
import com.example.web22.DwyqsdDoExample;
import com.example.web22.dao.DwyqsdDoMapper;
import com.example.web22.services.DwyqsdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DwyqsdServiceImpl implements DwyqsdService {
    @Autowired(required = false)
    private DwyqsdDoMapper dwyqsdDoMapper;

    @Override
    public List<DwyqsdDo> list() {
        DwyqsdDoExample dwyqsdDoExample = new DwyqsdDoExample();
        return dwyqsdDoMapper.selectByExample(dwyqsdDoExample);
    }

    @Override
    public void insert(DwyqsdDo dwyqsdDo) {
        dwyqsdDoMapper.insert(dwyqsdDo);
    }
}
