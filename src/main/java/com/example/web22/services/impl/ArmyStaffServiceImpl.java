package com.example.web22.services.impl;

import com.example.web22.ArmyStaffDO;
import com.example.web22.dao.ArmyStaffDOMapper;
import com.example.web22.services.ArmyStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmyStaffServiceImpl implements ArmyStaffService {
    @Autowired(required = false)
    private ArmyStaffDOMapper armyStaffDOMapper;

    @Override
    public List<ArmyStaffDO> list() {
        return armyStaffDOMapper.list();
    }

    @Override
    public List<ArmyStaffDO> listAllByAreaId(String[] ids) {
        return armyStaffDOMapper.listByAreaId(ids);
    }

    @Override
    public void insert(ArmyStaffDO armyStaffDO) {
        armyStaffDOMapper.insert(armyStaffDO);
    }

    @Override
    public void del(Integer staffid) {
        armyStaffDOMapper.deleteByPrimaryKey(staffid);
    }

    @Override
    public void upd(ArmyStaffDO armyStaffDO) {
        armyStaffDOMapper.updateByPrimaryKey(armyStaffDO);
    }
}
