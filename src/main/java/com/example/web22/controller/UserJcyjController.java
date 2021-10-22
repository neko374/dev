package com.example.web22.controller;


import com.example.web22.UserJcyjDo;
import com.example.web22.services.UserJcyjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jcyj")
@CrossOrigin
public class UserJcyjController {

    @Autowired(required = false)
    private UserJcyjService userJcyjService;

    @GetMapping("list")
    public List<UserJcyjDo> list(){
        return userJcyjService.list();
    }
}
