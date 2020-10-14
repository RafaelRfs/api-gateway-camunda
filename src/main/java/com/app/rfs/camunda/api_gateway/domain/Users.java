package com.app.rfs.camunda.api_gateway.domain;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Users {
	private Integer id;
	private String nome;
	private String sobrenome;
	private String email;
	private String senha;
	private String descricao;
	private String img;
	private String data;
	private String sexo;
	private Integer tipo;
}
