package net.engineeringdigest.journalApp.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping
    public String healthcheck(){
        return "OK";
    }
}
