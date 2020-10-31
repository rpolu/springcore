package com.elegant.service;

import com.elegant.dao.EmployeeDao;

public class EmployeeService {

	private int empId;
	private String name;
	private EmployeeDao employeeDao;// Dependency instance variable

	public void setEmployeeDao(EmployeeDao employeeDao) {// setter method
		this.employeeDao = employeeDao;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void saveData() {
		System.out.println(empId);
		System.out.println(name);
		System.out.println("Service . Data saved");
		employeeDao.saveData();
	}

}
