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

import com.aits.admin.dao.AdminCategoryDao;
import com.aits.model.CategoryMaster;

@Repository("AdminCategoryDao")
public class AdminCategoryDaoImpl implements AdminCategoryDao{

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void getCategoryList(CategoryMaster categoryMaster) {
     Session session=sessionFactory.openSession();
     Criteria criteria=session.createCriteria(CategoryMaster.class);
     List<CategoryMaster> categoryMasterList=criteria.list();
     categoryMaster.setCategoryMasterList(categoryMasterList);	
	}

	@Override
	public void insertCategoryMasterInformation(CategoryMaster categoryMaster) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(categoryMaster);
		transaction.commit();
		
	}

	@Override
	public void getCategoryMasterInformationById(CategoryMaster categoryMaster) {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(CategoryMaster.class);
		Criterion criterion=Restrictions.eq("categoryMasterId", categoryMaster.getCategoryMasterId());
		criteria.add(criterion);
		CategoryMaster categoryMasterDaoResult=(CategoryMaster)criteria.uniqueResult();
		categoryMaster.setCategoryMasterName(categoryMasterDaoResult.getCategoryMasterName());
		categoryMaster.setIsActive(categoryMasterDaoResult.getIsActive());
	}

	@Override
	public void updateCategoryMasterInformation(CategoryMaster categoryMaster) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(categoryMaster);
		transaction.commit();
	}

	@Override
	public void getActiveCategoryList(CategoryMaster categoryMaster) {
		Session session=sessionFactory.openSession();
	     Criteria criteria=session.createCriteria(CategoryMaster.class);
	     Criterion criterion=Restrictions.eq("isActive", "A");
	     criteria.add(criterion);
	     List<CategoryMaster> categoryMasterList=criteria.list();
	     categoryMaster.setCategoryMasterList(categoryMasterList);	
		
	}

	
	
	
	
	
	
}
