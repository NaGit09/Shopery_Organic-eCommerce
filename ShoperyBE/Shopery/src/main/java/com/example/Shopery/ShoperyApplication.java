package com.example.Shopery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ShoperyApplication {
	@GetMapping
	public String hello() {
		return "Hello World";
	}
	public static void main(String[] args) {
		SpringApplication.run(ShoperyApplication.class, args);
	}

}
