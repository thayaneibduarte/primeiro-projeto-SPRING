package com.kipper.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping
    public String HelloWorld() {

        return "Essa é a minha primeira aplicação utilizando conceitos básicos de SPRING!";
    }
}

