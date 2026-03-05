package dev.rodolfo.storage_control.core.ports.out.item;

import dev.rodolfo.storage_control.core.model.item.ItemModel;
import dev.rodolfo.storage_control.core.ports.out.GenericRepository;

public interface ItemRepositoryPort extends GenericRepository<ItemModel, Long> {

    boolean existsBySkuAndCompanyId(String sku, Long companyId);
}
