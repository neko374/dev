package com.example.web22.controller;

import com.example.web22.DwyqsdDo;
import com.example.web22.services.DwyqsdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dwyqsd")
@CrossOrigin
public class DwyqsdController<list> {
    @Autowired(required = false)
    private DwyqsdService dwyqsdService;

    @GetMapping("/list")
    public List<DwyqsdDo> list(){
        return dwyqsdService.list();
    }

    @PostMapping("/add")
    public String add(@RequestBody DwyqsdDo dwyqsdDo){
        try{
            dwyqsdService.insert(dwyqsdDo);
            return "addok";
        }catch (Exception d){
            return "addfail";
        }
    }
}
