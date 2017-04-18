package com.aits.admin.service;

import java.util.List;

import com.aits.dto.AddressMasterDto;

import com.aits.model.AddressMaster;

public interface AdminAddressLineManageService {



	public List getAllAddressLine();
	public void addAddressLine(AddressMasterDto addressMasterDto);
	public AddressMasterDto getAddressLineById(int cityId);
	public void updateAddressLine(AddressMasterDto addressMasterDto);
	public void deleteAddressLine(int cityId);
}
