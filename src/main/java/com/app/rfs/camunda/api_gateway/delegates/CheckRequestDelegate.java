package com.app.rfs.camunda.api_gateway.delegates;

import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CheckRequestDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		execution.setVariable("name","Tester");
		execution.setVariable("isRequestLogin", true);
		
	}

}
