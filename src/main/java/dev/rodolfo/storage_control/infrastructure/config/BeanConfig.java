package dev.rodolfo.storage_control.infrastructure.config;

import dev.rodolfo.storage_control.core.application.service.CompanyService;
import dev.rodolfo.storage_control.core.application.service.ItemService;
import dev.rodolfo.storage_control.core.application.service.UserService;
import dev.rodolfo.storage_control.core.ports.in.PasswordEncoderPort;
import dev.rodolfo.storage_control.core.ports.out.company.CompanyRepositoryPort;
import dev.rodolfo.storage_control.core.ports.out.item.ItemRepositoryPort;
import dev.rodolfo.storage_control.core.ports.out.user.UserRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public UserService userService(UserRepositoryPort userRepositoryPort,
                                               CompanyRepositoryPort companyRepositoryPort,
                                               PasswordEncoderPort passwordEncoderPort) {
        return new UserService(userRepositoryPort, companyRepositoryPort, passwordEncoderPort);
    }

    @Bean
    public CompanyService companyService(CompanyRepositoryPort companyRepositoryPort) {
        return new CompanyService(companyRepositoryPort);
    }

    @Bean
    public ItemService itemService(ItemRepositoryPort itemRepositoryPort) {
        return new ItemService(itemRepositoryPort);
    }
}
