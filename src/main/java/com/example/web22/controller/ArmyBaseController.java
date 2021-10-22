package com.example.web22.controller;

import com.example.web22.ArmyBaseDO;
import com.example.web22.services.impl.ArmyBaseServiceImpl;
import com.example.web22.utils.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/armybase")
@CrossOrigin
public class ArmyBaseController {
    @Autowired
    private ArmyBaseServiceImpl armyBaseService;
    @PostMapping ("/login")
    public ResultMsg login(@RequestBody ArmyBaseDO armyBaseDO){
        ArmyBaseDO army1 = armyBaseService.login(armyBaseDO);
        if (army1!=null){
            return new ResultMsg(0,"登录成功",army1);
        }else {
            return new ResultMsg(1,"登录失败");
        }
    }

    @GetMapping("/one")
    public ResultMsg queryById(Integer id){
        ArmyBaseDO armyBaseDO = armyBaseService.queryById(id);
        return new ResultMsg(0,"显示一条基本能力",armyBaseDO);
    }

    @GetMapping("/list")
    public ResultMsg list(){
        List<ArmyBaseDO> list=armyBaseService.list();
        return new ResultMsg(0,"列表已显示",list);
    }

    //添加
    @PostMapping("/add")
    public String add(@RequestBody ArmyBaseDO armyBaseDO){
        try{
            armyBaseService.insert(armyBaseDO);
            return "addok";
        }catch (Exception d){
            return "addfail";
        }
    }

    //改密码
    @PutMapping ("/upd")
    public String upd(@RequestBody ArmyBaseDO armyBaseDO){
        System.out.println("user"+armyBaseDO);
        try{
            armyBaseService.updPassword(armyBaseDO);
            return "修改成功";
        }catch (Exception d){
            return "修改失败";
        }
    }

    //改参数
    @PutMapping ("/updInfo")
    public String updInfo(@RequestBody ArmyBaseDO armyBaseDO){
        System.out.println("user"+armyBaseDO);
        try{
            armyBaseService.updInfo(armyBaseDO);
            return "修改成功";
        }catch (Exception d){
            return "修改失败";
        }
    }

    //改全部
    @PutMapping ("/updAll")
    public String updateByPrimaryKey(@RequestBody ArmyBaseDO armyBaseDO){
        System.out.println("user"+armyBaseDO);
        try{
            armyBaseService.updateByPrimaryKey(armyBaseDO);
            return "修改成功";
        }catch (Exception d){
            return "修改失败";
        }
    }

    @DeleteMapping("/del")
    public String del(Integer armyid){
        try{
            armyBaseService.del(armyid);
            return "delok";
        }catch (Exception d){
            return "delfail";
        }
    }
}
