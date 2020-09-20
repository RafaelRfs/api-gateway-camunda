package com.app.rfs.camunda.api_gateway;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ProcessRequestDelegate implements  JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("REQUEST USER >>"+execution.getVariable("name")+" ola mundo Camunda");
	}

}
