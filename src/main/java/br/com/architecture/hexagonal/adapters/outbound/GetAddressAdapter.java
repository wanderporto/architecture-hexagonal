package br.com.architecture.hexagonal.adapters.outbound;

import br.com.architecture.hexagonal.adapters.outbound.feign.ApiEndereco;
import br.com.architecture.hexagonal.application.core.domain.Address;
import br.com.architecture.hexagonal.application.ports.out.GetAddressPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetAddressAdapter implements GetAddressPort {

    private final ApiEndereco apiEndereco;

    @Override
    public Address get(String cep) {
        final var address = apiEndereco.buscar(cep);
        return address.getBody();
    }
}
