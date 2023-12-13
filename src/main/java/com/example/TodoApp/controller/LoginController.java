package com.example.TodoApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class LoginController {

    @Override
    @GetMapping
    public String toString() {
        return "Welcome to TODO App";
    }
    
    
}
