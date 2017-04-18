package com.aits.admin.dao.implement;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aits.admin.dao.AdminProductDao;
import com.aits.model.ProductMaster;

@Repository
public class AdminProductDaoImpl implements AdminProductDao {
 
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void getProductMasterList(ProductMaster productMaster) {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(ProductMaster.class);
		List<ProductMaster> productMasterList=criteria.list();
		productMaster.setProductMasterList(productMasterList);
		
	}

	@Override
	public void insertProductMasterInformation(ProductMaster productMaster) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(productMaster);
		transaction.commit();
	}

	@Override
	public void getProductMasterInformationByIdService(ProductMaster productMaster) {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(ProductMaster.class);
		Criterion criterion=Restrictions.eq("productMasterId", productMaster.getProductMasterId());
		criteria.add(criterion);
		ProductMaster productMasterDaoResult=(ProductMaster)criteria.uniqueResult();
		
		productMaster.setProductMasterName(productMasterDaoResult.getProductMasterName());
		productMaster.setIsActive(productMasterDaoResult.getIsActive());
		productMaster.setSubCategoryMaster(productMasterDaoResult.getSubCategoryMaster());
	}

	@Override
	public void updateProductMasterInformation(ProductMaster productMaster) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(productMaster);
		transaction.commit();
	}

	@Override
	public void deleteProductMasterInformation(ProductMaster productMaster) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(productMaster);
		transaction.commit();
		
	}

	@Override
	public void getActiveProductMasterList(ProductMaster productMaster) {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(ProductMaster.class);
		Criterion criterion=Restrictions.eq("isActive","A" );
		criteria.add(criterion);
		List<ProductMaster> productMasterList=criteria.list();
		productMaster.setProductMasterList(productMasterList);
	}
	
	
}
