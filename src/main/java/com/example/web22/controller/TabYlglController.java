package com.example.web22.controller;


import com.example.web22.TabYlglDo;
import com.example.web22.services.TabYlglService;
import com.example.web22.utils.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/xlgl")
@CrossOrigin
public class TabYlglController {

    @Autowired(required = false)
    private TabYlglService tabYlglService;

    @GetMapping("/list")
    public List<TabYlglDo> list(){
        return tabYlglService.list();
    }

    @PostMapping("/add")
    public String add(@RequestBody TabYlglDo record){
        try{
            tabYlglService.insert(record);
            return "addok";
        }catch (Exception d){
            return "addfail";
        }
    }

    @DeleteMapping("/del")
    public String del(Integer id){
        if(id<2){
            return "只能删除大于1的编号";
        }
        try{
            tabYlglService.del(id);
            return "delok";
        }catch (Exception d){
            return "delfail";
        }
    }

    @PutMapping("/upd")
    public String upd(@RequestBody TabYlglDo tabylgl){
        try{
            tabYlglService.upd(tabylgl);
            return "updok";
        }catch (Exception d){
            return "updfail";
        }
    }

    @GetMapping("/one")
    public ResultMsg selectByPrimaryKey(Integer id){
        TabYlglDo tabYlglDo = tabYlglService.selectByPrimaryKey(id);
        return new ResultMsg(0,"查询成功",tabYlglDo);
    }
}
