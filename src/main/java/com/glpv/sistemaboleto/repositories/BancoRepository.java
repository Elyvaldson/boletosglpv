package com.glpv.sistemaboleto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glpv.sistemaboleto.domain.Banco;

@Repository
public interface BancoRepository extends JpaRepository<Banco, Integer> {

}
