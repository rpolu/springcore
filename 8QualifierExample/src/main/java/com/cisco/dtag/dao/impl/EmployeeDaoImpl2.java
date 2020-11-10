package com.cisco.dtag.dao.impl;

import org.springframework.stereotype.Repository;

import com.cisco.dtag.dao.EmployeeDao;

@Repository("dao2")
public class EmployeeDaoImpl2 implements EmployeeDao {

	public void saveData() {
		System.out.println("DtagDaoImpl2");
	}

}
