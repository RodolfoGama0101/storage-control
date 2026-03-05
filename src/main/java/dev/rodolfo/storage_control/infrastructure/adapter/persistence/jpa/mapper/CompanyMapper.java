package dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.mapper;

import dev.rodolfo.storage_control.core.model.company.CompanyModel;
import dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.entity.CompanyJpaEntity;

public class CompanyMapper {

    public CompanyMapper() { }

    public static CompanyJpaEntity toJpaEntity(CompanyModel company) {
        if (company == null) return null;

        return CompanyJpaEntity.builder()
                .id(company.getId())
                .cnpj(company.getCnpj())
                .name(company.getName())
                .createdAt(company.getCreatedAt())
                .build();
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
