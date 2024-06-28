package com.learning.employeeservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope // this will force this spring bean to reload the configuration(trigger the refresh event to reload the configuration)
@RestController
public class MessageController {

    @Value("${spring.boot.message}")
    private String message;
    @GetMapping("/users/message")
    public String message() {
        return message;
    }
}
