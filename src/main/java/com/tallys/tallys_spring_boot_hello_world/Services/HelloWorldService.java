package com.tallys.tallys_spring_boot_hello_world.Services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String helloWorld(String name) {
        return "Hello World 2.0 " + name;
    }
}
