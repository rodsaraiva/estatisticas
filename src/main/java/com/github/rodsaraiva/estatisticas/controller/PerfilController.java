package com.github.rodsaraiva.estatisticas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PerfilController {

	@RequestMapping("/jogador/perfil")
	public String perfil() {
		
		return "perfil";
	}
	
}
