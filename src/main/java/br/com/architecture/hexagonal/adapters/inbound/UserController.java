package br.com.architecture.hexagonal.adapters.inbound;

import br.com.architecture.hexagonal.adapters.inbound.dto.UserRequest;
import br.com.architecture.hexagonal.adapters.inbound.mapper.UserRequestToUserMapper;
import br.com.architecture.hexagonal.application.core.domain.User;
import br.com.architecture.hexagonal.application.ports.in.SaveUserServicePort;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final SaveUserServicePort saveUserServicePort;


    @PostMapping
    public User saveUser(@RequestBody UserRequest userRequest) {
        final var userModel = UserRequestToUserMapper.mapper(userRequest);
        return saveUserServicePort.saveUser(userModel, userRequest.getCep());
    }
}
