package br.com.architecture.hexagonal.application.ports.in;

import br.com.architecture.hexagonal.application.core.domain.User;

public interface SaveUserServicePort {
    User saveUser(User user, String cep);
}
