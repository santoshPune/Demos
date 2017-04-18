package com.aits.admin.service;

import java.util.List;

import com.aits.dto.CityMasterDto;
import com.aits.model.CityMaster;

public interface AdminCityManageService {

	
	public List getAllCity();
	public void addCity(CityMasterDto cityMasterDto);
    public CityMasterDto getCityById(int cityId);
    public void updateCity(CityMasterDto cityMasterDto);
    public void deleteCity(int cityId);
}
