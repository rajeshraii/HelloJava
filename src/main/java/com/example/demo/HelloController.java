package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello java";
    }

    @GetMapping("/text")
    public String text() {
        return "welcome to java programming";
    }

}
