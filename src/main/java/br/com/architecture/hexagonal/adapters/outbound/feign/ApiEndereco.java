package br.com.architecture.hexagonal.adapters.outbound.feign;

import br.com.architecture.hexagonal.application.core.domain.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "buscaCep", url = "https://viacep.com.br")
public interface ApiEndereco {

    @GetMapping("/ws/{cep}/json")
    ResponseEntity<Address> buscar(@PathVariable String cep);
}
