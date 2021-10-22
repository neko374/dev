package com.example.web22.controller;

import com.example.web22.ArmyTreeDO;
import com.example.web22.services.ArmyTreeService;
import com.example.web22.utils.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/armytree")
@CrossOrigin
public class ArmyTreeController {
    @Autowired
    private ArmyTreeService armyTreeService;
    @GetMapping("/list")
    public ResultMsg list(){
        List<ArmyTreeDO> list = armyTreeService.list();
        return new ResultMsg(0,"目录已显示",list);
    }
}
