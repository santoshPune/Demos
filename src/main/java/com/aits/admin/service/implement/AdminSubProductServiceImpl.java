package com.aits.admin.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aits.admin.dao.AdminSubProductDao;
import com.aits.admin.service.AdminSubProductService;
import com.aits.dto.SubProductMasterDto;
import com.aits.model.SubCategoryMaster;
import com.aits.model.SubProductMaster;

@Service("AdminSubProductService")
public class AdminSubProductServiceImpl implements AdminSubProductService {

	@Autowired
	private AdminSubProductDao adminSubProductDao;

	public void setAdminSubProductDao(AdminSubProductDao adminSubProductDao) {
		this.adminSubProductDao = adminSubProductDao;
	}

	@Override
	public void getSubProductMasterListService(SubProductMasterDto subProductMasterDto) {
		SubProductMaster subProductMaster=new SubProductMaster();
		adminSubProductDao.getSubProductMasterList(subProductMaster);
		subProductMasterDto.setSubProductMasterList(subProductMaster.getSubProductMasterList());
		List<SubProductMaster> subProductMasterDtoList=subProductMasterDto.getSubProductMasterList();
	   
	}

	@Override
	public void insertSubProductMasterInformationService(SubProductMasterDto subProductMasterDto) {
		SubProductMaster subProductMaster=new SubProductMaster();
		subProductMaster.setSubProductName(subProductMasterDto.getSubProductName());
		subProductMaster.setSubProductColor(subProductMasterDto.getSubProductColor());
		subProductMaster.setSubProductPrice(subProductMasterDto.getSubProductPrice());
		subProductMaster.setSubProductWeigth(subProductMasterDto.getSubProductWeigth());
		subProductMaster.setSubProductQuantity(subProductMasterDto.getSubProductQuantity());
		subProductMaster.setIsActive("I");
		subProductMaster.setProductMaster(subProductMasterDto.getProductMaster());
		adminSubProductDao.insertSubProductMasterInformation(subProductMaster);
	}

	@Override
	public void getSubProductMasterInformationByIdService(SubProductMasterDto subProductMasterDto) {
		SubProductMaster subProductMaster=new SubProductMaster();
		subProductMaster.setSubProductId(subProductMasterDto.getSubProductId());
		adminSubProductDao.getSubProductMasterInformationById(subProductMaster);
		
		subProductMasterDto.setSubProductName(subProductMaster.getSubProductName());
		subProductMasterDto.setSubProductColor(subProductMaster.getSubProductColor());
		subProductMasterDto.setSubProductPrice(subProductMaster.getSubProductPrice());
		subProductMasterDto.setSubProductQuantity(subProductMaster.getSubProductQuantity());
		subProductMasterDto.setSubProductWeigth(subProductMaster.getSubProductWeigth());
		subProductMasterDto.setIsActive(subProductMaster.getIsActive());
		subProductMasterDto.setProductMaster(subProductMaster.getProductMaster());
	}

	@Override
	public void updateSubProductMasterInformationService(SubProductMasterDto subProductMasterDto) {
		SubProductMaster subProductMaster=new SubProductMaster();
		subProductMaster.setSubProductId(subProductMasterDto.getSubProductId());
		subProductMaster.setSubProductName(subProductMasterDto.getSubProductName());
		subProductMaster.setSubProductColor(subProductMasterDto.getSubProductColor());
		subProductMaster.setSubProductPrice(subProductMasterDto.getSubProductPrice());
		subProductMaster.setSubProductQuantity(subProductMasterDto.getSubProductQuantity());
		subProductMaster.setSubProductWeigth(subProductMasterDto.getSubProductWeigth());
		subProductMaster.setIsActive(subProductMasterDto.getIsActive());
		subProductMaster.setProductMaster(subProductMasterDto.getProductMaster());
		 
		 adminSubProductDao.updateSubProductMasterInformation(subProductMaster);
		
	}

	@Override
	public void getActiveSubProductMasterListService(SubProductMasterDto subProductMasterDto) {
		SubProductMaster subProductMaster=new SubProductMaster();
		adminSubProductDao.getActiveSubProductMasterList(subProductMaster);
		subProductMasterDto.setSubProductMasterList(subProductMaster.getSubProductMasterList());
		List<SubProductMaster> subProductMasterDtoList=subProductMasterDto.getSubProductMasterList();
		
	}

	@Override
	public void deleteSubProductMasterInformationService(SubProductMasterDto subProductMasterDto) {
		SubProductMaster subProductMaster=new SubProductMaster();
		subProductMaster.setSubProductId(subProductMasterDto.getSubProductId());
		adminSubProductDao.getSubProductMasterInformationById(subProductMaster);
		subProductMaster.setIsActive("I");
		adminSubProductDao.deleteSubProductMasterInformation(subProductMaster);
		
	}
	
	
}
