package com.example.web22.controller;

import com.example.web22.ArmyAbilityDO;
import com.example.web22.services.ArmyAbilityService;
import com.example.web22.utils.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    @RequestMapping("/armyability")
    @CrossOrigin
    public class ArmyAbilityController {
        @Autowired(required=false)
        private ArmyAbilityService armyAbilityService;
        @GetMapping("/list")
        public ResultMsg list(){
            List<ArmyAbilityDO> list = armyAbilityService.list();
            return new ResultMsg(0,"显示成功",list);
        }
    }
