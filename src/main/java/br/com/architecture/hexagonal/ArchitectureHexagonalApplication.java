package br.com.architecture.hexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ArchitectureHexagonalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArchitectureHexagonalApplication.class, args);
    }

}
