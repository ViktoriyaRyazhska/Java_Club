package com.team4.Controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {
    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello_world";
    }
}
