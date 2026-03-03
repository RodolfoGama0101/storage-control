package dev.rodolfo.storage_control.core.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompanyModel {
    private Long id;

    private String name;

    private String cnpj;
}