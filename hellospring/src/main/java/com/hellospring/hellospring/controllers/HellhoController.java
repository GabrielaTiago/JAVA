package com.hellospring.hellospring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HellhoController {

    @GetMapping
    public String helloSpring() {
        return "Heelho World!!! This time with Spring";
    }
}
