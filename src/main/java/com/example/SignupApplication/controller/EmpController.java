package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
    @GetMapping("/home")
    public String name(){
        String s ="Suraj";
        return s;
    }
}
