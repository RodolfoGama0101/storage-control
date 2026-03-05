package dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.repository.user;

import dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.entity.UserJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJpaRepository extends JpaRepository<UserJpaEntity, Long> {
}
