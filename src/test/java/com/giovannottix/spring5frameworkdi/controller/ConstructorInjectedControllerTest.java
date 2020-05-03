package com.giovannottix.spring5frameworkdi.controller;

import com.giovannottix.spring5frameworkdi.service.GreetingServiceConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

/**
 * Created by Giovanni Esposito.
 *
 * @since : 05/02/20, Sat
 */
class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setup() {
        controller =
                new ConstructorInjectedController(new GreetingServiceConstructor());
    }

    @Test
    void getGreeting() {
        Assert.isTrue(("Hello Wold - Constructor").equals(controller.getGreeting()),
                "The String are different");
    }
}