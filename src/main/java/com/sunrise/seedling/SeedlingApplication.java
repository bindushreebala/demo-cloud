package com.sunrise.seedling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.map.repository.config.EnableMapRepositories;

@SpringBootApplication
@EnableMapRepositories
public class SeedlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeedlingApplication.class, args);
	}

}
