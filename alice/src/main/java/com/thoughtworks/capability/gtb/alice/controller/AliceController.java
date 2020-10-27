package com.thoughtworks.capability.gtb.alice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AliceController {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    
    @GetMapping("/hello")
    public String getHello(){
        String url = "http://localhost:8081/hello";
        RestTemplate restTemplate = restTemplate();
        ResponseEntity<String> responseEntity = restTemplate
                .getForEntity(url,String.class);
        return responseEntity.getBody();
    }
}
