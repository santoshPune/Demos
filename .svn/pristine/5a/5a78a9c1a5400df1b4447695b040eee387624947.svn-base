package com.aits.service.implementation;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aits.dao.UserRegistrationDao;
import com.aits.dto.EndUserDetailsDto;
import com.aits.model.AddressMaster;
import com.aits.model.EndUserDetails;
import com.aits.service.UserRegistrationService;


@Service
@Transactional
public class UserRegistrationServiceImpl implements UserRegistrationService {

	@Autowired
	private UserRegistrationDao userRegistrationDao;

	@Override
	public void partialRegistration(EndUserDetailsDto endUserDetailsDto) {

		EndUserDetails endUserDetails=new EndUserDetails();
		endUserDetails.setUserFirstName(endUserDetailsDto.getUserFirstName());
		endUserDetails.setUserLastName(endUserDetailsDto.getUserLastName());
		endUserDetails.setUserEmailId(endUserDetailsDto.getUserEmailId());
		endUserDetails.setUserPassword(endUserDetailsDto.getUserPassword());

		userRegistrationDao.partialRegistration(endUserDetails);

		endUserDetailsDto.setEndUserId(endUserDetails.getEndUserId());
		endUserDetailsDto.setUserFirstName(endUserDetails.getUserFirstName());
		endUserDetailsDto.setUserLastName(endUserDetails.getUserLastName());
		endUserDetailsDto.setUserEmailId(endUserDetails.getUserEmailId());
		endUserDetailsDto.setUserPassword(endUserDetails.getUserPassword());
	}

	@Override
	public void centralRegistration(EndUserDetailsDto endUserDetailsDto) {
		EndUserDetails endUserDetails=new EndUserDetails();

		endUserDetails.setEndUserId(endUserDetailsDto.getEndUserId());
		endUserDetails.setUserFirstName(endUserDetailsDto.getUserFirstName());
		endUserDetails.setUserLastName(endUserDetailsDto.getUserLastName());
		endUserDetails.setUserEmailId(endUserDetailsDto.getUserEmailId());
		endUserDetails.setUserPassword(endUserDetailsDto.getUserPassword());

		endUserDetails.setOneTimePassword(endUserDetailsDto.getOneTimePassword());
		endUserDetails.setUserMobileNumber(endUserDetailsDto.getUserMobileNumber());
		endUserDetails.setUserAge(endUserDetailsDto.getUserAge());
		endUserDetails.setUserDateOfBirth(endUserDetailsDto.getUserDateOfBirth());

		userRegistrationDao.centralRegistration(endUserDetails);

		endUserDetailsDto.setEndUserId(endUserDetails.getEndUserId());
		endUserDetailsDto.setUserFirstName(endUserDetails.getUserFirstName());
		endUserDetailsDto.setUserLastName(endUserDetails.getUserLastName());
		endUserDetailsDto.setUserEmailId(endUserDetails.getUserEmailId());
		endUserDetailsDto.setUserPassword(endUserDetails.getUserPassword());

		endUserDetailsDto.setOneTimePassword(endUserDetails.getOneTimePassword());
		endUserDetailsDto.setUserMobileNumber(endUserDetails.getUserMobileNumber());
		endUserDetailsDto.setUserAge(endUserDetails.getUserAge());
		endUserDetailsDto.setUserDateOfBirth(endUserDetails.getUserDateOfBirth());


	}

	@Override
	public void finalRegistration(EndUserDetailsDto endUserDetailsDto) {
		EndUserDetails endUserDetails=new EndUserDetails();

		endUserDetails.setEndUserId(endUserDetailsDto.getEndUserId());
		endUserDetails.setEndUserId(endUserDetailsDto.getEndUserId());
		endUserDetails.setUserFirstName(endUserDetailsDto.getUserFirstName());
		endUserDetails.setUserLastName(endUserDetailsDto.getUserLastName());
		endUserDetails.setUserEmailId(endUserDetailsDto.getUserEmailId());
		endUserDetails.setUserPassword(endUserDetailsDto.getUserPassword());

		endUserDetails.setOneTimePassword(endUserDetailsDto.getOneTimePassword());
		endUserDetails.setUserMobileNumber(endUserDetailsDto.getUserMobileNumber());
		endUserDetails.setUserAge(endUserDetailsDto.getUserAge());
		endUserDetails.setUserDateOfBirth(endUserDetailsDto.getUserDateOfBirth());


		endUserDetails.setUserGender(endUserDetailsDto.getUserGender());
		endUserDetails.setAddressMaster(endUserDetailsDto.getAddressMaster());

		userRegistrationDao.finalRegistration(endUserDetails);

		endUserDetailsDto.setEndUserId(endUserDetails.getEndUserId());
		endUserDetailsDto.setUserFirstName(endUserDetails.getUserFirstName());
		endUserDetailsDto.setUserLastName(endUserDetails.getUserLastName());
		endUserDetailsDto.setUserEmailId(endUserDetails.getUserEmailId());
		endUserDetailsDto.setUserPassword(endUserDetails.getUserPassword());

		endUserDetailsDto.setOneTimePassword(endUserDetails.getOneTimePassword());
		endUserDetailsDto.setUserMobileNumber(endUserDetails.getUserMobileNumber());
		endUserDetailsDto.setUserAge(endUserDetails.getUserAge());
		endUserDetailsDto.setUserDateOfBirth(endUserDetails.getUserDateOfBirth());


		endUserDetailsDto.setUserGender(endUserDetails.getUserGender());
		endUserDetailsDto.setAddressMaster(endUserDetails.getAddressMaster());
	}

	@Override
	public int saveAddress(AddressMaster addressMaster) {
		return userRegistrationDao.saveAddress(addressMaster);
	}

}
