package com.github.rodsaraiva.estatisticas.controller;

import org.mindrot.jbcrypt.BCrypt;
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
	
	@RequestMapping("/jogador/new")
	public String cadastra() {
		
		return "cadastrarJogador";
	}
	 
	@RequestMapping(method=RequestMethod.POST, path="/jogador/save")
	public String salvar(Jogador jogador) {
		
		String hashed = BCrypt.hashpw(jogador.getPassword(), BCrypt.gensalt());
		
		jogador.setSenha(hashed);
		repository.save(jogador);
		
		return "login";
	}

	@RequestMapping("/estatisticas/new")
	public String estatistica() {
		
		return "cadastrarEstatisticas";
	}
}
