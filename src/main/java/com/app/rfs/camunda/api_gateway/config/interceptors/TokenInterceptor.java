package com.app.rfs.camunda.api_gateway.config.interceptors;

import java.io.IOException;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import com.app.rfs.camunda.api_gateway.services.LoginService;

public class TokenInterceptor  implements ClientHttpRequestInterceptor{
	
	private LoginService loginService;
	
	public TokenInterceptor(LoginService lgnSrv) {
		this.loginService = lgnSrv;
	}

	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {
		request.getHeaders().setBearerAuth(loginService.getToken());
		return  execution.execute(request,body);
	}

}
