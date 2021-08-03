package com.ashish.AngularProject.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashish.AngularProject.entity.Registration;
import com.ashish.AngularProject.service.AngularService;

@RestController
public class AngularController {

	@Autowired
	AngularService service;
	
	@PostMapping(value = "/logincheck")
	public Map<String,Object> loginCheck(@RequestBody Registration registration){
		
		Map<String,Object> map = service.loginCheck(registration);
		return map;
		
	}
	
}
