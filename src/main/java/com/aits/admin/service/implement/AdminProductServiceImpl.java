package com.aits.admin.service.implement;

import org.dom4j.util.ProxyDocumentFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aits.admin.dao.AdminProductDao;
import com.aits.admin.service.AdminProductService;
import com.aits.dto.ProductMasterDto;
import com.aits.model.ProductMaster;

@Service("AdminProductService")
public class AdminProductServiceImpl implements AdminProductService {
	@Autowired
	private AdminProductDao adminProductDao;

	public void setAdminProductDao(AdminProductDao adminProductDao) {
		this.adminProductDao = adminProductDao;
	}

	@Override
	public void getProductMasterListService(ProductMasterDto productMasterDto) {
		ProductMaster productMaster=new ProductMaster();
		adminProductDao.getProductMasterList(productMaster);
		productMasterDto.setProductMasterList(productMaster.getProductMasterList());
		
	}

	@Override
	public void insertProductMasterInformationService(ProductMasterDto productMasterDto) {
        ProductMaster productMaster=new ProductMaster();
        productMaster.setProductMasterName(productMasterDto.getProductMasterName());
        productMaster.setIsActive("I");
        productMaster.setSubCategoryMaster(productMasterDto.getSubCategoryMaster());
        
        adminProductDao.insertProductMasterInformation(productMaster);
		
	}

	@Override
	public void getProductMasterInformationByIdService(ProductMasterDto productMasterDto) {
		ProductMaster productMaster=new ProductMaster();
		productMaster.setProductMasterId(productMasterDto.getProductMasterId());
		adminProductDao.getProductMasterInformationByIdService(productMaster);
		productMasterDto.setProductMasterName(productMaster.getProductMasterName());
		productMasterDto.setIsActive(productMaster.getIsActive());
		productMasterDto.setSubCategoryMaster(productMaster.getSubCategoryMaster());
		
	}

	@Override
	public void updateProductMasterInformationService(ProductMasterDto productMasterDto) {
		ProductMaster productMaster=new ProductMaster();
		productMaster.setProductMasterId(productMasterDto.getProductMasterId());
		productMaster.setProductMasterName(productMasterDto.getProductMasterName());
		productMaster.setIsActive(productMasterDto.getIsActive());
		productMaster.setSubCategoryMaster(productMasterDto.getSubCategoryMaster());
		
		adminProductDao.updateProductMasterInformation(productMaster);
	}

	@Override
	public void deleteProductMasterInformationService(ProductMasterDto productMasterDto) {
		ProductMaster productMaster=new ProductMaster();
		productMaster.setProductMasterId(productMasterDto.getProductMasterId());
		
		adminProductDao.getProductMasterInformationByIdService(productMaster);
		
		productMaster.setIsActive("I");
		
		adminProductDao.deleteProductMasterInformation(productMaster);
		
		
	}

	@Override
	public void getActiveProductMasterListService(ProductMasterDto productMasterDto) {
		ProductMaster productMaster=new ProductMaster();
		adminProductDao.getActiveProductMasterList(productMaster);
		productMasterDto.setProductMasterList(productMaster.getProductMasterList());
		
	}

}
