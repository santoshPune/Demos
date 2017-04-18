package com.aits.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aits.admin.service.AdminPincodeManageService;
import com.aits.dto.PincodeMasterDto;
import com.aits.model.PincodeMaster;


@RestController
public class AdminPincodeManageController {

	@Autowired
	private AdminPincodeManageService adminPincodeSvc;

	@RequestMapping(value="addPincode",method=RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public PincodeMasterDto addPincode(@RequestBody PincodeMasterDto pincodeMasterDto){
     
		if(pincodeMasterDto.getPincodeId()==0){
		adminPincodeSvc.addPincode(pincodeMasterDto);
		}else{
			adminPincodeSvc.updatePincode(pincodeMasterDto);
		}
		
      	return pincodeMasterDto;
	}

	@RequestMapping(value="updatePincode",method=RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public PincodeMasterDto editPincode(@RequestBody PincodeMasterDto pincodeMasterDto){

		PincodeMasterDto pincodeMasterDto1=adminPincodeSvc.getPincodeById(pincodeMasterDto.getPincodeId());

		return pincodeMasterDto1;
	}

	@RequestMapping(value="deletePincode",method=RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public PincodeMasterDto deletePincode(@RequestBody PincodeMasterDto pincodeMasterDto){



		return pincodeMasterDto;
	}



	
}
