package com.arki.config;


import com.arki.pojo.Address;
import com.arki.pojo.User;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.arki.pojo")
public class SpringConfig {
    @Bean
    public User getUser(@Autowired @Qualifier("address") Address address){
        User user = new User();
        user.setAddress(address);
        return user;
    }
}
