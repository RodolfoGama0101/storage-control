package dev.rodolfo.storage_control.core.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ItemMovementModel {

    private Long id;

    private String MovementType;

    private Integer quantity;

    private LocalDateTime movementDate;

    private String reason;
}
