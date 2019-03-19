package com.ha.demo.controller;

import com.ha.demo.entity.User;
import com.ha.demo.service.impl.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/info")
    public String toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        model.addAttribute("user",user);
        return "register";
    }
    @RequestMapping("/addUser")
    @ResponseBody
    public boolean addUser(@ModelAttribute(value = "user") User user, Model model){
        User userTmp=new User(user.getUserName(),user.getPassword(),user.getAge());
        boolean b = this.userService.addUser(userTmp);
       return  b;
    }
    @RequestMapping("/allUser")
    public String getAllUser(HttpServletRequest request, Model model){
        List<User> userList=this.userService.allUser();
        model.addAttribute("userList",userList);
        return "allUser";
    }
}
