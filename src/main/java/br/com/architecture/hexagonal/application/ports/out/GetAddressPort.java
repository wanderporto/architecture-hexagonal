package br.com.architecture.hexagonal.application.ports.out;

import br.com.architecture.hexagonal.application.core.domain.Address;

public interface GetAddressPort {

    Address get(String cep);
}
