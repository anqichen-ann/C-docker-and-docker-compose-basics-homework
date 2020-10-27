package com.thoughtworks.capability.gtb.bob.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BobController {

    @GetMapping("/hello")
    public String getHelloFromBob(){
        return "Hello from Bob!";
    }
}
