package dev.rodolfo.storage_control.core.ports.in.user;

import dev.rodolfo.storage_control.core.model.user.UserModel;

public interface CreateUserUseCase {

    UserModel save(UserModel user, String cnpj, String rawPassword);
}
