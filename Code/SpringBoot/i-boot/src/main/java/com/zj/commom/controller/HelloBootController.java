package com.zj.commom.controller;

import com.zj.commom.model.R;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloBootController {

    @GetMapping("/hello")
    @ResponseBody
    public R hello(){
       return R.ok("Hello SpringBoot");
    }
    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("hello","balabalabala");
        return "index";
    }
}
