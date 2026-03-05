package dev.rodolfo.storage_control.core.application.service;

import dev.rodolfo.storage_control.core.model.item.ItemModel;
import dev.rodolfo.storage_control.core.ports.in.item.CreateItemUseCase;
import dev.rodolfo.storage_control.core.ports.out.item.ItemRepositoryPort;
import dev.rodolfo.storage_control.core.service.SkuGenerator;

import java.time.LocalDateTime;

public class ItemService implements CreateItemUseCase {

    private final ItemRepositoryPort repository;

    public ItemService(ItemRepositoryPort repository) {
        this.repository = repository;
    }

    @Override
    public ItemModel create(ItemModel item) {

        if (repository.existsBySkuAndCompanyId(item.getSku(), item.getCompanyId())) {
            throw new IllegalArgumentException("An item with the same SKU already exists for this company.");
        }

        if (item.getCurrentQuantity() == null) {
            item.setCurrentQuantity(0);
        }

        item.setSku(SkuGenerator.generateSemanticSku(item.getName()));
        item.setCreatedAt(LocalDateTime.now());

        return repository.save(item);
    }
}
