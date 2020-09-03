package com.udacity.jwdnd.c1.review.controller;

import com.udacity.jwdnd.c1.review.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Instant;

@Controller
public class HomeController {

    private MessageService messageService;



    @GetMapping("/home")
    public String getHomePage(Model model){
        model.addAttribute("greetings", new String[]{ "Hi", "Hello", "Goodbye"});
        return "home";
    }

//    @PostMapping
}
