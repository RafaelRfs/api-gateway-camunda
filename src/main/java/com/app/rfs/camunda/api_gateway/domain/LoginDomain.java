package com.app.rfs.camunda.api_gateway.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDomain {
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
	private Boolean isActive;
	private String token;
	private String refreshToken;
	private Boolean isUpdated;
}
