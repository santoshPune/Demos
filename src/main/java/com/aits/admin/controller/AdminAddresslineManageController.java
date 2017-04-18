package com.aits.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aits.admin.service.AdminAddressLineManageService;
import com.aits.dto.AddressMasterDto;


@RestController
public class AdminAddresslineManageController {
	
	@Autowired
	private AdminAddressLineManageService addressLineSvc;

	
	@RequestMapping(value="addAddressLine",method=RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public AddressMasterDto addAddressLine(@RequestBody AddressMasterDto addressMasterDto){


		if(addressMasterDto.getAddressId()==0){
			
			addressLineSvc.addAddressLine(addressMasterDto);
			
		}else{

			

		}
		return addressMasterDto;
	}

	@RequestMapping(value="updateAddressLine",method=RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public AddressMasterDto editAddressLine(@RequestBody AddressMasterDto addressMasterDto){

	

		return addressMasterDto;
	}

	@RequestMapping(value="deleteAddressLine",method=RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public AddressMasterDto deleteAddressLine(@RequestBody AddressMasterDto addressMasterDto){

		


		return addressMasterDto;
	}
}
