package com.zj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerTest2 {

    @GetMapping("/hello")
    public String gethello(Model model){
        model.addAttribute("msg","afdasdfdsadfas");
        return "hello";
    }

    @GetMapping("/t1")
    public String getName(@RequestParam("name") String name, Model model){
        model.addAttribute("msg",name);
        return "hello";
    }
}
