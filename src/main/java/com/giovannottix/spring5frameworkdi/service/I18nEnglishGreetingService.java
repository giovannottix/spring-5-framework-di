package com.giovannottix.spring5frameworkdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Giovanni Esposito.
 *
 * @since : 05/02/20, Sat
 */
@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements IGreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
