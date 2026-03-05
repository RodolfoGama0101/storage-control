package dev.rodolfo.storage_control.core.ports.out.user;

import dev.rodolfo.storage_control.core.model.user.UserModel;
import dev.rodolfo.storage_control.core.ports.out.GenericRepository;

public interface UserRepositoryPort extends GenericRepository<UserModel, Long> {
}
