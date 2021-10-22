package com.example.web22.controller;

import com.example.web22.ArmyBaseDO;
import com.example.web22.ArmyStaffDO;
import com.example.web22.services.ArmyStaffService;
import com.example.web22.utils.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/armystaff")
@CrossOrigin
public class ArmyStaffController {
    @Autowired
    private ArmyStaffService armyStaffService;
    @GetMapping("/listbyareaid")
    public ResultMsg listByAreaId(String ids){
        String[] sids = ids.split(",");
        List<ArmyStaffDO> list = armyStaffService.listAllByAreaId(sids);
        if (list!=null&&list.size()>0){
            return new ResultMsg(0,"显示成功",list);
        }else {
            return new ResultMsg(-1,"没有相关人员");
        }
    }
    @GetMapping("/list")
    public ResultMsg list(){
        List<ArmyStaffDO> list=armyStaffService.list();
        return new ResultMsg(0,"列表已显示",list);
    }
    @PostMapping("/add")
    public String add(@RequestBody ArmyStaffDO armyStaffDO){
        try {
            armyStaffService.insert(armyStaffDO);
            return "addok";
        }catch(Exception d){
            return "addfail";
        }
    }
    @DeleteMapping("/del")
    public String del(Integer staffid){
        try{
            armyStaffService.del(staffid);
            return "delok";
        }catch (Exception d){
            return "delfail";
        }
    }
    @PutMapping("/upd")
    public String upd(@RequestBody ArmyStaffDO armyStaffDO){
        try {
            armyStaffService.upd(armyStaffDO);
            return "updok";
        }catch (Exception d){
            return "updfail";
        }
    }
}
