package br.com.architecture.hexagonal.adapters.outbound.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class UserEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    private Long id;
    private String nome;
    private String instagram;
    private String linkedin;
    private String github;
    private LocalDate dataNascimento;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    private AddressEntity endereco;
}
