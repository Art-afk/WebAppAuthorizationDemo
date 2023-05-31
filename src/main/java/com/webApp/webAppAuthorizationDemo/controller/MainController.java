package com.webApp.webAppAuthorizationDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping(value = "/hello")
    public String hello(){
        return "<h2> hey hello work!</h2>";
    }

    @GetMapping(value = "/user")
    public String user(){
        return "<h2> hey user work!</h2>";
    }

    @GetMapping(value = "admin")
    public String admin(){
        return "<h2> hey admin work!</h2>";
    }
}
