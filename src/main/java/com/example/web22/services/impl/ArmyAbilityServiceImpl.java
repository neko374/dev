package com.example.web22.services.impl;

import com.example.web22.ArmyAbilityDO;
import com.example.web22.ArmyAbilityDOExample;
import com.example.web22.dao.ArmyAbilityDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmyAbilityServiceImpl implements com.example.web22.services.ArmyAbilityService {
    @Autowired(required=false)
    private ArmyAbilityDOMapper armyAbilityDOMapper;
    @Override
    public List<ArmyAbilityDO> list(){
        ArmyAbilityDOExample armyAbilityDOExample = new ArmyAbilityDOExample();
        List<ArmyAbilityDO> list = armyAbilityDOMapper.selectByExample(armyAbilityDOExample);
        return list;
    }
}
