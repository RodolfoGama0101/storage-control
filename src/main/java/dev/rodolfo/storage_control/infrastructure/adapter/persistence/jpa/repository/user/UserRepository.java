package dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.repository.user;

import dev.rodolfo.storage_control.core.model.user.UserModel;
import dev.rodolfo.storage_control.core.ports.out.user.UserRepositoryPort;
import dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.entity.UserJpaEntity;
import dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepository implements UserRepositoryPort {

    private final UserJpaRepository userJpaRepository;

    public UserRepository(UserJpaRepository userJpaRepository) {
        this.userJpaRepository = userJpaRepository;
    }

    @Override
    public UserModel save(UserModel model) {
        UserJpaEntity jpaEntity = UserMapper.toJpaEntity(model);

        return UserMapper.toCoreEntity(userJpaRepository.save(jpaEntity));
    }

    @Override
    public UserModel update(UserModel coreEntity) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<UserModel> getAll() {
        return List.of();
    }

    @Override
    public Optional<UserModel> getById(Long id) {
        return Optional.empty();
    }
}
