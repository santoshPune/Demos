package com.aits.admin.dao.implement;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aits.admin.dao.AdminPincodeManageDao;
import com.aits.model.PincodeMaster;
@Repository
public class AdminPincodeManageImpl implements AdminPincodeManageDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List getAllPincode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPincode(PincodeMaster pincodeMaster) {
		// TODO Auto-generated method stub
		
		sessionFactory.getCurrentSession().save(pincodeMaster);
	}

	@Override
	public PincodeMaster getPincodeById(int pincodeId) {
		// TODO Auto-generated method stub
		return (PincodeMaster) sessionFactory.getCurrentSession().get(PincodeMaster.class,pincodeId);
	}

	@Override
	public void updatePincode(PincodeMaster pincodeMaster) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(pincodeMaster);
		
	}

	@Override
	public void deletePincode(int pincodeId) {
		// TODO Auto-generated method stub
		
	}
}
