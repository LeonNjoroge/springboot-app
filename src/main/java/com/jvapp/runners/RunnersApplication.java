package com.jvapp.runners;

import com.jvapp.runners.run.Location;
import com.jvapp.runners.run.Run;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Main springboot entry file
 */

@SpringBootApplication
public class RunnersApplication {
	private static final Logger log = LoggerFactory.getLogger(RunnersApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(RunnersApplication.class, args);
	}
	@Bean
	CommandLineRunner  runner(){
		return args -> {
			Run run = new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 3, Location.OUTDOOR);
			log.info("Run: " + run);
		};
	}
}
