package com.crudthymeleaf.controller;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crudthymeleaf.model.Computador;
import com.crudthymeleaf.service.ComputadorService;

@Controller
public class ComputadorController {
	
	@Autowired
	private ComputadorService computadorService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/computadores",method=RequestMethod.GET)
	public ModelAndView listarComputadores() {
		
		ModelAndView mv = new ModelAndView("listar");
		mv.addObject("computadores", computadorService.listarTodosComputadores());
		return mv;
	}
	
	@RequestMapping("/adicionar")
	public ModelAndView adicionar(Computador computador) {
		
		ModelAndView mv = new ModelAndView("cadastrar");
		
		mv.addObject("computador", computador);
		
		return mv;
		
	}
	
	@GetMapping("/edit/{id}")
	public ModelAndView editar(@PathVariable("id") Computador computador) {
		
		ModelAndView mv = adicionar(computador);
		
		mv.addObject(computador);
		
		return mv;
	}
	
	@GetMapping("/deletar/{id}")
	public ModelAndView deletar(@PathVariable("id") Integer id) {
		computadorService.remover(id);
		
		return listarComputadores();
		
	}
	
	@RequestMapping(value= "/salvar", method=RequestMethod.POST)
	public ModelAndView salvar(@Valid Computador computador, BindingResult result) {
		if(result.hasErrors()) {
			return adicionar(computador);
		}
		
		computadorService.salvar(computador);
		
		return listarComputadores();
	}
	
	@RequestMapping(value= "/salvar/{id}", method=RequestMethod.POST)
	public ModelAndView salvarEdicao(@Valid Computador computador, BindingResult result) {
		if(result.hasErrors()) {
			return adicionar(computador);
		}
		
		computadorService.salvar(computador);
		
		return listarComputadores();
	}
	

}













