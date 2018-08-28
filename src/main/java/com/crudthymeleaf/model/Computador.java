package com.crudthymeleaf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Computador {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message="Este campo não pode ser vazio ou nulo")
	private String sistemaOperacional;
	
	@NotBlank(message="Este campo não pode ser vazio ou nulo")
	private String processador;
	
	@NotBlank(message="Este campo não pode ser vazio ou nulo")
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
	
	
	public boolean isNovo() {
		return id == null;
	}
	
}
