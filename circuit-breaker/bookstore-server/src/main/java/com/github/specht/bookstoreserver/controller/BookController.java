package com.github.specht.bookstoreserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @GetMapping(value = "/recommended")
    public List<String> readingList(){
        return Arrays.asList("Spring in Action (Manning)", "Cloud Native Java (O'Reilly)", "Learning Spring Boot (Packt)");
    }

}
