package com.aits.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aits.admin.service.DiscountMgmtService;
import com.aits.constant.AppConstant;
import com.aits.dto.SubProductMasterDiscountMapperDto;
import com.aits.model.SubProductMasterDiscountMapper;

@RestController
public class DiscountMgmtController implements AppConstant{
	
	@Autowired
	private DiscountMgmtService discountMgmtService;

	@RequestMapping(value=ADD_DISCOUNT, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public SubProductMasterDiscountMapperDto addDiscount(@RequestBody SubProductMasterDiscountMapperDto subProductMasterDiscountMapperDto) {
		discountMgmtService.addDiscount(subProductMasterDiscountMapperDto);
		return subProductMasterDiscountMapperDto;
	}	
	
	@RequestMapping(value=LIST_DISCOUNT, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<SubProductMasterDiscountMapper> listDiscount() {
		SubProductMasterDiscountMapperDto subProductMasterDiscountMapperDto= new SubProductMasterDiscountMapperDto();
		discountMgmtService.listDiscount(subProductMasterDiscountMapperDto);
		return subProductMasterDiscountMapperDto.getSubProductMasterDiscountMapperList();
	}
	
	
}
