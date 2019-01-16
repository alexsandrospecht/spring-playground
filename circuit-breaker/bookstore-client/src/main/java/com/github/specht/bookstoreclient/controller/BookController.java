package com.github.specht.bookstoreclient.controller;

import com.github.specht.bookstoreclient.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableCircuitBreaker
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/to-read")
    public List<String> readingList() {
        return bookService.readingList();
    }

}

