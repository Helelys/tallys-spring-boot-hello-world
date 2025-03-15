package com.tallys.tallys_spring_boot_hello_world.Controller;

import com.tallys.tallys_spring_boot_hello_world.Domain.User;
import com.tallys.tallys_spring_boot_hello_world.Services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloworld() {
        return helloWorldService.helloWorld("Tallys");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "Nenhum") String filter, @RequestBody User body) {
        return "Hello World Post " + body.getName() + id;
    }
}
