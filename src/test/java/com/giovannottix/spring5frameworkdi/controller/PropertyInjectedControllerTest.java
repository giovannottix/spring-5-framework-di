package com.giovannottix.spring5frameworkdi.controller;

import com.giovannottix.spring5frameworkdi.service.GreetingServiceConstructor;
import com.giovannottix.spring5frameworkdi.service.GreetingServiceProperty;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

/**
 * Created by Giovanni Esposito.
 *
 * @since : 05/02/20, Sat
 */
class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setup(){
        controller = new PropertyInjectedController();

        controller.greetingService = new GreetingServiceProperty();
    }

    @Test
    void getGreeting(){
        Assert.isTrue(("Hello Wold - Property").equals(controller.getGreeting()),
                "The String are different");
    }
}