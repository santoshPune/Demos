package com.aits.admin.service.implement;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aits.admin.dao.DiscountMgmtDao;
import com.aits.admin.service.DiscountMgmtService;
import com.aits.dto.SubProductMasterDiscountMapperDto;
import com.aits.model.DiscountMaster;
import com.aits.model.SubProductMaster;
import com.aits.model.SubProductMasterDiscountMapper;

@Service
public class DiscountMgmtServiceImpl implements DiscountMgmtService{

	@Autowired
	private DiscountMgmtDao discountMgmtDao;
	
	@Override
	@Transactional
	public void addDiscount(SubProductMasterDiscountMapperDto subProductMasterDiscountMapperDto) {
		
		SubProductMasterDiscountMapper subProductMasterDiscountMapper = new SubProductMasterDiscountMapper();
		
		
		subProductMasterDiscountMapper.setSubProductMasterDiscountMapperFromDate(subProductMasterDiscountMapperDto.getSubProductMasterDiscountMapperFromDate());
		subProductMasterDiscountMapper.setSubProductMasterDiscountMapperToDate(subProductMasterDiscountMapperDto.getSubProductMasterDiscountMapperToDate());
		subProductMasterDiscountMapper.setDiscountMaster(subProductMasterDiscountMapperDto.getDiscountMaster());
		subProductMasterDiscountMapper.setSubProductMaster(subProductMasterDiscountMapperDto.getSubProductMaster());
		subProductMasterDiscountMapper.setIsActive("A");
		discountMgmtDao.addDiscount(subProductMasterDiscountMapper);
		subProductMasterDiscountMapperDto.setSubProductMasterDiscountMapperId(subProductMasterDiscountMapper.getSubProductMasterDiscountMapperId());
	}

	@Override
	@Transactional
	public void listDiscount(SubProductMasterDiscountMapperDto subProductMasterDiscountMapperDto) {
		SubProductMasterDiscountMapper subProductMasterDiscountMapper = new SubProductMasterDiscountMapper();
		discountMgmtDao.listDiscount(subProductMasterDiscountMapper);
		subProductMasterDiscountMapperDto.setSubProductMasterDiscountMapperList(subProductMasterDiscountMapper.getSubProductMasterDiscountMapperList());
		
	}

	

}
