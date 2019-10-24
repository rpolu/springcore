package com.sping.service;

import com.sping.dao.EmployeeDao;

public class EmployeeService {
	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void getEmployee() {
		System.out.println("Get Emp details-From service");
		employeeDao.getEmpDetails();
	}
}
