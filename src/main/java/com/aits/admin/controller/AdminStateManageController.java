package com.aits.admin.controller;





import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.aits.admin.service.AdminStateManageService;
import com.aits.dto.StateMasterDto;




@RestController
public class AdminStateManageController {


	@Autowired
	private AdminStateManageService adminStateSvc;

	@RequestMapping(value="saveState",method=RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public StateMasterDto  addState(@RequestBody StateMasterDto stateMasterDto){

		if(stateMasterDto.getStateId()==0){
			
			adminStateSvc.addState(stateMasterDto);
		}else{
			adminStateSvc.updateState(stateMasterDto);
		}
		
		stateMasterDto.setStateMasterList(adminStateSvc.allStates());
		return stateMasterDto;
	}

	
	@RequestMapping(value="adminStates",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public StateMasterDto getStateList(){
		StateMasterDto dto=new StateMasterDto();
		dto.setStateMasterList(adminStateSvc.allStates());
		return dto;
	}


	@RequestMapping(value="editState",method=RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public StateMasterDto editState(@RequestBody StateMasterDto stateMasterDto){


		StateMasterDto stateMasterDtoResult=adminStateSvc.getStateById(stateMasterDto.getStateId());
        stateMasterDtoResult.setStateMasterList(adminStateSvc.allStates());
		return stateMasterDtoResult;
	}

	@RequestMapping(value="deleteState",method=RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public StateMasterDto deleteState(@RequestBody StateMasterDto stateMasterDto){
		adminStateSvc.deleteState(stateMasterDto.getStateId());
		
		stateMasterDto.setStateMasterList(adminStateSvc.allStates());
		return stateMasterDto;
	}
}
