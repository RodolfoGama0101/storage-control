package dev.rodolfo.storage_control.infrastructure.adapter.web.viewmodel;

import jakarta.validation.constraints.NotBlank;

public record UserViewModel(
        @NotBlank String name,
        @NotBlank String email,
        @NotBlank String password
) {
}
