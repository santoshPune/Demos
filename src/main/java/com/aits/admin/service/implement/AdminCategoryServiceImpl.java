package com.aits.admin.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aits.admin.dao.AdminCategoryDao;
import com.aits.admin.service.AdminCategoryService;
import com.aits.dto.CategoryMasterDto;
import com.aits.model.CategoryMaster;
@Service("AdminCategoryService")
public class AdminCategoryServiceImpl implements AdminCategoryService {
    @Autowired
	private AdminCategoryDao adminCategoryDao;

	public void setAdminCategoryDao(AdminCategoryDao adminCategoryDao) {
		this.adminCategoryDao = adminCategoryDao;
	}

	@Override
	public void getCategoryMasterListService(CategoryMasterDto categoryMasterDto) {
		CategoryMaster categoryMaster=new CategoryMaster();
		adminCategoryDao.getCategoryList(categoryMaster);
		categoryMasterDto.setCategoryMasterList(categoryMaster.getCategoryMasterList());
		
	}

	@Override
	public void insertCategoryMasterInformationService(CategoryMasterDto categoryMasterDto) {
		CategoryMaster categoryMaster=new CategoryMaster();
		categoryMaster.setCategoryMasterName(categoryMasterDto.getCategoryMasterName());
	    categoryMaster.setIsActive("I");
	 
	    adminCategoryDao.insertCategoryMasterInformation(categoryMaster);
		
	}

	@Override
	public void getCategoryMasterInformationByIdService(CategoryMasterDto categoryMasterDto) {
		CategoryMaster categoryMaster=new CategoryMaster();
		categoryMaster.setCategoryMasterId(categoryMasterDto.getCategoryMasterId());
		
		adminCategoryDao.getCategoryMasterInformationById(categoryMaster);
		
		categoryMasterDto.setCategoryMasterName(categoryMaster.getCategoryMasterName());
		categoryMasterDto.setIsActive(categoryMaster.getIsActive());
		
	}

	@Override
	public void updateCategoryMasterInformationService(CategoryMasterDto categoryMasterDto) {
		CategoryMaster categoryMaster=new CategoryMaster();
		categoryMaster.setCategoryMasterId(categoryMasterDto.getCategoryMasterId());
		categoryMaster.setCategoryMasterName(categoryMasterDto.getCategoryMasterName());
	    categoryMaster.setIsActive(categoryMasterDto.getIsActive());
	    
	    adminCategoryDao.updateCategoryMasterInformation(categoryMaster);
		
	}

	@Override
	public void deleteCategoryMasterInformationService(CategoryMasterDto categoryMasterDto) {
		CategoryMaster categoryMaster=new CategoryMaster();
		categoryMaster.setCategoryMasterId(categoryMasterDto.getCategoryMasterId());
		adminCategoryDao.getCategoryMasterInformationById(categoryMaster);
		categoryMaster.setIsActive("I");
	    adminCategoryDao.updateCategoryMasterInformation(categoryMaster);
		
	}

	@Override
	public void getActiveCategoryMasterListService(CategoryMasterDto categoryMasterDto) {
		CategoryMaster categoryMaster=new CategoryMaster();
		adminCategoryDao.getActiveCategoryList(categoryMaster);
		categoryMasterDto.setCategoryMasterList(categoryMaster.getCategoryMasterList());
		
	}

	
	
    
   
}
