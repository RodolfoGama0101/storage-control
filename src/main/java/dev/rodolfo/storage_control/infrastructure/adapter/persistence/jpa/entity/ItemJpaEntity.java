package dev.rodolfo.storage_control.infrastructure.adapter.persistence.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_item")
public class ItemJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_id")
    private Long companyId;

    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "sku")
    private String sku;

    @Column(name = "name")
    private String name;

    @Column(name = "current_quantity")
    private Integer currentQuantity;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
