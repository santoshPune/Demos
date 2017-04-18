package com.aits.admin.dao;

import com.aits.model.SubCategoryMaster;

public interface AdminSubCategoryMasterDao {

	void getSubCategoryMasterList(SubCategoryMaster subCategoryMaster);

	void insertSubCategoryMasterInformation(SubCategoryMaster subCategoryMaster);

	void getSubCategoryMasterInformationById(SubCategoryMaster subCategoryMaster);

	void updateSubCategoryMasterInformation(SubCategoryMaster subCategoryMaster);

	void deleteSubCategoryMasterInformation(SubCategoryMaster subCategoryMaster);

	void getActiveSubCategoryMasterList(SubCategoryMaster subCategoryMaster);

}

