package com.giovannottix.spring5frameworkdi.controller;

import com.giovannottix.spring5frameworkdi.service.GreetingServiceSetter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

/**
 * Created by Giovanni Esposito.
 *
 * @since : 05/02/20, Sat
 */
class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setup() {
        controller = new SetterInjectedController();

        controller.setGreetingService(new GreetingServiceSetter());
    }

    @Test
    void getGreeting() {
        Assert.isTrue(("Hello Wold - Setter").equals(controller.getGreeting()),
                "The String are different");
    }

}