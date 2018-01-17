package com.github.rodsaraiva.estatisticas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jogador {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String psn;
	
	private String email;
	private String senha;
	
	private Boolean comTime;
	private Time time;
	private Posicao posicao1;
	private Posicao posicao2;
	
}
