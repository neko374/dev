package com.example.web22.services.impl;

import com.example.web22.ArmyBaseDO;
import com.example.web22.ArmyBaseDOExample;
import com.example.web22.dao.ArmyBaseDOMapper;
import com.example.web22.services.ArmyBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmyBaseServiceImpl implements ArmyBaseService {
    @Autowired(required=false)
    private ArmyBaseDOMapper armyBaseDOMapper;
    @Override
    public ArmyBaseDO login(ArmyBaseDO army) {
        ArmyBaseDOExample armyBaseDOExample = new ArmyBaseDOExample();
        ArmyBaseDOExample.Criteria criteria=armyBaseDOExample.createCriteria();
        criteria.andArmyloginnameEqualTo(army.getArmyloginname());
        criteria.andLoginpwdEqualTo(army.getLoginpwd());
        List<ArmyBaseDO> list = armyBaseDOMapper.selectByExample(armyBaseDOExample);
        if (list!=null&&list.size()>0){
            return list.get(0);
        }
        return null;
    }

    @Override
    public ArmyBaseDO queryById(Integer id) {
        return armyBaseDOMapper.queryBaseInfo(id);
    }

    @Override
    public List<ArmyBaseDO> list() {
        return armyBaseDOMapper.listAllInfo(0);
    }

    @Override
    public void insert(ArmyBaseDO armyBaseDO) {
        armyBaseDOMapper.insert(armyBaseDO);
    }

    @Override
    public void del(Integer armyid) {
        armyBaseDOMapper.deleteByPrimaryKey(armyid);
    }

    @Override
    public void updPassword(ArmyBaseDO armyBaseDO) {
        armyBaseDOMapper.updPassword(armyBaseDO);
    }

    @Override
    public void updInfo(ArmyBaseDO armyBaseDO) {
        armyBaseDOMapper.updInfo(armyBaseDO);
    }

    @Override
    public void updateByPrimaryKey(ArmyBaseDO armyBaseDO) {
        armyBaseDOMapper.updateByPrimaryKey(armyBaseDO);
    }
}
