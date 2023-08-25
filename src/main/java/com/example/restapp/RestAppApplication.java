package com.example.restapp;

import com.example.restapp.entity.AppUser;
import com.example.restapp.service.AppUserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RestAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(RestAppApplication.class, args);
		AppUserService appUserService = context.getBean(AppUserService.class);

		appUserService.save(new AppUser("example1@mail.ru",  "Alexander", "Bobrus"));
		appUserService.save(new AppUser("example2@mail.ru", "Svetlana", "Bobrus"));
		appUserService.save(new AppUser("example3@mail.ru", "Alexander", "Koshevoi"));
	}

}
