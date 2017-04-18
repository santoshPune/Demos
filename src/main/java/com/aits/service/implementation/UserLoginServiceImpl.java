package com.aits.service.implementation;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aits.dao.UserLoginDao;
import com.aits.dto.EndUserDetailsDto;
import com.aits.model.EndUserDetails;
import com.aits.service.UserLoginService;

@Service
public class UserLoginServiceImpl implements UserLoginService {

	@Autowired
	private UserLoginDao userLoginDao;


	@Override
	@Transactional
	public void userLogin(EndUserDetailsDto endUserDetailsDto) {

		EndUserDetails endUserDetails = new EndUserDetails();
		endUserDetails.setUserEmailId(endUserDetailsDto.getUserEmailId());
		endUserDetails.setUserPassword(endUserDetailsDto.getUserPassword());
		userLoginDao.userLogin(endUserDetails);

		endUserDetailsDto.setEndUserId(endUserDetails.getEndUserId());
		endUserDetailsDto.setOneTimePassword(endUserDetails.getOneTimePassword());
		endUserDetailsDto.setUserAge(endUserDetails.getUserAge());
		endUserDetailsDto.setUserDateOfBirth(endUserDetails.getUserDateOfBirth());
		endUserDetailsDto.setUserEmailId(endUserDetails.getUserEmailId());
		endUserDetailsDto.setUserFirstName(endUserDetails.getUserFirstName());
		endUserDetailsDto.setUserGender(endUserDetails.getUserGender());
		endUserDetailsDto.setUserLastName(endUserDetails.getUserLastName());
		endUserDetailsDto.setUserMobileNumber(endUserDetails.getUserMobileNumber());
		endUserDetailsDto.setAddressMaster(endUserDetails.getAddressMaster());


	}

}
