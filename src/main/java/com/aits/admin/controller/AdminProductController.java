package com.aits.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aits.admin.service.AdminProductService;
import com.aits.dto.CategoryMasterDto;
import com.aits.dto.ProductMasterDto;
import com.aits.dto.SubCategoryMasterDto;
import com.aits.model.CategoryMaster;
import com.aits.model.ProductMaster;
import com.aits.model.SubCategoryMaster;

@RestController
public class AdminProductController {
	@Autowired
	private AdminProductService adminProductService;

	public void setAdminProductService(AdminProductService adminProductService) {
		this.adminProductService = adminProductService;
	}

	@RequestMapping(value = "/getProductMasterList", method = RequestMethod.GET)
	public List<ProductMaster> getProductMasterList() {
		ProductMasterDto productMasterDto = new ProductMasterDto();
		adminProductService.getProductMasterListService(productMasterDto);
		return productMasterDto.getProductMasterList();
	}

	@RequestMapping(value = "/insertProductMaster", method = RequestMethod.POST)
	public List<ProductMaster> addProductMaster(@RequestBody ProductMasterDto productMasterDto) {

		adminProductService.insertProductMasterInformationService(productMasterDto);
		adminProductService.getProductMasterListService(productMasterDto);

		return productMasterDto.getProductMasterList();
	}

	@RequestMapping(value = "/getProductMasterInformationById/{productMasterId}", method = RequestMethod.GET)
	public ProductMasterDto getProductMasterInformationById(@PathVariable("productMasterId") int productMasterId) {
		ProductMasterDto productMasterDto = new ProductMasterDto();
		productMasterDto.setProductMasterId(productMasterId);
		// adminCategoryService.getCategoryMasterInformationByIdService(categoryMasterDto);
		adminProductService.getProductMasterInformationByIdService(productMasterDto);
		return productMasterDto;
	}

	@RequestMapping(value = "/updateProductMaster", method = RequestMethod.POST)
	public List<ProductMaster> updateProductMaster(@RequestBody ProductMasterDto productMasterDto) {

		adminProductService.updateProductMasterInformationService(productMasterDto);
		adminProductService.getProductMasterListService(productMasterDto);

		return productMasterDto.getProductMasterList();
	}

	@RequestMapping(value = "/deleteProductMasterInformationById/{productMasterId}", method = RequestMethod.GET)
	public List<ProductMaster> deleteProductMaster(@PathVariable("productMasterId") int productMasterId) {
		ProductMasterDto productMasterDto = new ProductMasterDto();
		productMasterDto.setProductMasterId(productMasterId);

		adminProductService.deleteProductMasterInformationService(productMasterDto);
        adminProductService.getProductMasterListService(productMasterDto);
		return productMasterDto.getProductMasterList();
	}
	
	@RequestMapping(value="/getActiveProductMasterList",method=RequestMethod.GET)
	public List<ProductMaster> getActiveProductMasterList(){
		ProductMasterDto productMasterDto=new ProductMasterDto();
		adminProductService.getActiveProductMasterListService(productMasterDto);
		return productMasterDto.getProductMasterList();
		
	}

}
