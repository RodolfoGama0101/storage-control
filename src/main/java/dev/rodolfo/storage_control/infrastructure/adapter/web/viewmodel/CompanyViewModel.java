package dev.rodolfo.storage_control.infrastructure.adapter.web.viewmodel;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CNPJ;

public record CompanyViewModel(
        @NotBlank String name,
        @NotBlank @CNPJ String cnpj
) { }
