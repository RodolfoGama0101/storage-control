package dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.repository.company;

import dev.rodolfo.storage_control.core.model.company.CompanyModel;
import dev.rodolfo.storage_control.core.ports.out.company.CompanyRepositoryPort;
import dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.entity.CompanyJpaEntity;
import dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.mapper.CompanyMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CompanyRepository implements CompanyRepositoryPort {

    private final CompanyJpaRepository repository;

    public CompanyRepository(CompanyJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<CompanyModel> getByCnpj(String cnpj) {
        Optional<CompanyJpaEntity> companyEntity = repository.findByCnpj(cnpj);

        return Optional.ofNullable(CompanyMapper.toCoreEntity(companyEntity.orElse(null)));
    }

    @Override
    public CompanyModel save(CompanyModel model) {
        CompanyJpaEntity entity = CompanyMapper.toJpaEntity(model);

        return CompanyMapper.toCoreEntity(repository.save(entity));
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
