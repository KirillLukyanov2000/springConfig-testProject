package ru.lukyanov.classConfigExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.lukyanov.classConfigExample.config.ApplicationConfig;
import ru.lukyanov.classConfigExample.service.UserService;


public class ClassConfigRunner {


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);


        UserService userService = context.getBean(UserService.class);
        System.out.println(userService.getUserById(1L));
        System.out.println(userService.getUserById(2L));

    }
}
