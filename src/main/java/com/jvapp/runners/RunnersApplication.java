package com.jvapp.runners;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jvapp.fooBar.WelcomeMessage;

@SpringBootApplication
public class RunnersApplication {

	public static void main(String[] args) {
		SpringApplication.run(RunnersApplication.class, args);

		var welcomeMessage = new WelcomeMessage();

		System.out.println(welcomeMessage.getWelcomeMessage());
	}

}
