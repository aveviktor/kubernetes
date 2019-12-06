package com.example.mygcpproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    String index() {
        return "Main page";
    }

    @RequestMapping("/home")
    String home() {
        return "Hello user, it is the home page";
    }
}
