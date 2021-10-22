package com.example.web22.controller;

import com.example.web22.ZbxxglDo;
import com.example.web22.services.ZbxxglService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zbxxgl")
@CrossOrigin
public class ZbxxglController {

    @Autowired(required = false)
    private ZbxxglService zbxxglService;

    @GetMapping("/list")
    public List<ZbxxglDo> list(){
        return zbxxglService.list();
    }

    @PostMapping("/add")
    public String add(@RequestBody ZbxxglDo zbxxglDo){
        try{
            zbxxglService.insert(zbxxglDo);
            return "addok";
        }catch (Exception d){
            return "addfail";
        }
    }

    @PutMapping("/upd")
    public String upd(@RequestBody ZbxxglDo zbxxglDo){
        try{
            zbxxglService.upd(zbxxglDo);
            return "updok";
        }catch (Exception d){
            return "updfail";
        }
    }
}
