package com.github.rodsaraiva.estatisticas.repository;

import org.springframework.data.repository.CrudRepository;

import com.github.rodsaraiva.estatisticas.model.Jogador;

public interface EstatisticasRepository extends CrudRepository<Jogador, Long> {

}
