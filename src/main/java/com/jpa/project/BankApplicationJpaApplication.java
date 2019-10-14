package com.jpa.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class BankApplicationJpaApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BankApplicationJpaApplication.class);
    }
	
	
	public static void main(String[] args) {
		SpringApplication.run(BankApplicationJpaApplication.class, args);
	}

	
}
