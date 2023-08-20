package com.example.testweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.testweb.models.User;
import com.example.testweb.repo.UserRepository;

@Controller
public class SecondController {
    
    @Autowired
    private UserRepository usrRepo;

    @GetMapping("/second")
    public String second(Model model){

        for(int i =0; i<30; i++){
        User user = new User();
        user.setName("Педик"+i);
        user.setAge(3000);
        usrRepo.save(user);    
        }

        Iterable<User> users = usrRepo.findAll();
        model.addAttribute("users", users);

      

        return "second";

    }
}
