package com.github.specht.eventpublisher.event;

import org.springframework.context.ApplicationEvent;

public class PrintEvent extends ApplicationEvent {

    private final String message;

    public PrintEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
