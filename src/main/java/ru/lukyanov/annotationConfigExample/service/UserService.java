package ru.lukyanov.annotationConfigExample.service;

import lombok.Data;
import org.springframework.stereotype.Service;
import ru.lukyanov.annotationConfigExample.entity.User;
import ru.lukyanov.annotationConfigExample.repo.UserRepo;

import java.util.Optional;


@Service
@Data
public class UserService {

    private final UserRepo userRepo;


    public Optional<User> getUserById(Long id) {
        return userRepo.getById(id);
    }
}
