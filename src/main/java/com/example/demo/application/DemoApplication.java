package com.example.demo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@SpringBootConfiguration
@ComponentScan({"com.example.demo.controllers",
		"com.example.demo.models",
		"com.example.demo.service"})
@EnableMongoRepositories({"com.example.demo.repository"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
