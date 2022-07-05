package br.com.architecture.hexagonal.application.ports.out;

import br.com.architecture.hexagonal.application.core.domain.User;

public interface SaveUserPort {

    User saveUser(User user);
}
