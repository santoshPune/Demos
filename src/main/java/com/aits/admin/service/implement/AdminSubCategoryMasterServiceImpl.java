package com.aits.admin.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aits.admin.dao.AdminSubCategoryMasterDao;
import com.aits.admin.service.AdminSubCategoryMasterService;
import com.aits.dto.SubCategoryMasterDto;
import com.aits.model.CategoryMaster;
import com.aits.model.SubCategoryMaster;

@Service("AdminSubCategoryMasterService")
public class AdminSubCategoryMasterServiceImpl implements AdminSubCategoryMasterService  {
   
	@Autowired
	private AdminSubCategoryMasterDao adminSubCategoryMasterDao;

	public void setAdminSubCategoryMasterDao(AdminSubCategoryMasterDao adminSubCategoryMasterDao) {
		this.adminSubCategoryMasterDao = adminSubCategoryMasterDao;
	}

	@Override
	public void getSubCategoryMasterListService(SubCategoryMasterDto subCategoryMasterDto) {
		SubCategoryMaster subCategoryMaster=new SubCategoryMaster();
		adminSubCategoryMasterDao.getSubCategoryMasterList(subCategoryMaster);
		subCategoryMasterDto.setSubCategoryMasterList(subCategoryMaster.getSubCategoryMasterList());
		
	}

	@Override
	public void insertSubCategoryMasterInformationService(SubCategoryMasterDto subCategoryMasterDto) {
	   SubCategoryMaster subCategoryMaster=new SubCategoryMaster();
	   CategoryMaster categoryMaster=new CategoryMaster();
	   categoryMaster.setCategoryMasterId(subCategoryMasterDto.getCategoryMaster().getCategoryMasterId());
	   
	   subCategoryMaster.setSubCategoryMasterName(subCategoryMasterDto.getSubCategoryMasterName());
	   subCategoryMaster.setIsActive("I");
	   subCategoryMaster.setCategoryMaster(categoryMaster);
		
	   adminSubCategoryMasterDao.insertSubCategoryMasterInformation(subCategoryMaster);
	}

	@Override
	public void getSubCategoryMasterInformationByIdService(SubCategoryMasterDto subCategoryMasterDto) {
		SubCategoryMaster subCategoryMaster=new SubCategoryMaster();
		subCategoryMaster.setSubCategoryMasterId(subCategoryMasterDto.getSubCategoryMasterId());
		adminSubCategoryMasterDao.getSubCategoryMasterInformationById(subCategoryMaster);
		subCategoryMasterDto.setSubCategoryMasterName(subCategoryMaster.getSubCategoryMasterName());
		subCategoryMasterDto.setIsActive(subCategoryMaster.getIsActive());
		subCategoryMasterDto.setCategoryMaster(subCategoryMaster.getCategoryMaster());
		
	}

	@Override
	public void updateSubCategoryMasterInformationService(SubCategoryMasterDto subCategoryMasterDto) {
		SubCategoryMaster subCategoryMaster=new SubCategoryMaster();
		 subCategoryMaster.setSubCategoryMasterId(subCategoryMasterDto.getSubCategoryMasterId());
		 subCategoryMaster.setSubCategoryMasterName(subCategoryMasterDto.getSubCategoryMasterName());
		 subCategoryMaster.setIsActive(subCategoryMasterDto.getIsActive());
		 subCategoryMaster.setCategoryMaster(subCategoryMasterDto.getCategoryMaster());
		 
		 adminSubCategoryMasterDao.updateSubCategoryMasterInformation(subCategoryMaster);
		
	}

	@Override
	public void deleteSubCategoryMasterInformationService(SubCategoryMasterDto subCategoryMasterDto) {
		SubCategoryMaster subCategoryMaster=new SubCategoryMaster();
		subCategoryMaster.setSubCategoryMasterId(subCategoryMasterDto.getSubCategoryMasterId());
		adminSubCategoryMasterDao.getSubCategoryMasterInformationById(subCategoryMaster);
		subCategoryMaster.setIsActive("I");
		adminSubCategoryMasterDao.deleteSubCategoryMasterInformation(subCategoryMaster);
		
	}

	@Override
	public void getActiveSubCategoryMasterListService(SubCategoryMasterDto subCategoryMasterDto) {
	    SubCategoryMaster subCategoryMaster=new SubCategoryMaster();
		adminSubCategoryMasterDao.getActiveSubCategoryMasterList(subCategoryMaster);
		subCategoryMasterDto.setSubCategoryMasterList(subCategoryMaster.getSubCategoryMasterList());
		
	}
	
	
}
