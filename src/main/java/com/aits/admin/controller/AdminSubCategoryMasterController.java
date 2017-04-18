package com.aits.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.aits.admin.service.AdminSubCategoryMasterService;
import com.aits.dto.CategoryMasterDto;
import com.aits.dto.SubCategoryMasterDto;
import com.aits.model.CategoryMaster;
import com.aits.model.SubCategoryMaster;

@RestController
public class AdminSubCategoryMasterController {

	@Autowired
	private AdminSubCategoryMasterService adminSubCategoryMasterService;

	public void setAdminSubCategoryMasterService(AdminSubCategoryMasterService adminSubCategoryMasterService) {
		this.adminSubCategoryMasterService = adminSubCategoryMasterService;
	}

	@RequestMapping(value = "/getSubCategoryMasterList", method = RequestMethod.GET)
	public List<SubCategoryMaster> getSubCategoryMasterList() {
		SubCategoryMasterDto subCategoryMasterDto = new SubCategoryMasterDto();
		adminSubCategoryMasterService.getSubCategoryMasterListService(subCategoryMasterDto);
		return subCategoryMasterDto.getSubCategoryMasterList();

	}
	
	@RequestMapping(value="/insertSubCategoryMasterInformation",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<SubCategoryMaster> addSubCategoryMasterInformation(@RequestBody SubCategoryMasterDto subCategoryMasterDto){
		
		adminSubCategoryMasterService.insertSubCategoryMasterInformationService(subCategoryMasterDto);
		adminSubCategoryMasterService.getSubCategoryMasterListService(subCategoryMasterDto);
		return subCategoryMasterDto.getSubCategoryMasterList();
	}
	
	@RequestMapping(value="/getSubCategoryMasterInformationById/{subCategoryMasterId}",method=RequestMethod.GET)
	public SubCategoryMasterDto getSubCategoryMasterInformationById(@PathVariable("subCategoryMasterId") int subCategoryMasterId){
				
		SubCategoryMasterDto subCategoryMasterDto=new SubCategoryMasterDto();
		subCategoryMasterDto.setSubCategoryMasterId(subCategoryMasterId);
		adminSubCategoryMasterService.getSubCategoryMasterInformationByIdService(subCategoryMasterDto);
		return subCategoryMasterDto;
	}
	
	@RequestMapping(value="/updateSubCategoryMaster",method=RequestMethod.POST)
	public List<SubCategoryMaster> updateSubCategoryMaster(@RequestBody SubCategoryMasterDto subCategoryMasterDto){
	   
		adminSubCategoryMasterService.updateSubCategoryMasterInformationService(subCategoryMasterDto);
		adminSubCategoryMasterService.getSubCategoryMasterListService(subCategoryMasterDto);
		return subCategoryMasterDto.getSubCategoryMasterList();
	}
	
	@RequestMapping(value="/deleteSubCategoryMasterInformationById/{subCategoryMasterId}",method=RequestMethod.GET)
	public List<SubCategoryMaster> deleteSubCategoryMaster(@PathVariable("subCategoryMasterId") int subCategoryMasterId){
	  	SubCategoryMasterDto subCategoryMasterDto=new SubCategoryMasterDto();
		subCategoryMasterDto.setSubCategoryMasterId(subCategoryMasterId);
		
		adminSubCategoryMasterService.deleteSubCategoryMasterInformationService(subCategoryMasterDto);
		adminSubCategoryMasterService.getSubCategoryMasterListService(subCategoryMasterDto);
		
		return subCategoryMasterDto.getSubCategoryMasterList();
	}

	@RequestMapping(value="/getActiveSubCategoryMasterList",method=RequestMethod.GET)
	public List<SubCategoryMaster> getActiveSubCategoryMasterList(){
		SubCategoryMasterDto subCategoryMasterDto=new SubCategoryMasterDto();
		adminSubCategoryMasterService.getActiveSubCategoryMasterListService(subCategoryMasterDto);
		return subCategoryMasterDto.getSubCategoryMasterList();
		
	}
}
