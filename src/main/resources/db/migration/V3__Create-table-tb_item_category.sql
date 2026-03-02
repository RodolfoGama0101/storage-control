CREATE TABLE tb_item_category (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    company_id BIGINT NOT NULL,
    description VARCHAR(50) NOT NULL,
    CONSTRAINT fk_category_company FOREIGN KEY (company_id) REFERENCES tb_company(id)
);