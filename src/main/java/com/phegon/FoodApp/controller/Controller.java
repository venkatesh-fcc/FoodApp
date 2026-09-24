package com.phegon.FoodApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
    @GetMapping("/hi")
    public String hi() {
        return "Hi World";
    }
}
