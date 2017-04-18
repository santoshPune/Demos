package com.aits.admin.service.implement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aits.admin.dao.AdminCityManageDao;
import com.aits.admin.dao.AdminStateManageDao;
import com.aits.admin.service.AdminCityManageService;
import com.aits.dto.CityMasterDto;
import com.aits.dto.StateMasterDto;
import com.aits.model.CityMaster;
import com.aits.model.StateMaster;

@Service
@Transactional
public class AdminCityManageServiceImpl implements AdminCityManageService {

	@Autowired
	private AdminCityManageDao adminCityDao;
	
	@Autowired
	private AdminStateManageDao adminStateDao;

	@Override
	public List getAllCity() {
		// TODO Auto-generated method stub
		return adminCityDao.getAllCity();
	}

	@Override
	public void addCity(CityMasterDto cityMasterDto) {
		// TODO Auto-generated method stub

		System.out.println("ID+++"+cityMasterDto.getStateMaster().getStateId());
		CityMaster cityMaster=new CityMaster();
		cityMaster.setCityName(cityMasterDto.getCityName());
        cityMaster.setStateMaster(cityMasterDto.getStateMaster());
		/*StateMaster stateMaster=adminStateDao.getStateById(cityMasterDto.getStateMaster().getStateId());
		
		cityMaster.setStateMaster(stateMaster);*/
		adminCityDao.addCity(cityMaster);
	}

	@Override
	public CityMasterDto getCityById(int cityId) {
		
		CityMaster cityMaster=adminCityDao.getCityById(cityId);
		
		CityMasterDto cityMasterDto=new CityMasterDto();
		cityMasterDto.setCityId(cityMaster.getCityId());
		cityMasterDto.setCityName(cityMaster.getCityName());

		StateMaster stateMaster=new StateMaster();

		stateMaster.setStateId(cityMaster.getStateMaster().getStateId());
		cityMasterDto.setStateMaster(stateMaster);

		return cityMasterDto;

	}

	@Override
	public void updateCity(CityMasterDto cityMasterDto) {
		// TODO Auto-generated method stub
		CityMaster cityMaster=new CityMaster();
		cityMaster.setCityId(cityMasterDto.getCityId());
		cityMaster.setCityName(cityMasterDto.getCityName());
		
		StateMaster stateMaster=new StateMaster();
		stateMaster.setStateId(cityMasterDto.getStateMaster().getStateId());
         
		cityMaster.setStateMaster(stateMaster);


		adminCityDao.updateCity(cityMaster);
	}

	@Override
	public void deleteCity(int cityId) {
		// TODO Auto-generated method stub
		adminCityDao.deleteCity(cityId);
	}

}
