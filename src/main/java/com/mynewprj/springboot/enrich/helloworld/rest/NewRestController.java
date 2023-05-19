package com.mynewprj.springboot.enrich.helloworld.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewRestController {
    // out "Hello World"

    @GetMapping( "/" )
    public String sayHello(){
        return "Hello World!";
    }
}
