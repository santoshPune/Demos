package com.aits.admin.service.implement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aits.admin.dao.AdminStateManageDao;
import com.aits.admin.service.AdminStateManageService;
import com.aits.dto.StateMasterDto;
import com.aits.model.StateMaster;

@Service
@Transactional
public class AdminStateManageServiceImpl implements AdminStateManageService {

	@Autowired
	private AdminStateManageDao adminStateDao;

	@Override
	public List<StateMaster> allStates() {
		return adminStateDao.allStates();
	}

	@Override
	public void addState(StateMasterDto stateMasterDto) {

		StateMaster stateMaster=new StateMaster();
		stateMaster.setIsActive("A");
		stateMaster.setStateName(stateMasterDto.getStateName());
		adminStateDao.addState(stateMaster);
	}
	@Override
	public void deleteState(int stateId) {
		adminStateDao.deleteState(stateId);
	}
	@Override
	public StateMasterDto getStateById(int stateId) {
		// TODO Auto-generated method stub
		StateMaster stateMaster=adminStateDao.getStateById(stateId);
		StateMasterDto stateMasterDto=new StateMasterDto();

		stateMasterDto.setStateId(stateMaster.getStateId());
		stateMasterDto.setStateName(stateMaster.getStateName());
		return stateMasterDto;
	}

	@Override
	public void updateState(StateMasterDto stateMasterDto) {
		// TODO Auto-generated method stub
		StateMaster stateMaster=new StateMaster();
		
		stateMaster.setStateId(stateMasterDto.getStateId());
		stateMaster.setStateName(stateMasterDto.getStateName());
		
		adminStateDao.updateState(stateMaster);
		
	}



}
