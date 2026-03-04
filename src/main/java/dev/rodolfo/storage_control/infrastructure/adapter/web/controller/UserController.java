package dev.rodolfo.storage_control.infrastructure.adapter.web.controller;

import dev.rodolfo.storage_control.core.model.UserModel;
import dev.rodolfo.storage_control.core.ports.in.User.ICreateUserUseCase;
import dev.rodolfo.storage_control.infrastructure.adapter.web.viewmodel.UserViewModel;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@Tag(name = "Usuários", description = "Operações relacionadas a usuários")
public class UserController {

    private final ICreateUserUseCase createUserUseCase;

    public UserController(ICreateUserUseCase createUserUseCase) {
        this.createUserUseCase = createUserUseCase;
    }

    @PostMapping(path = "/create")
    public ResponseEntity<?> createUser(
            @RequestBody @Valid UserViewModel viewModel
    ) {
        UserModel userModel = UserModel.builder()
                .name(viewModel.name())
                .email(viewModel.email())
                .passwordHash(viewModel.password())
                .build();

        UserModel createdUser = createUserUseCase.save(userModel, viewModel.companyCnpj());

        return ResponseEntity.ok(createdUser);
    }
}
