package com.aits.dao.implementation;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aits.FactoryClasses.IRandomNumber;
import com.aits.dao.UserLoginDao;
import com.aits.dto.EndUserDetailsDto;
import com.aits.model.EndUserDetails;

@Repository
public class UserLoginDaoImpl implements UserLoginDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired 
	private IRandomNumber iRandomNumber;

	@Override
	public void userLogin(EndUserDetails endUserDetails) {
		
		System.out.println("random Number"+iRandomNumber.genrateRandomNumber());
		
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(EndUserDetails.class);
		Criterion criterion=Restrictions.eq("userEmailId", endUserDetails.getUserEmailId());
		criteria.add(criterion);
		EndUserDetails EndUserDetailsResult=(EndUserDetails)criteria.uniqueResult();

		if(null != EndUserDetailsResult)
		{
			if(EndUserDetailsResult.getUserPassword().equals(endUserDetails.getUserPassword()))
			{
				endUserDetails.setEndUserId(EndUserDetailsResult.getEndUserId());
				endUserDetails.setOneTimePassword(EndUserDetailsResult.getOneTimePassword());
				endUserDetails.setUserAge(EndUserDetailsResult.getUserAge());
				endUserDetails.setUserDateOfBirth(EndUserDetailsResult.getUserDateOfBirth());
				endUserDetails.setUserEmailId(EndUserDetailsResult.getUserEmailId());
				endUserDetails.setUserFirstName(EndUserDetailsResult.getUserFirstName());
				endUserDetails.setUserGender(EndUserDetailsResult.getUserGender());
				endUserDetails.setUserLastName(EndUserDetailsResult.getUserLastName());
				endUserDetails.setUserMobileNumber(EndUserDetailsResult.getUserMobileNumber());
				endUserDetails.setAddressMaster(EndUserDetailsResult.getAddressMaster()); 
			}
			
		}
	}
		

		

	
}

