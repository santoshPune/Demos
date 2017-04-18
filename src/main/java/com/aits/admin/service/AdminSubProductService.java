package com.aits.admin.service;

import com.aits.dto.SubProductMasterDto;

public interface AdminSubProductService {

	void getSubProductMasterListService(SubProductMasterDto subProductMasterDto);

	void insertSubProductMasterInformationService(SubProductMasterDto subProductMasterDto);

	void getSubProductMasterInformationByIdService(SubProductMasterDto subProductMasterDto);

	void updateSubProductMasterInformationService(SubProductMasterDto subProductMasterDto);

	void getActiveSubProductMasterListService(SubProductMasterDto subProductMasterDto);

	void deleteSubProductMasterInformationService(SubProductMasterDto subProductMasterDto);

}
