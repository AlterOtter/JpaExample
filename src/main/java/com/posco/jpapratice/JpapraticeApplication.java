package com.posco.jpapratice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JpapraticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpapraticeApplication.class, args);
	}

	@GetMapping("/health")
	public String checkHealth(){
		return "health";
	}

}
