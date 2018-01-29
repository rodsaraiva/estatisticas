package com.github.rodsaraiva.estatisticas.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class Jogador implements UserDetails{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String psn;
	
	private String email;
	private String senha;

	@OneToMany(fetch=FetchType.EAGER)
	private List<Role> roles = new ArrayList<Role>();

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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.roles;
	}
	@Override
	public String getPassword() {
		return this.senha;
	}
	@Override
	public String getUsername() {
		return this.psn;
	}
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	@Override
	public boolean isEnabled() {
		return true;
	}
	
	
}
