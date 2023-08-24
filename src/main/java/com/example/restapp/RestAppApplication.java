package com.example.restapp;

import com.example.restapp.entity.AppUser;
import com.example.restapp.repository.AppUserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RestAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(RestAppApplication.class, args);
		AppUserRepository repository = context.getBean(AppUserRepository.class);
		repository.save(new AppUser("Alexander", "Bobrus"));
		repository.save(new AppUser("Svetlana", "Bobrus"));
		repository.save(new AppUser("Alexander", "Koshevoi"));
	}

}
