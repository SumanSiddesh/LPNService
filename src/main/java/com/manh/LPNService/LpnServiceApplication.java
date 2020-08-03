package com.manh.LPNService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.manh.service", "com.manh.controller"})
@EntityScan( basePackages = {"com.manh.entity"})
@EnableJpaRepositories("com.manh.repository")
public class LpnServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LpnServiceApplication.class, args);
	}

}
