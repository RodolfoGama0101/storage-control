package dev.rodolfo.storage_control.application.service;

import dev.rodolfo.storage_control.core.model.UserModel;
import dev.rodolfo.storage_control.core.ports.in.User.ICreateUserUseCase;
import dev.rodolfo.storage_control.core.ports.out.IUserRepositoryPort;

public class UserService implements ICreateUserUseCase {

    private final IUserRepositoryPort repository;

    public UserService(IUserRepositoryPort repository) {
        this.repository = repository;
    }

    @Override
    public UserModel save(UserModel user) {
        return repository.save(user);
    }
}
