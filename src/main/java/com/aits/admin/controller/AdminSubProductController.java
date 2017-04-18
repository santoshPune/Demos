package com.aits.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aits.admin.service.AdminSubProductService;
import com.aits.dto.SubCategoryMasterDto;
import com.aits.dto.SubProductMasterDto;
import com.aits.model.SubCategoryMaster;
import com.aits.model.SubProductMaster;

@RestController
public class AdminSubProductController {

	@Autowired
	private AdminSubProductService adminSubProductService;

	public void setAdminSubProductService(AdminSubProductService adminSubProductService) {
		this.adminSubProductService = adminSubProductService;
	}
	
	@RequestMapping(value = "/getSubProductMasterList", method = RequestMethod.GET)
	public List<SubProductMaster> getSubProductMasterList() {
	
		SubProductMasterDto subProductMasterDto=new SubProductMasterDto();
		adminSubProductService.getSubProductMasterListService(subProductMasterDto);
		
		return subProductMasterDto.getSubProductMasterList();

	}
	
	@RequestMapping(value="/insertSubProductMasterInformation",method=RequestMethod.POST)
	public List<SubProductMaster> addSubProductMasterInformation(@RequestBody SubProductMasterDto subProductMasterDto){
		
		adminSubProductService.insertSubProductMasterInformationService(subProductMasterDto);
		adminSubProductService.getSubProductMasterListService(subProductMasterDto);
		
		return subProductMasterDto.getSubProductMasterList();
	}
	
	@RequestMapping(value="/getSubProductMasterInformationById/{subProductId}",method=RequestMethod.GET)
	public SubProductMasterDto getSubProductMasterInformationById(@PathVariable("subProductId") int subProductId){
				
		SubProductMasterDto subProductMasterDto=new SubProductMasterDto();
		subProductMasterDto.setSubProductId(subProductId);
		adminSubProductService.getSubProductMasterInformationByIdService(subProductMasterDto);
		return subProductMasterDto;
	}
	
	@RequestMapping(value="/updateSubProductMaster",method=RequestMethod.POST)
	public List<SubProductMaster> updateSubProductMaster(@RequestBody SubProductMasterDto subProductMasterDto){
	   
		adminSubProductService.updateSubProductMasterInformationService(subProductMasterDto);
		adminSubProductService.getSubProductMasterListService(subProductMasterDto);
		return subProductMasterDto.getSubProductMasterList();
	}
	
	@RequestMapping(value="/deleteSubProductMasterInformationById/{subProductId}",method=RequestMethod.GET)
	public List<SubProductMaster> deleteSubProductMaster(@PathVariable("subProductId") int subProductId){
		SubProductMasterDto subProductMasterDto=new SubProductMasterDto();
		subProductMasterDto.setSubProductId(subProductId);
		
		adminSubProductService.deleteSubProductMasterInformationService(subProductMasterDto);
		adminSubProductService.getSubProductMasterListService(subProductMasterDto);
		
		return subProductMasterDto.getSubProductMasterList();
	}
	
	@RequestMapping(value="/getActiveSubProductMasterList",method=RequestMethod.GET)
	public List<SubProductMaster> getActiveSubProductMasterList(){
		SubProductMasterDto subProductMasterDto=new SubProductMasterDto();
		adminSubProductService.getActiveSubProductMasterListService(subProductMasterDto);
		return subProductMasterDto.getSubProductMasterList();
		
	}
}
