package com.aits.admin.dao.implement;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aits.admin.dao.AdminCityManageDao;
import com.aits.model.CityMaster;
@Repository
public class AdminCityManageImpl implements AdminCityManageDao{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List getAllCity() {

		return sessionFactory.getCurrentSession().createQuery("from CityMaster").list();
	}

	@Override
	public void addCity(CityMaster cityMaster) {

		sessionFactory.getCurrentSession().save(cityMaster);	}

	@Override
	public CityMaster getCityById(int cityId) {

		return (CityMaster) sessionFactory.getCurrentSession().get(CityMaster.class,cityId);
	}

	@Override
	public void updateCity(CityMaster cityMaster) {

		sessionFactory.getCurrentSession().update(cityMaster);
	}


	@Override
	public void deleteCity(int cityId) {
		CityMaster cityMaster=(CityMaster) sessionFactory.getCurrentSession().load(CityMaster.class,cityId);
		if(cityMaster!=null)
		{
			sessionFactory.getCurrentSession().delete(cityMaster);
		}
	}
}
