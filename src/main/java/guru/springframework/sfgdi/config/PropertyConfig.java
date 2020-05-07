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
public class PropertyConfig {

    @Value("${database.user}")
    String user;

    @Value("${database.pwd}")
    String pwd;

    @Value("${database.url}")
    String url;

    @Value("${giovanni.jms.user}")
    String jmsUser;

    @Value("${giovanni.jms.pwd}")
    String jmsPwd;

    @Value("${giovanni.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPwd(pwd);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJMSSource fakeJmsSource() {
        FakeJMSSource fakeJMSSource = new FakeJMSSource();
        fakeJMSSource.setUser(jmsUser);
        fakeJMSSource.setPwd(jmsPwd);
        fakeJMSSource.setUrl(jmsUrl);
        return fakeJMSSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }

}
