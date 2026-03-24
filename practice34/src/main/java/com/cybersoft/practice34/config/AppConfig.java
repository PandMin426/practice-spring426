package com.cybersoft.practice34.config;

import com.cybersoft.practice34.services.GreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public GreetingService greetingService(){
        return new GreetingService();
    }
}
