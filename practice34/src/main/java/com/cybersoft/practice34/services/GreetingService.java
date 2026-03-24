package com.cybersoft.practice34.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String sayHello(String name){
        return "Hello " + name;
    }
}
