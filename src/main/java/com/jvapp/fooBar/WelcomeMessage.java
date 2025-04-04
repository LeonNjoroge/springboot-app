package com.jvapp.fooBar;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {

    public String getWelcomeMessage(){
        return "Welcome to my Spring Boot application";
    }
}
