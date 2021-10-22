package com.example.web22.controller;

import com.example.web22.TabYlglDo;
import com.example.web22.UserXxcxDo;
import com.example.web22.services.UserXxcxService;
import com.example.web22.utils.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/xxcx")
@CrossOrigin
public class UserXxcxController {

    @Autowired(required = false)
    private UserXxcxService userXxcxService;

    @GetMapping("/list")
    public List<UserXxcxDo> list(){

        return userXxcxService.list();
    }

    @GetMapping("/one")
    public ResultMsg selectByPrimaryKey(Integer id){
        UserXxcxDo userXxcxDo = userXxcxService.selectByPrimaryKey(id);
        return new ResultMsg(0,"查询成功",userXxcxDo);
    }
}
