package com.glpv.sistemaboleto.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Banco implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idbanco;
	private String nome;
	
	public Banco() {
		
	}

	public Banco(Integer idbanco, String nome) {
		super();
		this.idbanco = idbanco;
		this.nome = nome;
	}

	public Integer getIdbanco() {
		return idbanco;
	}

	public void setIdbanco(Integer idbanco) {
		this.idbanco = idbanco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idbanco == null) ? 0 : idbanco.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banco other = (Banco) obj;
		if (idbanco == null) {
			if (other.idbanco != null)
				return false;
		} else if (!idbanco.equals(other.idbanco))
			return false;
		return true;
	}
	
}
