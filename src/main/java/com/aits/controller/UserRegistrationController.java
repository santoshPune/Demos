package com.aits.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.aits.constant.AppConstant;
import com.aits.dto.EndUserDetailsDto;
import com.aits.model.AddressMaster;
import com.aits.model.PincodeMaster;
import com.aits.service.UserRegistrationService;


@RestController
public class UserRegistrationController implements AppConstant {

	@Autowired
	public UserRegistrationService userRegistrationService;

	@RequestMapping(value = USER_PARTIALREGISTRATION, method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public EndUserDetailsDto partialRegistration(@RequestBody EndUserDetailsDto endUserDetailsDto) {
						
		userRegistrationService.partialRegistration(endUserDetailsDto);
				
		return endUserDetailsDto;
	}
	@RequestMapping(value = USER_CENTRALREGISTRATION, method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public EndUserDetailsDto centeralRegistration(@RequestBody EndUserDetailsDto endUserDetailsDto){
		
		userRegistrationService.centralRegistration(endUserDetailsDto);
				
		return endUserDetailsDto;
	}

	@RequestMapping(value = USER_FINALREGISTRATION, method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public EndUserDetailsDto finalRegistration(@RequestBody EndUserDetailsDto endUserDetailsDto){
		
		AddressMaster addressMaster=new AddressMaster();
		addressMaster.setAddressLine1(endUserDetailsDto.getAddressMaster().getAddressLine1());
	
		PincodeMaster pincodeMaster=new PincodeMaster();
				
		pincodeMaster.setPincodeId(endUserDetailsDto.getAddressMaster().getPincodeMaster().getPincodeId());
		addressMaster.setPincodeMaster(pincodeMaster);
		
		int addressId=userRegistrationService.saveAddress(addressMaster);
		
		
		addressMaster.setAddressId(addressId);
		endUserDetailsDto.setAddressMaster(addressMaster);
		
		userRegistrationService.finalRegistration(endUserDetailsDto);
		return endUserDetailsDto;
	}
}
