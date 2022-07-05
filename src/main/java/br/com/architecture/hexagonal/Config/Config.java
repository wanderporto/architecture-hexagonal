package br.com.architecture.hexagonal.Config;

import br.com.architecture.hexagonal.adapters.outbound.GetAddressAdapter;
import br.com.architecture.hexagonal.adapters.outbound.SaveUserAdapter;
import br.com.architecture.hexagonal.application.core.service.SaveUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public SaveUserService saveUser(SaveUserAdapter saveUserAdapter, GetAddressAdapter getAddressAdapter) {
        return new SaveUserService(saveUserAdapter, getAddressAdapter);
    }
}
