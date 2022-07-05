package br.com.architecture.hexagonal.adapters.inbound.mapper;

import br.com.architecture.hexagonal.adapters.outbound.entity.AddressEntity;
import br.com.architecture.hexagonal.adapters.outbound.entity.UserEntity;
import br.com.architecture.hexagonal.application.core.domain.User;

public class UserEntityMapper {

    public static UserEntity toUserEntity(User userModel) {
        UserEntity userEntity = new UserEntity();
        userEntity.setInstagram(userModel.getInstragam());
        userEntity.setDataNascimento(userModel.getBirth());
        userEntity.setNome(userModel.getName());

        AddressEntity endereco = new AddressEntity();
        endereco.setCep(userModel.getEndereço().getCep());
        endereco.setCity(userModel.getEndereço().getCity());
        endereco.setUf(userModel.getEndereço().getUf());
        userEntity.setEndereco(endereco);
        return userEntity;
    }
}
