package dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.repository;

import dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.entity.CompanyJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICompanyJpaRepository extends JpaRepository<CompanyJpaEntity, Long> {

    Optional<CompanyJpaEntity> findByCnpj(String cnpj);
}
