package com.github.specht.eventpublisher.controller;

import com.github.specht.eventpublisher.event.PrintEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @Autowired
    private ApplicationEventPublisher publisher;

    @PostMapping("/print")
    public void publishMessage(@RequestBody String message) {

        final PrintEvent event = new PrintEvent(this, message);
        publisher.publishEvent(event);
    }

}
