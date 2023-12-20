package ru.lukyanov.classConfigExample.repo;

import java.util.Optional;

public interface Repo<T> {
    Optional<T> getById(Long id);
}
