package br.com.architecture.hexagonal.adapters.inbound.mapper;

import br.com.architecture.hexagonal.adapters.inbound.dto.UserRequest;
import br.com.architecture.hexagonal.application.core.domain.User;

public class UserRequestToUserMapper {

    public static User mapper(UserRequest userRequest) {
        User user = new User();
        user.setName(userRequest.getName());
        user.setBirth(userRequest.getBirth());
        user.setInstragam(userRequest.getInstragam());
        return user;
    }
}
