package com.aits.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aits.admin.service.AdminCategoryService;
import com.aits.dto.CategoryMasterDto;
import com.aits.model.CategoryMaster;

@RestController
public class AdminCategoryController {
  
	@Autowired
	private AdminCategoryService adminCategoryService;

	public void setAdminCategoryService(AdminCategoryService adminCategoryService) {
		this.adminCategoryService = adminCategoryService;
	}
	
	@RequestMapping(value="/getCategoryMasterList",method=RequestMethod.GET)
	public List<CategoryMaster> getCategoryMasterList(){
		CategoryMasterDto categoryMasterDto=new CategoryMasterDto();
		adminCategoryService.getCategoryMasterListService(categoryMasterDto);
		return categoryMasterDto.getCategoryMasterList();
		
	}
	@RequestMapping(value="/insertCategoryMaster",method=RequestMethod.POST)
	public List<CategoryMaster> addCategoryMaster(@RequestBody CategoryMasterDto categoryMasterDto){
	    
		adminCategoryService.insertCategoryMasterInformationService(categoryMasterDto);
		adminCategoryService.getCategoryMasterListService(categoryMasterDto);
		
		return categoryMasterDto.getCategoryMasterList();
	}
	
	@RequestMapping(value="/getCategoryMasterInformationById/{categoryMasterId}",method=RequestMethod.GET)
	public CategoryMasterDto getCategoryMasterInformationById(@PathVariable("categoryMasterId") int categoryMasterId){
		CategoryMasterDto categoryMasterDto=new CategoryMasterDto();
		categoryMasterDto.setCategoryMasterId(categoryMasterId);
		adminCategoryService.getCategoryMasterInformationByIdService(categoryMasterDto);
		return categoryMasterDto;
	}
	
	@RequestMapping(value="/updateCategoryMaster",method=RequestMethod.POST)
	public List<CategoryMaster> updateCategoryMaster(@RequestBody CategoryMasterDto categoryMasterDto){
	    
		adminCategoryService.updateCategoryMasterInformationService(categoryMasterDto);
		adminCategoryService.getCategoryMasterListService(categoryMasterDto);
		
		return categoryMasterDto.getCategoryMasterList();
	}
	
	@RequestMapping(value="/deleteCategoryMasterInformationById/{categoryMasterId}",method=RequestMethod.GET)
	public List<CategoryMaster> deleteCategoryMaster(@PathVariable("categoryMasterId") int categoryMasterId){
	   
		CategoryMasterDto categoryMasterDto=new CategoryMasterDto();
	    categoryMasterDto.setCategoryMasterId(categoryMasterId);
	    
		adminCategoryService.deleteCategoryMasterInformationService(categoryMasterDto);
		adminCategoryService.getCategoryMasterListService(categoryMasterDto);
		
		return categoryMasterDto.getCategoryMasterList();
	}
	
	@RequestMapping(value="/getActiveCategoryMasterList",method=RequestMethod.GET)
	public List<CategoryMaster> getActiveCategoryMasterList(){
		CategoryMasterDto categoryMasterDto=new CategoryMasterDto();
		adminCategoryService.getActiveCategoryMasterListService(categoryMasterDto);
		return categoryMasterDto.getCategoryMasterList();
		
	}
	
}
