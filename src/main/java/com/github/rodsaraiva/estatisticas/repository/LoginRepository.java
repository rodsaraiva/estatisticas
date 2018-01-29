package com.github.rodsaraiva.estatisticas.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.github.rodsaraiva.estatisticas.model.Jogador;

public interface LoginRepository extends Repository<Jogador, Long> {

	List<Jogador> findByPsnAndSenha (String psn, String senha);
	
	Jogador findByPsn (String psn);
	
}