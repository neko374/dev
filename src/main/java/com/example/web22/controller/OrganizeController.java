package com.example.web22.controller;

import com.example.web22.OrganizeDo;
import com.example.web22.services.OrganizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userszu")
@CrossOrigin
public class OrganizeController<list> {

    @Autowired
    private OrganizeService organizeService;

    @GetMapping("/list")
    public List<OrganizeDo> list() {
        return organizeService.list();
    }

    @PostMapping("/add")
    public String add(@RequestBody OrganizeDo organize){
        try{
           organizeService.insert(organize);
           return "addok";
        }catch (Exception d){
            return "addfail";
        }
    }

    @DeleteMapping("/del")
    public String del(Integer id){
        if(id<3){
            return "只能删除大于3的编号";
        }
        try{
            organizeService.del(id);
            return "delok";
        }catch (Exception d){
            return "delfail";
        }
    }

    @PutMapping("/upd")
    public String upd(@RequestBody OrganizeDo organize){
        try{
            organizeService.upd(organize);
            return "updok";
        }catch (Exception d){
            return "updfail";
        }
    }
}
