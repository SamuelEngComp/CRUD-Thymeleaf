package com.crudthymeleaf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Computador {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String sistemaOperacional;
	
	private String processador;
	
	private String nomeComputador;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public String getNomeComputador() {
		return nomeComputador;
	}

	public void setNomeComputador(String nomeComputador) {
		this.nomeComputador = nomeComputador;
	}
	
}
