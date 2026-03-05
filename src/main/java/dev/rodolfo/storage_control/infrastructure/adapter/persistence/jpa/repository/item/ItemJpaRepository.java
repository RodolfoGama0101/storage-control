package dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.repository.item;

import dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.entity.ItemJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemJpaRepository extends JpaRepository<ItemJpaEntity, Long> {

    boolean existsBySkuAndCompanyId(String sku, Long companyId);
}
