package dev.rodolfo.storage_control.core.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemModel {

    private Long id;

    private String sku;

    private String name;

    private Integer currentQuantity;
}
