package com.crudthymeleaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudthymeleaf.model.Computador;
import com.crudthymeleaf.repository.ComputadorRepository;

@Service
public class ComputadorService {
	
	@Autowired
	private ComputadorRepository pcRepository;
	
	
	public List<Computador> listarTodosComputadores(){
		/*aqui no metodo deve fazer a validação dos dados antes de retornar, 
		 * como estamos em fase de teste... não é necessário ainda*/
		
		return pcRepository.findAll();
	}

	
	public Computador buscaUmComputador(Integer id) {
		/*aqui no metodo deve fazer a validação dos dados antes de retornar, 
		 * como estamos em fase de teste... não é necessário ainda*/
		
		return pcRepository.findOne(id);
	}
	
	
	public Computador salvar(Computador computador) {
		/*aqui no metodo deve fazer a validação dos dados antes de retornar, 
		 * como estamos em fase de teste... não é necessário ainda*/
		
		return pcRepository.saveAndFlush(computador);
		
	}
	
	
	public void remover(Integer id) {
		/*aqui no metodo deve fazer a validação dos dados antes de retornar, 
		 * como estamos em fase de teste... não é necessário ainda*/
		
		pcRepository.delete(id);
	}

}


















