package com.giovannottix.spring5frameworkdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by Giovanni Esposito.
 *
 * @since : 05/02/20, Sat
 */
@Primary
@Service
public class GreetingServicePrimary implements IGreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - From the Primary Bean";
    }
}
