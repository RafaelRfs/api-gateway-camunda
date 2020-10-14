package com.app.rfs.camunda.api_gateway.executions;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngineServices;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.runtime.Incident;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.value.TypedValue;
import org.camunda.bpm.model.bpmn.BpmnModelInstance;
import org.camunda.bpm.model.bpmn.instance.FlowElement;

public class LoginExecution implements DelegateExecution{

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEventName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getBusinessKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVariableScopeKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getVariables() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VariableMap getVariablesTyped() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VariableMap getVariablesTyped(boolean deserializeValues) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getVariablesLocal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VariableMap getVariablesLocalTyped() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VariableMap getVariablesLocalTyped(boolean deserializeValues) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getVariable(String variableName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getVariableLocal(String variableName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends TypedValue> T getVariableTyped(String variableName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends TypedValue> T getVariableTyped(String variableName, boolean deserializeValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends TypedValue> T getVariableLocalTyped(String variableName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends TypedValue> T getVariableLocalTyped(String variableName, boolean deserializeValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getVariableNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getVariableNamesLocal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setVariable(String variableName, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVariableLocal(String variableName, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVariables(Map<String, ? extends Object> variables) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVariablesLocal(Map<String, ? extends Object> variables) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasVariables() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasVariablesLocal() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasVariable(String variableName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasVariableLocal(String variableName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeVariable(String variableName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeVariableLocal(String variableName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeVariables(Collection<String> variableNames) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeVariablesLocal(Collection<String> variableNames) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeVariables() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeVariablesLocal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BpmnModelInstance getBpmnModelInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FlowElement getBpmnModelElementInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProcessEngineServices getProcessEngineServices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProcessEngine getProcessEngine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProcessInstanceId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProcessBusinessKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setProcessBusinessKey(String businessKey) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getProcessDefinitionId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getParentId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCurrentActivityId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCurrentActivityName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getActivityInstanceId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getParentActivityInstanceId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCurrentTransitionId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DelegateExecution getProcessInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DelegateExecution getSuperExecution() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCanceled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getTenantId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setVariable(String variableName, Object value, String activityId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Incident createIncident(String incidentType, String configuration) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Incident createIncident(String incidentType, String configuration, String message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void resolveIncident(String incidentId) {
		// TODO Auto-generated method stub
		
	}

}
