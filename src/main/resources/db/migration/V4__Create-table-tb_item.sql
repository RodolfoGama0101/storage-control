CREATE TABLE tb_item (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    company_id BIGINT NOT NULL,
    category_id BIGINT NOT NULL,
    sku VARCHAR(50) NOT NULL, -- Stock Keeping Unit (Código único do produto)
    name VARCHAR(150) NOT NULL,
    current_quantity INT DEFAULT 0, -- Saldo atualizado em cache
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_item_company FOREIGN KEY (company_id) REFERENCES tb_company(id),
    CONSTRAINT fk_item_category FOREIGN KEY (category_id) REFERENCES tb_item_category(id),
    CONSTRAINT uk_item_sku_company UNIQUE (company_id, sku) -- Um SKU é único por empresa
);