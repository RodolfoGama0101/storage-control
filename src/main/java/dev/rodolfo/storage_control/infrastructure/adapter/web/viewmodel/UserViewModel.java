package dev.rodolfo.storage_control.infrastructure.adapter.web.viewmodel;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;

public record UserViewModel(
        @NotBlank String name,
        @NotBlank String email,
        @NotBlank String password,
        @NotBlank String confirmPassword,
        @NotBlank String companyCnpj
) {

    @AssertTrue(message = "Password and Confirm Password must match")
    public boolean isPasswordValid() {
        return password != null && password.equals(confirmPassword);
    }
}
