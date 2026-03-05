package dev.rodolfo.storage_control.core.ports.in.company;

import dev.rodolfo.storage_control.core.model.company.CompanyModel;

public interface CreateCompanyUseCase {

    CompanyModel save(CompanyModel company);
}
