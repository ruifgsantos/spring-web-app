package com.example.springwebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDockerRestController {

    @GetMapping("/home/message")
    public String index() {
        return "Hello from Docker!";
    }
}
