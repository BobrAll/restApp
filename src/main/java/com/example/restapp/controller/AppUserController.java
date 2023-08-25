package com.example.restapp.controller;

import com.example.restapp.dto.AppUserDTO;
import com.example.restapp.entity.AppUser;
import com.example.restapp.service.AppUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class AppUserController {
    private final AppUserService appUserService;

    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping
    public List<AppUserDTO> findAll() {
        return appUserService.findAll();
    }

    @GetMapping("/{id}")
    public AppUserDTO findById(@PathVariable("id") Long id) {
        return appUserService.findById(id);
    }

    @PostMapping
    public AppUserDTO add(@RequestBody AppUser appUser) {
        return appUserService.save(appUser);
    }

    @PutMapping
    public AppUserDTO update(@RequestBody AppUser appUser) {
        return appUserService.update(appUser);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        appUserService.delete(id);
    }

}
