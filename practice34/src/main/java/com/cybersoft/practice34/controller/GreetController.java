package com.cybersoft.practice34.controller;

import com.cybersoft.practice34.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping
    public ResponseEntity<?> getGreet(@RequestParam String name) {


        return ResponseEntity.ok(greetingService.sayHello(name));
    }
}
