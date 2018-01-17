package com.github.rodsaraiva.estatisticas.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Jogador {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	//valor unico
	private String psn;
	
	private String email;
	private String senha;
	
	private Boolean comTime;
	
	@ManyToOne
	private Time time;
	
	@Enumerated(EnumType.STRING)
	private Posicao posicao1;
	
	@Enumerated(EnumType.STRING)
	private Posicao posicao2;
	

	public Long getId() {
		return id;
	}

	public String getPsn() {
		return psn;
	}
	public void setPsn(String psn) {
		this.psn = psn;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean getComTime() {
		return comTime;
	}
	public void setComTime(Boolean comTime) {
		this.comTime = comTime;
	}

	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}

	public Posicao getPosicao1() {
		return posicao1;
	}
	public void setPosicao1(Posicao posicao1) {
		this.posicao1 = posicao1;
	}

	public Posicao getPosicao2() {
		return posicao2;
	}
	public void setPosicao2(Posicao posicao2) {
		this.posicao2 = posicao2;
	}
	
}
