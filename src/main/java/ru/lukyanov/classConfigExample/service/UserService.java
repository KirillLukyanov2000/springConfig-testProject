package ru.lukyanov.classConfigExample.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.lukyanov.classConfigExample.entity.User;
import ru.lukyanov.classConfigExample.repo.UserRepo;

import java.util.Optional;


@Service
@AllArgsConstructor
public class UserService {

    private final UserRepo userRepo;


    public Optional<User> getUserById(Long id) {
        return userRepo.getById(id);
    }
}
