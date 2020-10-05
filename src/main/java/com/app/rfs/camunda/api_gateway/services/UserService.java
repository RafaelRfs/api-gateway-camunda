package com.app.rfs.camunda.api_gateway.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import com.app.rfs.camunda.api_gateway.constants.APIEntryPointConstants;
import com.app.rfs.camunda.api_gateway.domain.LoginDomain;

@Service
@Transactional
public class UserService {
	
	@Autowired 
	@Qualifier(APIEntryPointConstants.TOKEN_INTERCEPTOR_REST_TEMPLATE)
	private RestTemplate restTemplate;
	
	@Value("${api.login.url_create}")
	private String urlCreate;
	
	public LoginDomain createUser(LoginDomain user) {
		
		ResponseEntity<LoginDomain> response = restTemplate.exchange(urlCreate, 
				HttpMethod.PUT,
				new HttpEntity(user,null)
				,LoginDomain.class);
		
		user = response.getBody();
		
		return user;
	}
	

}
