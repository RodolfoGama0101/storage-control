package dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.repository;

import dev.rodolfo.storage_control.core.model.CompanyModel;
import dev.rodolfo.storage_control.core.ports.out.ICompanyRepositoryPort;
import dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.entity.CompanyJpaEntity;
import dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.mapper.CompanyMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CompanyRepository implements ICompanyRepositoryPort {

    private final ICompanyJpaRepository repository;

    public CompanyRepository(ICompanyJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<CompanyModel> getByCnpj(String cnpj) {
        Optional<CompanyJpaEntity> companyEntity = repository.findByCnpj(cnpj);

        return Optional.ofNullable(CompanyMapper.toCoreEntity(companyEntity.orElse(null)));
    }

    @Override
    public CompanyModel save(CompanyModel coreEntity) {
        return null;
    }

    @Override
    public CompanyModel update(CompanyModel coreEntity) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<CompanyModel> getAll() {
        return List.of();
    }

    @Override
    public Optional<CompanyModel> getById(Long aLong) {
        return Optional.empty();
    }
}
