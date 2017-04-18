package com.aits.controller;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aits.constant.AppConstant;
import com.aits.dto.EndUserDetailsDto;
import com.aits.dto.demoDto;
import com.aits.model.EndUserDetails;
import com.aits.service.UserLoginService;

@RestController
public class UserLoginController implements AppConstant{
	
	@Autowired
	private UserLoginService userLoginService;
	
	@RequestMapping(value=USER_LOGIN, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public EndUserDetailsDto userLogin(@RequestBody EndUserDetailsDto endUserDetailsDto) {
		userLoginService.userLogin(endUserDetailsDto);
		return endUserDetailsDto;
	}
	
	@RequestMapping(value="userLogindemo", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public demoDto userLoginDemo(@RequestBody EndUserDetailsDto endUserDetailsDto) {
		
		
		demoDto demoDto = new demoDto();
		List<EndUserDetailsDto> listEndUserDetailsDto = new ArrayList<EndUserDetailsDto>();
		userLoginService.userLogin(endUserDetailsDto);
		listEndUserDetailsDto.add(endUserDetailsDto);
		demoDto.setListEndUserDetailsDto(listEndUserDetailsDto);
		return demoDto;
	}
	

}
