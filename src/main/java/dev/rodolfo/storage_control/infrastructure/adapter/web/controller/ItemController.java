package dev.rodolfo.storage_control.infrastructure.adapter.web.controller;

import dev.rodolfo.storage_control.core.model.item.ItemModel;
import dev.rodolfo.storage_control.core.ports.in.item.CreateItemUseCase;
import dev.rodolfo.storage_control.infrastructure.adapter.web.viewmodel.ItemViewModel;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/item")
@Tag(name = "Itens", description = "Operações relacionadas a itens")
public class ItemController {

    private final CreateItemUseCase createItemUseCase;

    public ItemController(CreateItemUseCase createItemUseCase) {
        this.createItemUseCase = createItemUseCase;
    }

    @PostMapping(path = "/v1/create")
    public ResponseEntity<ItemModel> createItem(
            @RequestBody ItemViewModel viewModel
    ) {
        ItemModel model = ItemModel.builder()
                .name(viewModel.name())
                .currentQuantity(viewModel.currentQuantity())
                .categoryId(viewModel.categoryId())
                .companyId(viewModel.companyId())
                .build();

        ItemModel createdItem = createItemUseCase.create(model);

        return ResponseEntity.ok(createdItem);
    }
}
