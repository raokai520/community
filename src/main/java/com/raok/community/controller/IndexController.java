package com.raok.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @GetMapping("/index")
    public  String Index(@RequestParam String name, Model model){
        model.addAttribute("hello","hello");
        model.addAttribute("name",name);
        return "index";
    }



}
