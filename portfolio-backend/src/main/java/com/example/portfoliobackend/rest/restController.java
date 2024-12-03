package com.example.portfoliobackend.rest;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class restController {

    @GetMapping("/hello")
    public String findAll() {
        return "Hello world";
    }

}














