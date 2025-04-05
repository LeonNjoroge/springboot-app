package com.jvapp.runners;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main springboot entry file
 */

@SpringBootApplication
public class RunnersApplication {

	public static void main(String[] args) {
		SpringApplication.run(RunnersApplication.class, args);
		System.out.println("I am active");
	}
}
