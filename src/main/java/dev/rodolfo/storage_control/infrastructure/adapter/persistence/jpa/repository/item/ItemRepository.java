package dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.repository.item;

import dev.rodolfo.storage_control.core.model.item.ItemModel;
import dev.rodolfo.storage_control.core.ports.out.item.ItemRepositoryPort;
import dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.entity.ItemJpaEntity;
import dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.mapper.ItemMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ItemRepository implements ItemRepositoryPort {

    private final ItemJpaRepository repository;

    public ItemRepository(ItemJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean existsBySkuAndCompanyId(String sku, Long companyId) {
        return repository.existsBySkuAndCompanyId(sku, companyId);
    }

    @Override
    public ItemModel save(ItemModel coreEntity) {
        ItemJpaEntity entity = ItemMapper.toJpaEntity(coreEntity);

        return ItemMapper.toModel(repository.save(entity));
    }

    @Override
    public ItemModel update(ItemModel coreEntity) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<ItemModel> getAll() {
        return List.of();
    }

    @Override
    public Optional<ItemModel> getById(Long aLong) {
        return Optional.empty();
    }
}
