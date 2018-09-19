package com.javabuilders.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${config-client.greeting}")
    private String greeting;

    @Value("${config-client.url:default url from controller}")
    private String url;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @GetMapping("/greeting")
    public String getWelcomeMessage(){
        return greeting + ".  URL: " + url;
    }

}

