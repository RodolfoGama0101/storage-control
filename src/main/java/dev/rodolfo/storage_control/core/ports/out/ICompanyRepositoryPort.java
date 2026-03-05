package dev.rodolfo.storage_control.core.ports.out;

import dev.rodolfo.storage_control.core.model.CompanyModel;

import java.util.Optional;

public interface ICompanyRepositoryPort extends IGenericRepository<CompanyModel, Long> {

    Optional<CompanyModel> getByCnpj(String cnpj);
}
