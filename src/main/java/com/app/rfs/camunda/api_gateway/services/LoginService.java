package com.app.rfs.camunda.api_gateway.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.app.rfs.camunda.api_gateway.domain.LoginDomain;
import com.app.rfs.camunda.api_gateway.domain.TokenResponse;

@Service
@Transactional
public class LoginService {
	
	@Value("${api.login.client_id}")
	private String clientId;
	
	@Value("${api.login.client_secret}")
	private String clientSecret;
	
	@Value("${api.login.url}")
	private String url;
	
	@Value("${api.login.header_client_id}")
	private String headerClientId;
	
	@Value("${api.login.header_client_secret}")
	private String headerClientSecret;
	
	public String getToken() {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set(this.headerClientId, this.clientId);
		headers.set(this.headerClientSecret, this.clientSecret);
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity httpEntity = new HttpEntity(null, headers);
		ResponseEntity<TokenResponse> responseEntity = restTemplate.exchange(url,
				HttpMethod.POST, httpEntity,TokenResponse.class);
		
		return responseEntity.getStatusCode().equals(HttpStatus.OK)
				?responseEntity.getBody().getJwt() : null;
	}
	

}
