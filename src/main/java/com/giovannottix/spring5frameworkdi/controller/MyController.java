package com.giovannottix.spring5frameworkdi.controller;

import com.giovannottix.spring5frameworkdi.service.IGreetingService;
import org.springframework.stereotype.Component;
import org.springframework.util.IdGenerator;

@Component
public class MyController {

    private final IGreetingService greetingService;

    public MyController(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
