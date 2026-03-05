package dev.rodolfo.storage_control.core.application.service;

import dev.rodolfo.storage_control.core.model.company.CompanyModel;
import dev.rodolfo.storage_control.core.ports.in.company.CreateCompanyUseCase;
import dev.rodolfo.storage_control.core.ports.out.company.CompanyRepositoryPort;

import java.time.LocalDateTime;

public class CompanyService implements CreateCompanyUseCase {

    private final CompanyRepositoryPort repository;

    public CompanyService(CompanyRepositoryPort repository) {
        this.repository = repository;
    }

    @Override
    public CompanyModel save(CompanyModel company) {
        company.setCreatedAt(LocalDateTime.now());

        return repository.save(company);
    }
}
