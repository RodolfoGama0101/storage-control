package dev.rodolfo.storage_control.core.model.user;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class UserModel {

    private Long id;

    private Long companyId;

    private String name;

    private String email;

    private String passwordHash;

    private LocalDateTime createdAt;
}
