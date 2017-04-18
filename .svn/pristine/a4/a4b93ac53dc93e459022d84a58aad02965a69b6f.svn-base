package com.aits.dao.implementation;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aits.dao.UserRegistrationDao;
import com.aits.model.AddressMaster;
import com.aits.model.EndUserDetails;


@Repository
public class UserRegistrationDaoImpl implements UserRegistrationDao {

	@Autowired
	private SessionFactory sessionFactory;


	@Override
	public void partialRegistration(EndUserDetails endUserDetails) {
		// TODO Auto-generated method stub
		

		int uId=(int) sessionFactory.getCurrentSession().save(endUserDetails);
		endUserDetails=(EndUserDetails) sessionFactory.getCurrentSession().get(EndUserDetails.class,uId);
		
	}


	@Override
	public void centralRegistration(EndUserDetails endUserDetails) {
		sessionFactory.getCurrentSession().update(endUserDetails);;
		
	}


	@Override
	public void finalRegistration(EndUserDetails endUserDetails) {
		 sessionFactory.getCurrentSession().update(endUserDetails);;
	
		
	}


	@Override
	public int saveAddress(AddressMaster addressMaster) {
		// TODO Auto-generated method stub
		return (int) sessionFactory.getCurrentSession().save(addressMaster);
	}

}
