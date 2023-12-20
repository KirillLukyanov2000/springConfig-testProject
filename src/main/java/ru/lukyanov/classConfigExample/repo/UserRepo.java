package ru.lukyanov.classConfigExample.repo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.lukyanov.classConfigExample.entity.User;

import java.util.Map;
import java.util.Optional;


@Repository
public class UserRepo implements Repo<User> {

    private Map<Long, User> userMap;

    @Autowired
    public void setUserMap(Map<Long, User> userMap) {
        this.userMap = userMap;
    }

    public Optional<User> getById(Long id) {
        return Optional.of(userMap.get(id));
    }
}
