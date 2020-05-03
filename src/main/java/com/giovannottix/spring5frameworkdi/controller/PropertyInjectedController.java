package com.giovannottix.spring5frameworkdi.controller;

import com.giovannottix.spring5frameworkdi.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Giovanni Esposito.
 *
 * @since : 05/02/20, Sat
 */
@Controller
public class PropertyInjectedController {

    /**
     * Least preferred.
     */
    @Autowired
    @Qualifier("greetingServiceProperty")
    public IGreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
