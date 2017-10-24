package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		System.err.println("1");
		System.err.println("2");
		SpringApplication.run(DemoApplication.class, args);
	}
}
