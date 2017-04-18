package com.aits.admin.dao.implement;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aits.admin.dao.DiscountMgmtDao;
import com.aits.model.CategoryMaster;
import com.aits.model.SubProductMasterDiscountMapper;

@Repository
public class DiscountMgmtDaoImpl implements DiscountMgmtDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addDiscount(SubProductMasterDiscountMapper subProductMasterDiscountMapper) {
		int id = (int) sessionFactory.getCurrentSession().save(subProductMasterDiscountMapper);
		subProductMasterDiscountMapper.setSubProductMasterDiscountMapperId(id);
	}

	@Override
	public void listDiscount(SubProductMasterDiscountMapper subProductMasterDiscountMapper) {
		// TODO Auto-generated method stub
		 Session session=sessionFactory.openSession();
	     Criteria criteria=session.createCriteria(SubProductMasterDiscountMapper.class);
	     List<SubProductMasterDiscountMapper> subProductMasterDiscountMapperList=criteria.list();
	     subProductMasterDiscountMapper.setSubProductMasterDiscountMapperList(subProductMasterDiscountMapperList);
		
	}

}
