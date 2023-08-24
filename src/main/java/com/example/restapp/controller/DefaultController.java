package com.example.restapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    @GetMapping("/hello")
    String hello(@RequestParam(value = "name", required = false, defaultValue = "user") String name) {
        return "Hello, " + name;
    }
}
