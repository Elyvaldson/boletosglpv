package com.glpv.sistemaboleto.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.glpv.sistemaboleto.domain.Banco;
import com.glpv.sistemaboleto.services.BancoService;

@RestController
@RequestMapping(value="/bancos")
public class BancoResource {

	@Autowired
	private BancoService svc;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id){
		Banco obj = svc.buscar(id);
		
		return ResponseEntity.ok().body(obj);
	}
}
