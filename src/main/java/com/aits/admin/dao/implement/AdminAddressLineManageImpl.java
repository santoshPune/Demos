package com.aits.admin.dao.implement;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aits.admin.dao.AdminAddressLineManageDao;
import com.aits.dto.AddressMasterDto;
import com.aits.model.AddressMaster;


@Repository
public class AdminAddressLineManageImpl implements AdminAddressLineManageDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List getAllAddressLine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAddressLine(AddressMaster addressMaster) {
		// TODO Auto-generated method stub
		
		sessionFactory.getCurrentSession().save(addressMaster);
		
	}

	@Override
	public AddressMaster getAddressLineById(int cityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateAddressLine(AddressMasterDto addressMasterDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAddressLine(int cityId) {
		// TODO Auto-generated method stub
		
	}
}
