package cn.springboot.controller;

import cn.springboot.pojo.entity.User;
import cn.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/hello")
public class UserController {
    @Autowired
    private UserService userService;
    @ResponseBody
    @GetMapping("say")
    public List<User> say(){
        return userService.getUserList();
    }
}
