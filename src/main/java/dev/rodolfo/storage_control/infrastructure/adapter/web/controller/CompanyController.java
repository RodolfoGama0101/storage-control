package dev.rodolfo.storage_control.infrastructure.adapter.web.controller;

import dev.rodolfo.storage_control.core.model.company.CompanyModel;
import dev.rodolfo.storage_control.core.ports.in.company.CreateCompanyUseCase;
import dev.rodolfo.storage_control.infrastructure.adapter.web.viewmodel.CompanyViewModel;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/company")
@Tag(name = "Empresas", description = "Operações relacionadas a empresas")
public class CompanyController {

    private final CreateCompanyUseCase createCompanyUseCase;

    public CompanyController(CreateCompanyUseCase createCompanyUseCase) {
        this.createCompanyUseCase = createCompanyUseCase;
    }

    @PostMapping(path = "/v1/create")
    public ResponseEntity<CompanyModel> createCompany(
            @Valid @RequestBody CompanyViewModel viewModel
    ) {
        CompanyModel companyModel = CompanyModel.builder()
                .name(viewModel.name())
                .cnpj(viewModel.cnpj())
                .build();

        System.out.println(viewModel.cnpj().length());

        CompanyModel createdCompany = createCompanyUseCase.save(companyModel);

        return ResponseEntity.ok(createdCompany);
    }
}
