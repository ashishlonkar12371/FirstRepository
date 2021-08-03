package com.ashish.AngularProject.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ashish.AngularProject.entity.Registration;

@Repository
public class AngularDao {
	
	@Autowired
	SessionFactory sf;

	public Registration checkLogin(Registration registration) {
		
		Session session = sf.getCurrentSession();
		Criteria criteria = session.createCriteria(Registration.class);
		criteria.add(Restrictions.eq("email", registration.getEmail()));
		criteria.add(Restrictions.eq("password", registration.getPassword()));
		Registration object = (Registration) criteria.uniqueResult();
		
		return object;
	}

}
