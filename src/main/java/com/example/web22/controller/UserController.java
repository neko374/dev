package com.example.web22.controller;

import com.example.web22.UsersDO;
import com.example.web22.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/list")
    public List<UsersDO> list(){
        return userService.list();
    }
    @PostMapping("/add")
    public String add(@RequestBody UsersDO user){
        try{
            userService.insert(user);
            return "添加成功啦";
        }catch (Exception d){
            return "添加失败了";
        }
    }
    @DeleteMapping("/del")
    public String del(Integer id){
        try{
            userService.del(id);
            return "删掉";
        }catch (Exception d){
            return "删不掉!!!";
        }
    }
    @PutMapping("/upd")
    public String upd(@RequestBody UsersDO user){
        try{
            userService.upd(user);
            return "更新成功";
        }catch (Exception d){
            return "更新失败";
        }
    }
    @PostMapping("/login")
    public String login(@RequestBody UsersDO user){
        UsersDO users = userService.login(user);
        if (users!=null){
            return "登录成功";
        }else{
            return "登录失败";
        }
    }
    @GetMapping("/getname")
    public String getName(String uname){
        boolean flag = userService.getName(uname);
        if (!flag){
            return "不存在";
        }else{
            return "已经有了";
        }
    }
}
