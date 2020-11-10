package com.cisco.dtag.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cisco.dtag.dao.EmployeeDao;

@Service
public class EmployeeService {
	
	@Autowired
	@Qualifier("dao1")
	private EmployeeDao dao;

	public void m1() {
		System.out.println(" from m1()");
		dao.saveData();
	}

}
