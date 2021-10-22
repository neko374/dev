package com.example.web22.services.impl;

import com.example.web22.ArmyTreeDO;
import com.example.web22.dao.ArmyTreeDOMapper;
import com.example.web22.services.ArmyTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmyTreeServiceImpl implements ArmyTreeService {
    @Autowired(required=false)
    private ArmyTreeDOMapper armyTreeDOMapper;
    @Override
    public List<ArmyTreeDO> list(){
        return armyTreeDOMapper.listAllInfo(0);
    }
}
