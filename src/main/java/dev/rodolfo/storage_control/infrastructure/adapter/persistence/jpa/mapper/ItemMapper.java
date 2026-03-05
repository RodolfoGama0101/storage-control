package dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.mapper;

import dev.rodolfo.storage_control.core.model.item.ItemModel;
import dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.entity.ItemJpaEntity;

public class ItemMapper {

    public ItemMapper() { }

    public static ItemJpaEntity toJpaEntity(ItemModel model) {
        return ItemJpaEntity.builder()
                .id(model.getId())
                .companyId(model.getCompanyId())
                .categoryId(model.getCategoryId())
                .sku(model.getSku())
                .name(model.getName())
                .currentQuantity(model.getCurrentQuantity())
                .createdAt(model.getCreatedAt())
                .build();
    }

    public static ItemModel toModel(ItemJpaEntity entity) {
        return ItemModel.builder()
                .id(entity.getId())
                .companyId(entity.getCompanyId())
                .categoryId(entity.getCategoryId())
                .sku(entity.getSku())
                .name(entity.getName())
                .currentQuantity(entity.getCurrentQuantity())
                .createdAt(entity.getCreatedAt())
                .build();
    }
}
