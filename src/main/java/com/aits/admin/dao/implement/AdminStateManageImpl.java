package com.aits.admin.dao.implement;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aits.admin.dao.AdminStateManageDao;
import com.aits.model.StateMaster;

@Repository
public class AdminStateManageImpl implements AdminStateManageDao {

	@Autowired
	private SessionFactory sessionFactory;


	@SuppressWarnings("unchecked")
	@Override
	public List<StateMaster> allStates() {
	
		return sessionFactory.getCurrentSession().createQuery("from StateMaster").list();
	}

	@Override
	public void addState(StateMaster stateMaster) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(stateMaster);
	}

	@Override
	public void deleteState(int stateId) {

		StateMaster stateMaster=(StateMaster) sessionFactory.getCurrentSession().load(StateMaster.class,stateId);

		if(stateMaster!=null){
            stateMaster.setIsActive("I");
			sessionFactory.getCurrentSession().update(stateMaster);
		}

	}

	@Override
	public StateMaster getStateById(int stateId) {

		return (StateMaster) sessionFactory.getCurrentSession().get(StateMaster.class,stateId);
	}

	@Override
	public void updateState(StateMaster stateMaster) {
		sessionFactory.getCurrentSession().update(stateMaster);;
	}

}
