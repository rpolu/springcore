package com.elegant.springboopapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public void m1() {
		System.out.println("from service");
		employeeDao.saveData();
	}

}
