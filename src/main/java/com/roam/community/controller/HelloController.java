package com.roam.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author roam
 * @date 2019/10/6 20:00
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String Hello(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}
