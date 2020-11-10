package com.cisco.dtag.dao.impl;

import org.springframework.stereotype.Repository;

import com.cisco.dtag.dao.EmployeeDao;

@Repository("dao1")
public class EmployeeDaoImpl1 implements EmployeeDao {

	public void saveData() {
		System.out.println("EmployeeDaoImpl1");
	}

}
