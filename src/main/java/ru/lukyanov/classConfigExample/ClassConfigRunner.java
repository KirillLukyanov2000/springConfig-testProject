package ru.lukyanov.classConfigExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.lukyanov.classConfigExample.config.ApplicationConfig;
import ru.lukyanov.classConfigExample.entity.User;
import ru.lukyanov.classConfigExample.service.UserService;

import java.util.Optional;


public class ClassConfigRunner {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);


        UserService userService = context.getBean(UserService.class);
        Optional<User> user = userService.getUserById(2L);
        System.out.println(user);

    }
}
