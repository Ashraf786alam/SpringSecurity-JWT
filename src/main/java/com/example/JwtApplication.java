package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtApplication {

	public static void main(String[] args) {
		
		System.out.println("JWT");
		SpringApplication.run(JwtApplication.class, args);
	}

}
