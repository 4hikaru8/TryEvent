package com.tryevent.tryeve.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showHello(Model model) {
        model.addAttribute("title", "Hello World");
        model.addAttribute("message", "ようこそ、プログラミングの世界へ！！");
        return "hello";
    }
     
}
