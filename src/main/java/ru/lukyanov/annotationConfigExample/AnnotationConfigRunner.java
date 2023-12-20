package ru.lukyanov.annotationConfigExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.lukyanov.annotationConfigExample.entity.User;
import ru.lukyanov.annotationConfigExample.service.UserService;

import java.util.Arrays;
import java.util.Optional;


public class AnnotationConfigRunner {
    public static final String BASE_PACKAGE = "ru.lukyanov.annotationConfigExample";

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BASE_PACKAGE);

        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
        UserService userService = context.getBean(UserService.class);
        Optional<User> user = userService.getUserById(1L);
        System.out.println(user);

    }
}
