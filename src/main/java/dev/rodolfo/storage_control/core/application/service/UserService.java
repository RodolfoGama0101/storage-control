package dev.rodolfo.storage_control.core.application.service;

import dev.rodolfo.storage_control.core.model.company.CompanyModel;
import dev.rodolfo.storage_control.core.model.user.UserModel;
import dev.rodolfo.storage_control.core.ports.in.PasswordEncoderPort;
import dev.rodolfo.storage_control.core.ports.in.user.CreateUserUseCase;
import dev.rodolfo.storage_control.core.ports.out.company.CompanyRepositoryPort;
import dev.rodolfo.storage_control.core.ports.out.user.UserRepositoryPort;

import java.time.LocalDateTime;

public class UserService implements CreateUserUseCase {

    private final UserRepositoryPort repository;

    private final CompanyRepositoryPort companyRepository;

    private final PasswordEncoderPort passwordEncoder;

    public UserService(UserRepositoryPort repository, CompanyRepositoryPort companyRepository, PasswordEncoderPort passwordEncoder) {
        this.repository = repository;
        this.companyRepository = companyRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserModel save(UserModel user, String cnpj, String rawPassword) {
        CompanyModel company = companyRepository.getByCnpj(cnpj).orElseThrow(
                () -> new RuntimeException("Company not found with CNPJ: " + cnpj)
        );

        user.setCompanyId(company.getId());
        user.setCreatedAt(LocalDateTime.now());

        String hashedPassword = passwordEncoder.encode(rawPassword);
        user.setPasswordHash(hashedPassword);

        return repository.save(user);
    }
}
