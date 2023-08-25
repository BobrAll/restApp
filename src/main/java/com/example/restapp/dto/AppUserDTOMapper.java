package com.example.restapp.dto;

import com.example.restapp.entity.AppUser;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class AppUserDTOMapper implements Function<AppUser, AppUserDTO> {
    @Override
    public AppUserDTO apply(AppUser appUser) {
        return new AppUserDTO(
                appUser.getId(),
                appUser.getFirstName(),
                appUser.getLastName()
        );
    }
}
