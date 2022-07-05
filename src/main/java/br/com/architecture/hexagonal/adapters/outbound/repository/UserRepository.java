package br.com.architecture.hexagonal.adapters.outbound.repository;

import br.com.architecture.hexagonal.adapters.outbound.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
