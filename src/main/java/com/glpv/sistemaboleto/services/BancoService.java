package com.glpv.sistemaboleto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glpv.sistemaboleto.domain.Banco;
import com.glpv.sistemaboleto.repositories.BancoRepository;

@Service
public class BancoService {

	@Autowired
	private BancoRepository repo;
	
	public Banco buscar(Integer id) {
		Banco obj = repo.findOne(id);
		
		return obj;
	}
}
