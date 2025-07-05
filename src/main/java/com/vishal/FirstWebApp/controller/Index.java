package com.vishal.FirstWebApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@RestController
public class Index {
    @RequestMapping("/about")
    String about(){
        return "This is the about page of our application";
    }

    @GetMapping("/")
    public String Home()
    {
        return "Hi all this is the home page !! ";
    }
}
