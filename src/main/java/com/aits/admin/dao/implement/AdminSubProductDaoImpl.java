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

import com.aits.admin.dao.AdminSubProductDao;
import com.aits.model.SubProductMaster;

@Repository("AdminSubProductDao")
public class AdminSubProductDaoImpl implements AdminSubProductDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void getSubProductMasterList(SubProductMaster subProductMaster) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(SubProductMaster.class);
		List<SubProductMaster> subProductMasterList = criteria.list();
		subProductMaster.setSubProductMasterList(subProductMasterList);

	}

	@Override
	public void insertSubProductMasterInformation(SubProductMaster subProductMaster) {
		Session session = sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(subProductMaster);
        transaction.commit();
	}

	@Override
	public void getSubProductMasterInformationById(SubProductMaster subProductMaster) {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(SubProductMaster.class);
		Criterion criterion=Restrictions.eq("subProductId", subProductMaster.getSubProductId());
		criteria.add(criterion);
		SubProductMaster subProductMasterDaoResult=(SubProductMaster)criteria.uniqueResult();
		subProductMaster.setSubProductName(subProductMasterDaoResult.getSubProductName());
		subProductMaster.setSubProductColor(subProductMasterDaoResult.getSubProductColor());
		subProductMaster.setSubProductPrice(subProductMasterDaoResult.getSubProductPrice());
		subProductMaster.setSubProductQuantity(subProductMasterDaoResult.getSubProductQuantity());
		subProductMaster.setSubProductWeigth(subProductMasterDaoResult.getSubProductWeigth());
		subProductMaster.setIsActive(subProductMasterDaoResult.getIsActive());
		subProductMaster.setProductMaster(subProductMasterDaoResult.getProductMaster());
		
		
	}

	@Override
	public void updateSubProductMasterInformation(SubProductMaster subProductMaster) {
		Session session = sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.update(subProductMaster);
        transaction.commit();
		
	}

	@Override
	public void getActiveSubProductMasterList(SubProductMaster subProductMaster) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(SubProductMaster.class);
		Criterion criterion=Restrictions.eq("isActive", "A");
		criteria.add(criterion);
		List<SubProductMaster> subProductMasterList = criteria.list();
		subProductMaster.setSubProductMasterList(subProductMasterList);
		
	}

	@Override
	public void deleteSubProductMasterInformation(SubProductMaster subProductMaster) {
		Session session = sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.update(subProductMaster);
        transaction.commit();
		
	}

}
