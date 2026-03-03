package dev.rodolfo.storage_control.infrastructure.adapter.web.controller;

import dev.rodolfo.storage_control.core.ports.in.User.ICreateUserUseCase;
import dev.rodolfo.storage_control.infrastructure.adapter.web.viewmodel.UserViewModel;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final ICreateUserUseCase createUserUseCase;

    public UserController(ICreateUserUseCase createUserUseCase) {
        this.createUserUseCase = createUserUseCase;
    }

    @PostMapping
    public ResponseEntity<?> createUser(
            @RequestBody @Valid UserViewModel viewModel
    ) {

    }
}
