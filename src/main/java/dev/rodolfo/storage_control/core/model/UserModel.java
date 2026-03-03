package dev.rodolfo.storage_control.core.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserModel {

    private Long id;

    private Long companyId;

    private String name;

    private String email;

    private String passwordHash;

    private String createdAt;
}
