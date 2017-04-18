package com.aits.admin.service;

import com.aits.dto.CategoryMasterDto;

public interface AdminCategoryService {

	void getCategoryMasterListService(CategoryMasterDto categoryMasterDto);

	void insertCategoryMasterInformationService(CategoryMasterDto categoryMasterDto);

	void getCategoryMasterInformationByIdService(CategoryMasterDto categoryMasterDto);

	void updateCategoryMasterInformationService(CategoryMasterDto categoryMasterDto);

	void deleteCategoryMasterInformationService(CategoryMasterDto categoryMasterDto);

	void getActiveCategoryMasterListService(CategoryMasterDto categoryMasterDto);

}
