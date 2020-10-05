package com.app.rfs.camunda.api_gateway.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.app.rfs.camunda.api_gateway.config.interceptor.TokenInterceptor;
import com.app.rfs.camunda.api_gateway.constants.APIEntryPointConstants;
import com.app.rfs.camunda.api_gateway.services.LoginService;

@Configuration
public class ApiConfig implements WebMvcConfigurer {

	@Autowired
	private LoginService loginService;

	@Bean(APIEntryPointConstants.TOKEN_INTERCEPTOR_REST_TEMPLATE)
	public RestTemplate getRestTemplateWithTokenHeaderInterceptor() {
		RestTemplate restTemplate = new RestTemplate();
		List<ClientHttpRequestInterceptor> interceptors = restTemplate.getInterceptors();
		if (CollectionUtils.isEmpty(interceptors)) {
			interceptors = new ArrayList<>();
		}
		interceptors.add(new TokenInterceptor(loginService));
		restTemplate.setInterceptors(interceptors);
		return restTemplate;
	}

	@Bean(APIEntryPointConstants.REST_TEMPLATE)
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
