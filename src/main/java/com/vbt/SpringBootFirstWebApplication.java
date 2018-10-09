package com.vbt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.vbt")
public class SpringBootFirstWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFirstWebApplication.class, args);
	}
}

// Basic Spring Security to validate username and password.
// using inMemoryAuthentication & USER /ROLES
// dummy & dummy to login success
// Then we do todo examples 