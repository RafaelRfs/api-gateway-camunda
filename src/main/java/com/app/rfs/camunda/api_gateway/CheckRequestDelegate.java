package com.app.rfs.camunda.api_gateway;

import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CheckRequestDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		execution.setVariable("name","Tester");
		execution.setVariable("isRequestLogin", (new Random()).nextBoolean());
		
	}

}
