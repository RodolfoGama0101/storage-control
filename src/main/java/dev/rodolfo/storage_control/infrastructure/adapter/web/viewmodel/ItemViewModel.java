package dev.rodolfo.storage_control.infrastructure.adapter.web.viewmodel;

import jakarta.validation.constraints.NotBlank;

public record ItemViewModel(
        @NotBlank String name,
        Integer currentQuantity,
        @NotBlank Long categoryId,
        @NotBlank Long companyId
) { }
