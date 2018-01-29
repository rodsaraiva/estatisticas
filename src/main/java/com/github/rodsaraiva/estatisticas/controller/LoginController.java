package com.github.rodsaraiva.estatisticas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

//	@Autowired
//	private LoginService service;
	
//	@RequestMapping("/login")
	public String login() {
		
		return "login";
	}
	
//	@RequestMapping(method=RequestMethod.POST, path="/login")
//	public String autenticar(Login login, Model model) {
//		
//		System.out.println(login.getPsn());
//		
//		boolean autenticado = service.autentica(login);
//		
//		if (autenticado) {
//			
//			System.out.println("sucesso");
//			return "perfil";
//			
//		}
//		
//		model.addAttribute("message", "Usuário ou senha inválidos");
//
//		return "login";
//	}
	
}
