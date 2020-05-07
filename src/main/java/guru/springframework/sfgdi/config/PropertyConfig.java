package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.exampleprops.FakeDataSource;
import guru.springframework.sfgdi.exampleprops.FakeJMSSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author: Giovanni Esposito.
 * @Date : 05/06/20, Wed
 */
@Configuration
//Any of the following are valid and its up to your preference which one use.
//@PropertySource({"classpath:datasource.properties",
                // "classpath:jms".properties"})
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    //To read environment variables
    //@Autowired
    //Environment environment;

    @Value("${database.user}")
    String user;

    @Value("${database.pwd}")
    String pwd;

    @Value("${database.url}")
    String url;

    @Value("${jms.user}")
    String jmsUser;

    @Value("${jms.pwd}")
    String jmswd;

    @Value("${jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        //fakeDataSource.setUser(environment.getProperty("ENVIRONMENT_VAR"));
        fakeDataSource.setPwd(pwd);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJMSSource fakeJmsSource() {
        FakeJMSSource fakeJMSSource = new FakeJMSSource();
        fakeJMSSource.setUser(user);
        fakeJMSSource.setPwd(pwd);
        fakeJMSSource.setUrl(url);
        return fakeJMSSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }

}
