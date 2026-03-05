package dev.rodolfo.storage_control.core.ports.in.item;

import dev.rodolfo.storage_control.core.model.item.ItemModel;

public interface CreateItemUseCase {

    ItemModel create(ItemModel item);
}
