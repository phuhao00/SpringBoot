package com.ha.demo.controller;

import com.ha.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping("")
    public String toIndex(HttpServletRequest request, Model model){
        return "index";
    }
}
