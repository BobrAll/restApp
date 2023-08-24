package com.example.restapp.controller;

import com.example.restapp.entity.AppUser;
import com.example.restapp.service.AppUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class AppUserController {
    private final AppUserService appUserService;

    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping
    public List<AppUser> findAll() {
        return (List<AppUser>) appUserService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<AppUser> findById(@PathVariable("id") Long id) {
        return appUserService.findById(id);
    }

    //public
}