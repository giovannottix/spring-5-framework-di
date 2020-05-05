package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.GreetingRepository;
import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * @author: Giovanni Esposito.
 * @Date : 05/05/20, Tue
 */
@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository){
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("");
    }

    @Bean
    @Profile({"en"})
    GreetingService englishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Profile({"es"})
    GreetingService spanishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("es");
    }
}
