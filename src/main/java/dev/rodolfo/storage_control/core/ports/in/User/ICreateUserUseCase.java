package dev.rodolfo.storage_control.core.ports.in.User;

import dev.rodolfo.storage_control.core.model.UserModel;

public interface ICreateUserUseCase {

    UserModel save(UserModel user);
}
