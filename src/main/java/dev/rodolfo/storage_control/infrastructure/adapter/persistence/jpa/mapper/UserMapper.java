package dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.mapper;

import dev.rodolfo.storage_control.core.model.UserModel;
import dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.entity.UserJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserMapper() {
    }

    public static UserJpaEntity toJpaEntity(UserModel user) {
        if (user == null) return null;

        return new UserJpaEntity(
            user.getId(),
            user.getCompanyId(),
            user.getName(),
            user.getEmail(),
            user.getPasswordHash(),
            user.getCreatedAt()
        );
    }

    public static UserModel toCoreEntity(UserJpaEntity userJpaEntity) {
        if (userJpaEntity == null) return null;

        return UserModel.builder()
                .id(userJpaEntity.getId())
                .companyId(userJpaEntity.getCompanyId())
                .name(userJpaEntity.getName())
                .email(userJpaEntity.getEmail())
                .passwordHash(userJpaEntity.getPasswordHash())
                .createdAt(userJpaEntity.getCreatedAt())
                .build();
    }
}
