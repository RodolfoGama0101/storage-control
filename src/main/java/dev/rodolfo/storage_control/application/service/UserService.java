package dev.rodolfo.storage_control.application.service;

import dev.rodolfo.storage_control.core.model.CompanyModel;
import dev.rodolfo.storage_control.core.model.UserModel;
import dev.rodolfo.storage_control.core.ports.in.User.ICreateUserUseCase;
import dev.rodolfo.storage_control.core.ports.out.ICompanyRepositoryPort;
import dev.rodolfo.storage_control.core.ports.out.IUserRepositoryPort;

public class UserService implements ICreateUserUseCase {

    private final IUserRepositoryPort repository;

    private final ICompanyRepositoryPort companyRepository;

    public UserService(IUserRepositoryPort repository, ICompanyRepositoryPort companyRepository) {
        this.repository = repository;
        this.companyRepository = companyRepository;
    }

    @Override
    public UserModel save(UserModel user, String cnpj) {
        CompanyModel company = companyRepository.getByCnpj(cnpj).orElseThrow(
                () -> new RuntimeException("Company not found with CNPJ: " + cnpj)
        );

        user.setCompanyId(company.getId());

        return repository.save(user);
    }
}
