package com.github.specht.bookstoreclient.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

@Service
public class BookService {

    @Value("${bookstore-server-ip}")
    private String bookstoreIp;

    @HystrixCommand(fallbackMethod = "reliable")
    public List<String> readingList() {

        final RestTemplate restTemplate = new RestTemplate();
        final URI uri = URI.create(bookstoreIp + ":8080/recommended");

        return restTemplate.getForObject(uri, List.class);
    }

    public List<String> reliable() {
        return Arrays.asList("Cloud Native Java (O'Reilly)");
    }

}
