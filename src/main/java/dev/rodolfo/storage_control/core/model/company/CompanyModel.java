package dev.rodolfo.storage_control.core.model.company;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class CompanyModel {
    private Long id;

    private String name;

    private String cnpj;

    private LocalDateTime createdAt;
}