package com.thoughtworks.capability.gtb.alice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        String url = "http://bob:8081/hello";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForEntity(url,String.class);
    }
}
