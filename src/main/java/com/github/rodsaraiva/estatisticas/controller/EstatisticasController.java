package com.github.rodsaraiva.estatisticas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.rodsaraiva.estatisticas.model.Jogador;
import com.github.rodsaraiva.estatisticas.repository.EstatisticasRepository;

@Controller
public class EstatisticasController {

	@Autowired
	private EstatisticasRepository repository;
	
	@RequestMapping("/cadastrarjogador")
	public String cadastra() {
		
		return "cadastrarJogador";
	}
	 
	@RequestMapping(method=RequestMethod.POST, path="/cadastrarJogador")
	public String salvar(Jogador jogador) {
		
		repository.save(jogador);
		
		System.out.println(jogador);
		return "cadastrarJogador";
	}
	
}
