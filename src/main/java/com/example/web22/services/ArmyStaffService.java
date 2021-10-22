package com.example.web22.services;

import com.example.web22.ArmyStaffDO;

import java.util.List;

public interface ArmyStaffService {
    List<ArmyStaffDO> list();
    List<ArmyStaffDO> listAllByAreaId(String[] ids);
    public void insert(ArmyStaffDO armyStaffDO);
    public void del(Integer staffid);
    public void upd(ArmyStaffDO armyStaffDO);
}
