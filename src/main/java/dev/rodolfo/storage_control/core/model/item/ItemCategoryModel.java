package dev.rodolfo.storage_control.core.model.item;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemCategoryModel {

    private Long id;

    private String description;
}
