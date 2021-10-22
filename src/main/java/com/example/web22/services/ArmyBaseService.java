package com.example.web22.services;

import com.example.web22.ArmyBaseDO;

import java.util.List;

public interface ArmyBaseService {
    public ArmyBaseDO login(ArmyBaseDO army);
    //编号查信息
    public ArmyBaseDO queryById(Integer id);
    List<ArmyBaseDO> list();
    public void insert(ArmyBaseDO armyBaseDO);
    public void del(Integer armyid);
    public void updPassword(ArmyBaseDO armyBaseDO);
    public void updInfo(ArmyBaseDO armyBaseDO);
    public void updateByPrimaryKey(ArmyBaseDO armyBaseDO);
}
