package dev.rodolfo.storage_control.core.model.item;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ItemModel {

    private Long id;

    private Long companyId;

    private Long categoryId;

    private String sku;

    private String name;

    private Integer currentQuantity;

    private LocalDateTime createdAt;
}
