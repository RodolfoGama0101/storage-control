CREATE TABLE tb_item_movement (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    item_id BIGINT NOT NULL,
    user_id BIGINT NOT NULL,
    movement_type VARCHAR(10) NOT NULL, -- 'IN' ou 'OUT'
    quantity INT NOT NULL,
    movement_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    reason VARCHAR(255),
    CONSTRAINT fk_movement_item FOREIGN KEY (item_id) REFERENCES tb_item(id),
    CONSTRAINT fk_movement_user FOREIGN KEY (user_id) REFERENCES tb_user(id)
);