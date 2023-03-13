package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//indica para o spring que essa é uma classe controlladora
@RestController


//indica um endpoint para nossa aplicação
@RequestMapping("/hello/bsm/objetivo")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Alo mundão";
	}
	@GetMapping("/bsm")
	public String bsm() {
		return "BSM "
				+ "- Atenção aos detalhes " 
				+ "- Persistência "
				+ "- Mentalidade de Crescimento "
				+ "- Orientação ao Futuro "
				+ "- Responsabilidade Pessoal "
				+ "- Trabalho em Equipe "
				+ "- Comunicação "
				+ "- Comunicação Não Violenta "
				+ "- Atenção para Detalhes "
				+ "- Proatividade ";
	}
	@GetMapping("/objetivo")
	public String objetivo() {
		return "Objetivos "
				+ "- Gestão de tempo "
				+ "- Organização";
	}
	
}
