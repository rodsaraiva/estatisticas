//package com.github.rodsaraiva.estatisticas.model;
//
//import java.time.LocalDate;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//import org.springframework.format.annotation.DateTimeFormat;
//
//@Entity
//public class Estatisticas {
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Long id;
//	
//	@DateTimeFormat(pattern="dd/MM/yyyy")
//	private LocalDate data;
//	private Time adversariio;
//	private String competicao;
//	private Posicao posicao;
//	
//	private Double nota;
//	private Integer gols;
//	private Integer assistencias;
//	
//	//PASSES
//	private Integer passesCertos;
//	private Integer totalPasses;
//	private Double porcentagemPasses; //fazer regra de negócio
//	
//	private Integer passesCurtosCertos;
//	private Integer passesCurtosErrados;
//	private Integer totalPassesCurtos; //fazer regra de negocio
//	private Double porcentagemPassesCurtos; //fazer regra de negocio
//	
//	private Integer passesMediosCertos;
//	private Integer passesMediosErrados;
//	private Integer totalPassesMedios; //fazer regra de negocio
//	private Double porcentagemPassesMedios; //fazer regra de negocio
//	
//	private Integer passesLongosCertos;
//	private Integer passesLongosErrados;
//	private Integer totalPassesLongos; //fazer regra de negocio
//	private Double porcentagemPassesLongos; //fazer regra de negocio
//	
//	
//	//FINALIZAÇÕES
//	private Integer finalizacoesCertas;
//	private Integer totalFinalizacoes;
//	private Double porcentagemFinalizacoes; //fazer regra de negócio
//	
//	//DRIBLES
//	private Integer driblesCertos;
//	private Integer totalDribles;
//	private Double porcentagemDribles; //fazer regra de negócio
//	
//	//DIVIDIDAS
//	private Integer divididasCertas;
//	private Integer totalDivididas;
//	private Double porcentagemDivididas; //fazer regra de negócio
//	
//	//CRUZAMENTOS
//	private Integer cruzamentosCertos;
//	private Integer totalCruzamentos;
//	private Double porcentagemCruzamentos; //fazer regra de negócio
//	
//	//CARTÕES
//	private Integer cartoesAmarelos;
//	private Integer cartoesVermelhos;
//	
//	
//}