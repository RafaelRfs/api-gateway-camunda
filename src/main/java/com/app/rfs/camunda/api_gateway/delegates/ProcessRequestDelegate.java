package com.app.rfs.camunda.api_gateway.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.app.rfs.camunda.api_gateway.domain.LoginDomain;
import com.app.rfs.camunda.api_gateway.services.UserService;
import com.google.gson.Gson;

@Component
public class ProcessRequestDelegate implements  JavaDelegate {
	
	@Autowired
	private UserService userService;

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("REQUEST USER >>"+execution.getVariable("name")+" ola mundo Camunda");
		String dataJson = new Gson().toJson(execution.getVariables());
		LoginDomain user = new Gson().fromJson(dataJson, LoginDomain.class);
		execution.setVariable("response", userService.createUser(user));
	}

}
