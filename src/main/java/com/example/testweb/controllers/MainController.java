package com.example.testweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    
    @GetMapping("/main")
    public String main(@RequestParam(name="name", required = false, defaultValue = "John")
                                    String name, Model model){
        model.addAttribute("name", name);
        
        return "main";
    }
}
