package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan (basePackages = "com.bean")
@EnableJpaRepositories (basePackages = "com.repository")
public class OnlineQuizPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineQuizPortalApplication.class, args);
		System.out.println("Server ON");
	}

}