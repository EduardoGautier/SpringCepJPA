package com.example.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.spring.entity.CepEntity;
import com.example.spring.repository.CepRepository;

@SpringBootApplication
public class SpringCepJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCepJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CepRepository repository) {
		return (args) -> {
			// save a few customers
			repository.save(new CepEntity("94960-847", "Juan Albino Nunes Ayala", "Moradas Do Bosque", "Cachoeirinha", "RS"));
			repository.save(new CepEntity("94935-410", "Lidio Batista Soares", "Vila City", "Cachoeirinha", "RS"));
			repository.save(new CepEntity("91270-020", "Acesso A", "Morro Santana", "Porto Alegre", "RS"));
			repository.save(new CepEntity("04180-112", "Travessa 19 de Agosto", "Jardim Maria Estela", "São Paulo", "SP"));
			repository.save(new CepEntity("08240-001", "Rua 23 de Novembro", "Vila Progresso (Zona Leste)", "São Paulo", "SP"));

		};
	}
}
