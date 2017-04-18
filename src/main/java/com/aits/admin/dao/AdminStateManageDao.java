package com.aits.admin.dao;

import java.util.List;

import com.aits.model.StateMaster;

public interface AdminStateManageDao {
	public List<StateMaster> allStates();
	public void addState(StateMaster stateMaster);
	public void deleteState(int  stateId);
	public StateMaster getStateById(int stateId);
	public void updateState(StateMaster stateMaster);

}
