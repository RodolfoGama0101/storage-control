package dev.rodolfo.storage_control.infrastructure.config;

import dev.rodolfo.storage_control.application.service.UserService;
import dev.rodolfo.storage_control.core.ports.in.User.ICreateUserUseCase;
import dev.rodolfo.storage_control.core.ports.out.ICompanyRepositoryPort;
import dev.rodolfo.storage_control.core.ports.out.IUserRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public ICreateUserUseCase createUserUseCase(IUserRepositoryPort userRepositoryPort,
                                                ICompanyRepositoryPort companyRepositoryPort) {
        return new UserService(userRepositoryPort, companyRepositoryPort);
    }
}
