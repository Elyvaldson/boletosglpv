package com.glpv.sistemaboleto;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.glpv.sistemaboleto.domain.Banco;
import com.glpv.sistemaboleto.repositories.BancoRepository;

@SpringBootApplication
public class BoletoglpvApplication implements CommandLineRunner {

	@Autowired
	private BancoRepository bancorepo;
	
	public static void main(String[] args) {
		SpringApplication.run(BoletoglpvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Banco b1 = new Banco(null, "Banco de Teste");
		
		bancorepo.save(Arrays.asList(b1));
	}
}
