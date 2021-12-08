package com.github.jvanheesch.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @Value("${password}")
    private String password;

    @GetMapping
    public String get() {
        return password;
    }
}
