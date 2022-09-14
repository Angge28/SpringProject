package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"biz.global77"})
@EnableJpaRepositories("biz.global77.repo")
@EntityScan("biz.global77.model")

public class SpringProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringProject1Application.class, args);
	}
	

}
