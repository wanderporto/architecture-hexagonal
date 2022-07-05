package br.com.architecture.hexagonal.adapters.outbound;

import br.com.architecture.hexagonal.adapters.inbound.mapper.UserEntityMapper;
import br.com.architecture.hexagonal.adapters.outbound.repository.UserRepository;
import br.com.architecture.hexagonal.application.core.domain.User;
import br.com.architecture.hexagonal.application.ports.out.SaveUserPort;
import org.springframework.stereotype.Component;

@Component
public class SaveUserAdapter implements SaveUserPort {

    private final UserRepository userRepository;

    public SaveUserAdapter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User userModel) {
        final var user = UserEntityMapper.toUserEntity(userModel);
        userRepository.save(user);
        return userModel;
    }
}
