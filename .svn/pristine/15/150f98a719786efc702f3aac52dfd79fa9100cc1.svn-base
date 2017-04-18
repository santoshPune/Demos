package com.aits.admin.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aits.admin.service.AdminCityManageService;
import com.aits.admin.service.AdminStateManageService;
import com.aits.dto.CityMasterDto;
import com.aits.model.CityMaster;
import com.aits.model.StateMaster;


@RestController
public class AdminCityManageController {

	@Autowired
	private AdminCityManageService adminCitySvc;
	
	@Autowired
	private AdminStateManageService adminStateSVC;


	@RequestMapping(value="saveCity",method=RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public CityMasterDto addCity(@RequestBody CityMasterDto cityMasterDto){
		/*System.out.println("hi to do");
       System.out.println("StateID="+cityMasterDto.getStateMaster().getStateId());
		 */
		if(cityMasterDto.getCityId()==0){
			adminCitySvc.addCity(cityMasterDto);
			StateMaster stateMaster=new StateMaster();
			stateMaster.setStateMasterList(adminStateSVC.allStates());
			cityMasterDto.setStateMaster(stateMaster);
			cityMasterDto.setCityMasterList(adminCitySvc.getAllCity());
			
			
			
		}else{

			adminCitySvc.updateCity(cityMasterDto);

		}
		return cityMasterDto;
	}

	@RequestMapping(value="updateCity",method=RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public CityMasterDto editCity(@RequestBody CityMasterDto cityMasterDto){

		CityMasterDto cityMasterDto1=adminCitySvc.getCityById(cityMasterDto.getCityId());

		return cityMasterDto1;
	}

	@RequestMapping(value="deleteCity",method=RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public CityMasterDto deleteCity(@RequestBody CityMasterDto cityMasterDto){

		adminCitySvc.deleteCity(cityMasterDto.getCityId());


		return cityMasterDto;
	}
}
