package com.ashish.AngularProject.service;

import java.util.HashMap;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashish.AngularProject.dao.AngularDao;
import com.ashish.AngularProject.entity.Registration;

@Service
@Transactional
public class AngularService {

	@Autowired
	AngularDao dao;

	public Map<String, Object> loginCheck(Registration registration) {
		
		Registration object = dao.checkLogin(registration);
		Map<String, Object> map = new HashMap();
		
		if(object!=null) {		
			map.put("msg", "Valid User");
			map.put("user", object);
			
		}else {
			map.put("msg", "Invalid User");
			map.put("user", object);		
		}
		return map;
		
	}
	
}
