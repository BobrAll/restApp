package com.example.restapp.service;

import com.example.restapp.dto.AppUserDTO;
import com.example.restapp.dto.AppUserDTOMapper;
import com.example.restapp.entity.AppUser;
import com.example.restapp.repository.AppUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserService {
    private final AppUserRepository repository;
    private final AppUserDTOMapper appUserDTOMapper;

    public AppUserService(AppUserRepository repository, AppUserDTOMapper appUserDTOMapper) {
        this.repository = repository;
        this.appUserDTOMapper = appUserDTOMapper;
    }

    public List<AppUserDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(appUserDTOMapper)
                .toList();
    }

    public AppUserDTO findById(Long id) {
        return appUserDTOMapper.apply(repository.findById(id).get());
    }

    public AppUserDTO save(AppUser appUser) {
        return appUserDTOMapper.apply(repository.save(appUser));
    }

    public AppUserDTO update(AppUser appUser) {
        return appUserDTOMapper.apply(repository.save(appUser));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
