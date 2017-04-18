package com.aits.admin.dao;

import com.aits.model.ProductMaster;

public interface AdminProductDao {

	void getProductMasterList(ProductMaster productMaster);

	void insertProductMasterInformation(ProductMaster productMaster);

	void getProductMasterInformationByIdService(ProductMaster productMaster);

	void updateProductMasterInformation(ProductMaster productMaster);

	void deleteProductMasterInformation(ProductMaster productMaster);

	void getActiveProductMasterList(ProductMaster productMaster);

}
