package com.bee.sample.helloworld.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {
    @RequestMapping("/say.html")
    public String say() {
        return "Hello Spring Boot";
    }
}
