package stringbootpractise.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Queue;

/**
 * Created by Mazexal on 2017/7/27.
 */

@ConfigurationProperties(prefix = "wisely2")
public class RabbitConfig {
    //    @Bean
//    public Queue Queue() {
//        return new Queue("hello");
//    }
    private String name;
    private String gender;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {

        return name;
    }

    public String getGender() {
        return gender;
    }
}
