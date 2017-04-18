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

import com.aits.admin.dao.AdminSubCategoryMasterDao;
import com.aits.model.SubCategoryMaster;

@Repository("AdminSubCategoryMasterDao")
public class AdminSubCategoryMasterDaoImpl implements AdminSubCategoryMasterDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void getSubCategoryMasterList(SubCategoryMaster subCategoryMaster) {
	
	   Session  session=sessionFactory.openSession();
	   Criteria criteria= session.createCriteria(SubCategoryMaster.class);
	   List<SubCategoryMaster> subCategoryMasterList=criteria.list();
	   
	   subCategoryMaster.setSubCategoryMasterList(subCategoryMasterList);
		
	}

	@Override
	public void insertSubCategoryMasterInformation(SubCategoryMaster subCategoryMaster) {
		Session  session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
        session.save(subCategoryMaster);
		transaction.commit();
		
	}

	@Override
	public void getSubCategoryMasterInformationById(SubCategoryMaster subCategoryMaster) {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(SubCategoryMaster.class);
	    Criterion criterion=Restrictions.eq("subCategoryMasterId", subCategoryMaster.getSubCategoryMasterId());
	    criteria.add(criterion);
	    SubCategoryMaster subCategoryMasterDaoResult=(SubCategoryMaster)criteria.uniqueResult();
	   
	    subCategoryMaster.setSubCategoryMasterName(subCategoryMasterDaoResult.getSubCategoryMasterName());
	    subCategoryMaster.setIsActive(subCategoryMasterDaoResult.getIsActive());
	    subCategoryMaster.setCategoryMaster(subCategoryMasterDaoResult.getCategoryMaster());
	}

	@Override
	public void updateSubCategoryMasterInformation(SubCategoryMaster subCategoryMaster) {
		Session  session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
        session.update(subCategoryMaster);
		transaction.commit();
		
	}

	@Override
	public void deleteSubCategoryMasterInformation(SubCategoryMaster subCategoryMaster) {
		Session  session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
        session.update(subCategoryMaster);
		transaction.commit();
		
	}

	@Override
	public void getActiveSubCategoryMasterList(SubCategoryMaster subCategoryMaster) {
		 Session  session=sessionFactory.openSession();
		   Criteria criteria= session.createCriteria(SubCategoryMaster.class);
		   Criterion criterion=Restrictions.eq("isActive", "A");
		   criteria.add(criterion);
		   List<SubCategoryMaster> subCategoryMasterList=criteria.list();
		   subCategoryMaster.setSubCategoryMasterList(subCategoryMasterList);
		
	}
	
	

}
