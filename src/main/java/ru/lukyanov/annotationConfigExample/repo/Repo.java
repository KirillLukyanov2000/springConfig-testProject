package ru.lukyanov.annotationConfigExample.repo;

import java.util.Optional;

public interface Repo<T> {
    Optional <T> getById(Long id);
}
