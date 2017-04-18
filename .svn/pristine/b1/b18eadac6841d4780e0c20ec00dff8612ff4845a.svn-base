package com.aits.admin.service.implement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aits.admin.dao.AdminPincodeManageDao;
import com.aits.admin.service.AdminPincodeManageService;
import com.aits.dto.PincodeMasterDto;
import com.aits.model.CityMaster;
import com.aits.model.PincodeMaster;

@Service
@Transactional
public class AdminPincodeManageServiceImpl implements AdminPincodeManageService {

	@Autowired
	private AdminPincodeManageDao adminPincodeDAO;

	@Override
	public List getAllPincode() {
		return adminPincodeDAO.getAllPincode();
	}

	@Override
	public void addPincode(PincodeMasterDto pincodeMasterDto) {



		PincodeMaster pincodeMaster=new PincodeMaster();
		pincodeMaster.setPincode(pincodeMasterDto.getPincode());

		CityMaster cityMaster=new CityMaster();

		cityMaster.setCityId(pincodeMasterDto.getCityMaster().getCityId());

		pincodeMaster.setCityMaster(cityMaster);



		adminPincodeDAO.addPincode(pincodeMaster);
	}

	@Override
	public PincodeMasterDto getPincodeById(int pincodeId) {
		PincodeMaster pincodeMaster=	adminPincodeDAO.getPincodeById(pincodeId);
		PincodeMasterDto pincodeMasterDto=new PincodeMasterDto();

		pincodeMasterDto.setPincodeId(pincodeMaster.getPincodeId());
		pincodeMasterDto.setPincode(pincodeMaster.getPincode());

		CityMaster cityMaster=new CityMaster();
		cityMaster.setCityId(pincodeMaster.getCityMaster().getCityId());

		pincodeMasterDto.setCityMaster(cityMaster);

		return pincodeMasterDto;
	}

	@Override
	public void updatePincode(PincodeMasterDto pincodeMasterDto) {

		PincodeMaster pincodeMaster=new PincodeMaster();
		pincodeMaster.setPincodeId(pincodeMasterDto.getPincodeId());
		pincodeMaster.setPincode(pincodeMasterDto.getPincode());

		CityMaster cityMaster=new CityMaster();
		cityMaster.setCityId(pincodeMaster.getCityMaster().getCityId());


		pincodeMaster.setCityMaster(cityMaster);
		adminPincodeDAO.updatePincode(pincodeMaster);
	}

	@Override
	public void deletePincode(int pincodeId) {

		adminPincodeDAO.deletePincode(pincodeId);
	}

}
