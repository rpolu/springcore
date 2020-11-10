package com.sping.service;

import com.sping.dao.EmployeeDao;

public class EmployeeService {
	private EmployeeDao ed;

	public EmployeeService(EmployeeDao ed) {
		this.ed = ed;
	}

	public void getEmployee() {
		System.out.println("Get Emp details-From service");
		ed.getEmpDetails();
	}
}
