package guru.springframework.sfgdi.services;

/**
 * @author: Giovanni Esposito.
 * @Date : 05/05/20, Tue
 */
public class GreetingServiceFactory {

    private final GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "en":
                return new I18nEnglishGreetingService();
            case "es":
                return new I18NSpanishService();
            default:
                return new PrimaryGreetingService();
        }
    }
}
