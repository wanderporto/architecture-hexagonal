package br.com.architecture.hexagonal.application.core.service;

import br.com.architecture.hexagonal.application.core.domain.User;
import br.com.architecture.hexagonal.application.ports.in.SaveUserServicePort;
import br.com.architecture.hexagonal.application.ports.out.GetAddressPort;
import br.com.architecture.hexagonal.application.ports.out.SaveUserPort;

public class SaveUserService implements SaveUserServicePort {

    private final SaveUserPort saveUserPort;
    private final GetAddressPort getAddress;

    public SaveUserService(SaveUserPort saveUserPort, GetAddressPort getAddress) {
        this.saveUserPort = saveUserPort;
        this.getAddress = getAddress;
    }

    @Override
    public User saveUser(User user, String cep) {
        final var address = getAddress.get(cep);
        user.setEndereço(address);
        return saveUserPort.saveUser(user);

    }
}
