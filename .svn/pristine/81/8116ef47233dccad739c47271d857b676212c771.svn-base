package com.aits.admin.service.implement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aits.admin.dao.AdminAddressLineManageDao;
import com.aits.admin.service.AdminAddressLineManageService;
import com.aits.dto.AddressMasterDto;
import com.aits.model.AddressMaster;
import com.aits.model.PincodeMaster;


@Service
@Transactional
public class AdminAddressLineManageServiceImpl implements AdminAddressLineManageService{



	@Autowired
	private AdminAddressLineManageDao addressLineDao;

	@Override
	public List getAllAddressLine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAddressLine(AddressMasterDto addressMasterDto) {
		// TODO Auto-generated method stub

		AddressMaster addressMaster=new AddressMaster();
		addressMaster.setAddressLine1(addressMasterDto.getAddressLine1());
		addressMaster.setAddressLine2(addressMasterDto.getAddressLine2());

		PincodeMaster pincodeMaster=new PincodeMaster();
		pincodeMaster.setPincodeId(addressMasterDto.getPincodeMaster().getPincodeId());

		addressMaster.setPincodeMaster(pincodeMaster);
		addressLineDao.addAddressLine(addressMaster);

	}

	@Override
	public AddressMasterDto getAddressLineById(int addId) {
		// TODO Auto-generated method stub
		AddressMaster addressMaster=addressLineDao.getAddressLineById(addId);
		AddressMasterDto addressMasterDto=new AddressMasterDto();
		
		addressMasterDto.setAddressId(addressMaster.getAddressId());
		addressMasterDto.setAddressLine1(addressMaster.getAddressLine1());
		addressMasterDto.setAddressLine2(addressMaster.getAddressLine2());
		
		PincodeMaster pincodeMaster=new PincodeMaster();
		pincodeMaster.setPincodeId(addressMaster.getPincodeMaster().getPincodeId());
		
		
		addressMasterDto.setPincodeMaster(pincodeMaster);
		
		return addressMasterDto;
	}

	@Override
	public void updateAddressLine(AddressMasterDto addressMasterDto) {
		// TODO Auto-generated method stub

	}
	@Override
	public void deleteAddressLine(int cityId) {
		// TODO Auto-generated method stub

	}


}
