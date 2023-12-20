package ru.lukyanov.XMLConfigExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.lukyanov.XMLConfigExample.entity.User;
import ru.lukyanov.XMLConfigExample.service.UserService;

import java.util.Arrays;
import java.util.Optional;

public class XMLConfigRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
        UserService userService = context.getBean(UserService.class);
        Optional<User> user1 = userService.getUserById(1L);
        Optional<User> user2 = userService.getUserById(2L);
        System.out.println(user1);
        System.out.println(user2);

    }
}
