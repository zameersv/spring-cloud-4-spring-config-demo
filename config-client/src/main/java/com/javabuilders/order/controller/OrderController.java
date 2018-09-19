package com.javabuilders.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    //@Value("${config-client.hello}")
    private String hello;

    @GetMapping("/hello")
    public String getGreeting() throws InterruptedException {
        return hello;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}

