package com.app.rfs.camunda.api_gateway.controllers;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.impl.persistence.entity.HistoricVariableInstanceEntity;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.app.rfs.camunda.api_gateway.domain.LoginDomain;

@RestController
@RequestMapping("/v1/")
public class CamundaController {
	
	 @Autowired ProcessEngine processEngine;
	
	
	@PostMapping("/camunda")
	public ResponseEntity processCamunda(@RequestBody LoginDomain body) {
		
		ProcessInstance processInstance = processEngine.getRuntimeService()
				.startProcessInstanceByKey("Process_09ei5r3");
		
		 HistoricVariableInstanceEntity variable = (HistoricVariableInstanceEntity) processEngine.getHistoryService()
	                .createHistoricVariableInstanceQuery()
	                .processInstanceId(processInstance.getId())
	                .variableName("globalError").singleResult();
	        if(variable != null)
	           throw new ResponseStatusException(HttpStatus.BAD_REQUEST, processInstance.getId() +" "+variable.getTextValue());
		
		return new ResponseEntity<>("ook", HttpStatus.OK);
		
	}

}
