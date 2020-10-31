package com.elegant.service;

import com.elegant.dao.EmployeeDao;

public class EmployeeService {

	private EmployeeDao employeeDao;// Dependency instance variable

	public EmployeeService(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void saveData() {

		System.out.println("Service . Data saved");
		employeeDao.saveData();
	}

}
