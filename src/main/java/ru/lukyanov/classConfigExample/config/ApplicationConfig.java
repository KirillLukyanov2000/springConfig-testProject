package ru.lukyanov.classConfigExample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.lukyanov.classConfigExample.entity.User;

import java.util.Map;

@Configuration
@ComponentScan("ru.lukyanov.classConfigExample")
public class ApplicationConfig {

    @Bean
    Map<Long, User> userMap() {
        return Map.of(
                1L, new User("Ivan", "pass1"),
                2L, new User("Vasya", "qwer2")
        );
    }
}
