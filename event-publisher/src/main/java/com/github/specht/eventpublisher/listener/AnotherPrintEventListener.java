package com.github.specht.eventpublisher.listener;

import com.github.specht.eventpublisher.event.PrintEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AnotherPrintEventListener implements ApplicationListener<PrintEvent> {

    @Override
    public void onApplicationEvent(PrintEvent event) {
        System.out.println("Received print event with message: " + event.getMessage());
    }
}
