package wy.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import wy.ssm.pojo.User;
import wy.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class user {
    @Autowired
    UserService userService;
    @RequestMapping("/login")
    public void select( String name, String password) {
        User user=userService.selectByName(name);
        if (user.getName().equals(name)&&user.getPassword().equals(password)) {
            System.out.println("成功");
        }
        System.out.println("失败");
    }
}
