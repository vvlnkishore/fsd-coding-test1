package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class CodingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingApplication.class, args);
	}

}
