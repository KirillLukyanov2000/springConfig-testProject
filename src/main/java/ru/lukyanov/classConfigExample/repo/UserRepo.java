package ru.lukyanov.classConfigExample.repo;


import org.springframework.stereotype.Repository;
import ru.lukyanov.classConfigExample.entity.User;

import java.util.Map;
import java.util.Optional;


@Repository
public class UserRepo implements Repo<User> {

    private Map<Long, User> userMap = Map.of(
            1L, new User("Ivan", "pass1"),
            2L, new User("Vasya", "qwer2")
    );

    public Optional<User> getById(Long id) {
        return Optional.of(userMap.get(id));
    }
}
