package dev.rodolfo.storage_control.core.ports.out.company;

import dev.rodolfo.storage_control.core.model.company.CompanyModel;
import dev.rodolfo.storage_control.core.ports.out.GenericRepository;

import java.util.Optional;

public interface CompanyRepositoryPort extends GenericRepository<CompanyModel, Long> {

    Optional<CompanyModel> getByCnpj(String cnpj);
}
