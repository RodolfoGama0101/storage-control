package dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.mapper;

import dev.rodolfo.storage_control.core.model.CompanyModel;
import dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.entity.CompanyJpaEntity;

public class CompanyMapper {

    public CompanyMapper() {}

    public static CompanyJpaEntity toJpaEntity(CompanyModel company) {
        if (company == null) return null;

        return new CompanyJpaEntity(
            company.getId(),
            company.getCnpj(),
            company.getName(),
            company.getCreatedAt()
        );
    }

    public static CompanyModel toCoreEntity(CompanyJpaEntity company) {
        if (company == null) return null;

        return CompanyModel.builder()
                .id(company.getId())
                .cnpj(company.getCnpj())
                .name(company.getName())
                .createdAt(company.getCreatedAt())
                .build();
    }
}
