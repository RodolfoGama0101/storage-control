package dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.repository;

import dev.rodolfo.storage_control.core.model.UserModel;
import dev.rodolfo.storage_control.core.ports.out.IUserRepositoryPort;
import dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.entity.UserJpaEntity;
import dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepository implements IUserRepositoryPort {

    private final IUserJpaRepository userJpaRepository;

    public UserRepository(IUserJpaRepository userJpaRepository) {
        this.userJpaRepository = userJpaRepository;
    }

    @Override
    public UserModel save(UserModel coreEntity) {
        UserJpaEntity jpaEntity = UserMapper.toJpaEntity(coreEntity);

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
