package com.example.restapp.service;

import com.example.restapp.entity.AppUser;
import com.example.restapp.repository.AppUserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppUserService {
    private final AppUserRepository repository;

    public AppUserService(AppUserRepository repository) {
        this.repository = repository;
    }

    public Iterable<AppUser> findAll() {
        return repository.findAll();
    }

    public Optional<AppUser> findById(Long id) {
        return repository.findById(id);
    }

    public AppUser save(AppUser appUser) {
        return repository.save(appUser);
    }

    public AppUser update(AppUser appUser) {
        return repository.save( appUser);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
