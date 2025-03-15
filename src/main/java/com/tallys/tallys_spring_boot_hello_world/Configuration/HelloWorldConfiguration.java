package com.tallys.tallys_spring_boot_hello_world.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld() {
        return "Hello World 3.0 ";
    }
}
